package com.playground.sputik.app;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@RestController
public class GreetingHandler {

  public Mono<ServerResponse> hello() {
    return ServerResponse.ok().contentType(MediaType.TEXT_PLAIN)
        .body(BodyInserters.fromValue("Hello, Spring!"));
  }

  public Mono<ServerResponse> getPersonName() {
    return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON).bodyValue("Sergey");
  }
}