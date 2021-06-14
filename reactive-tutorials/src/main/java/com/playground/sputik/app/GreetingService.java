package com.playground.sputik.app;

import java.time.Duration;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.ParallelFlux;
import reactor.core.scheduler.Schedulers;

@Service
public class GreetingService {

  public ParallelFlux<Object> spam() {
    return Flux.create(fluxSink -> {
      long currentTimeMillis = System.currentTimeMillis();
      fluxSink.next(currentTimeMillis);
    })
        .log()
        .sample(Duration.ofSeconds(2))
        .parallel(3)
        .runOn(Schedulers.parallel());
  }

  public Flux<Long> test() {
    return Flux.interval(Duration.ofMillis(100)).take(10);
  }

}
