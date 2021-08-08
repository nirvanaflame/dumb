package com.sputik.jbehave;

import java.text.SimpleDateFormat;
import java.util.List;
import javax.annotation.PostConstruct;
import org.jbehave.core.configuration.MostUsefulConfiguration;
import org.jbehave.core.embedder.Embedder;
import org.jbehave.core.embedder.EmbedderControls;
import org.jbehave.core.failures.PassingUponPendingStep;
import org.jbehave.core.io.CodeLocations;
import org.jbehave.core.io.LoadFromClasspath;
import org.jbehave.core.io.StoryFinder;
import org.jbehave.core.junit.JUnitStories;
import org.jbehave.core.model.ExamplesTableFactory;
import org.jbehave.core.model.TableParsers;
import org.jbehave.core.model.TableTransformers;
import org.jbehave.core.reporters.CrossReference;
import org.jbehave.core.reporters.Format;
import org.jbehave.core.reporters.PrintStreamStepdocReporter;
import org.jbehave.core.reporters.StoryReporterBuilder;
import org.jbehave.core.steps.InjectableStepsFactory;
import org.jbehave.core.steps.ParameterControls;
import org.jbehave.core.steps.ParameterConverters;
import org.jbehave.core.steps.ParameterConverters.ExamplesTableConverter;
import org.jbehave.core.steps.SilentStepMonitor;
import org.jbehave.core.steps.spring.SpringStepsFactory;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = {ApplicationToTest.class})
public class TestRunner extends JUnitStories {

  @Autowired private ApplicationContext applicationContext;

  public TestRunner() {
    Class<?> thisClass = this.getClass();
    useConfiguration(new MostUsefulConfiguration().useStoryLoader(
            new LoadFromClasspath(thisClass.getClassLoader()))
                         .usePendingStepStrategy(new PassingUponPendingStep())
                         .useStepdocReporter(new PrintStreamStepdocReporter())
                         .useStoryReporterBuilder(getStoryReporterBuilder(thisClass))
                         .useParameterConverters(getParameterConverters())
                         .useStepMonitor(new SilentStepMonitor()));
  }

  @PostConstruct
  public void initialize() {
    Embedder embedder = new Embedder();
    embedder.useEmbedderControls(embedderControls());
    useEmbedder(embedder);
  }

  private EmbedderControls embedderControls() {
    return new EmbedderControls().doIgnoreFailureInStories(true).doVerboseFailures(true)
        .useStoryTimeouts("2000").useThreads(8);
  }

  private ExamplesTableFactory createExampleTableFactory() {
    return new ExamplesTableFactory(resourcePath -> "sad", new ParameterConverters(),
                                    new ParameterControls(), new TableParsers(),
                                    new TableTransformers());
  }

  private ParameterConverters getParameterConverters() {
    return new ParameterConverters().addConverters(
        new ParameterConverters.DateConverter(new SimpleDateFormat("yyyy-MM-dd")),
        new ExamplesTableConverter(createExampleTableFactory()));
  }

  private StoryReporterBuilder getStoryReporterBuilder(Class<?> thisClass) {
    return new StoryReporterBuilder().withCodeLocation(
            CodeLocations.codeLocationFromClass(thisClass))
        .withFormats(Format.CONSOLE, Format.TXT, Format.HTML, Format.XML, Format.STATS)
        .withCrossReference(new CrossReference()).withFailureTrace(true);
  }

  @Override
  public InjectableStepsFactory stepsFactory() {
    return new SpringStepsFactory(configuration(), applicationContext);
  }

  protected List<String> storyPaths() {
    return new StoryFinder().findPaths(CodeLocations.codeLocationFromClass(this.getClass()),
                                       "**/Test.story", "**/excluded*.story");
  }

}
