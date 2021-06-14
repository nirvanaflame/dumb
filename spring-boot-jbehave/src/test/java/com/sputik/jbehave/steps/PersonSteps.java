package com.sputik.jbehave.steps;

import static com.sputik.jbehave.api.model.SharedContext.getSharedContext;
import static org.assertj.core.api.Assertions.assertThat;

import com.sputik.jbehave.api.model.Person;
import com.sputik.jbehave.api.model.SharedContext;
import com.sputik.jbehave.client.PersonWebClient;
import lombok.SneakyThrows;
import org.jbehave.core.annotations.AfterStory;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PersonSteps {

    @Autowired
    PersonWebClient client;

    @AfterStory
    void cleanContext() {
        SharedContext.clearSharedContext();
    }

    @Given("person with name $name")
    public void givenPerson(@Named("name") String name) {
        Person sharedContext = getSharedContext();
        sharedContext.setName(name);
    }

    @SneakyThrows
    @When("call client with name")
    public void callClient() {
        Person response = client.getPersonByName(getSharedContext().getName());
        getSharedContext().setName(response.getName());
        getSharedContext().setAge(response.getAge());
    }

    @Then("verify person name $name and age $age")
    public void verifyPerson(@Named("name") String name, @Named("age") Integer age) {
        assertThat(getSharedContext().getName()).isEqualTo(name);
        assertThat(getSharedContext().getAge()).isEqualTo(age);
    }
}
