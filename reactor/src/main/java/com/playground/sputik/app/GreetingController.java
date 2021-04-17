package com.playground.sputik.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;


@RestController
public class GreetingController {

  GreetingWebClient client;
  GreetingService service;

  @GetMapping
  public Mono<String> sayHell() {
    return client.getHello();
  }

}
