package com.playground.sputik.reactor;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

class ProjectReactorTest {

  @Test
  void testFlux() {
    ArrayList<Integer> elements = new ArrayList<>();
    Flux<Integer> just = Flux.just(1, 2, 3, 5);
    just.log().subscribe(elements::add);

    assertThat(elements).hasSize(4);
  }

  @Test
  void testMono() {
    Mono<Integer> just = Mono.just(97);

    StepVerifier.create(just).expectComplete();
  }
}
