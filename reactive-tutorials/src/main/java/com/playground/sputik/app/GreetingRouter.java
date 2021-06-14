package com.playground.sputik.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

@Configuration
public class GreetingRouter {

  @Bean
  public RouterFunction<ServerResponse> greetingRoute(GreetingHandler greetingHandler) {
    return RouterFunctions.route(
        RequestPredicates.GET("/hello").and(RequestPredicates.accept(MediaType.TEXT_PLAIN)),
        request -> greetingHandler.hello());
  }

  @Bean
  public RouterFunction<ServerResponse> getPersonNameRoute(GreetingHandler greetingHandler) {
    return RouterFunctions.route(
        RequestPredicates.GET("/name").and(RequestPredicates.accept(MediaType.APPLICATION_JSON)),
        request -> greetingHandler.getPersonName());
  }
}