package com.playground.sputik.app;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Component
public class GreetingWebClient {

  private final WebClient client;

  GreetingWebClient() {
    this.client = WebClient.create("http://localhost:8080");
  }

  public Mono<String> getHello() {
    return client.get().uri("/hello").accept(MediaType.TEXT_PLAIN)
        .exchangeToMono(res -> res.bodyToMono(String.class));
  }
}