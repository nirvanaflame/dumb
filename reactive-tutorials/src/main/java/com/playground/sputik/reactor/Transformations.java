package com.playground.sputik.reactor;

import com.playground.sputik.model.User;
import java.util.Objects;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class Transformations {

  Mono<User> capitalizeOne(Mono<User> mono) {
    return asyncCapitalizeUser(Objects.requireNonNull(mono.block()));
  }

  Flux<User> capitalizeMany(Flux<User> flux) {
    return flux.map(this::asyncCapitalizeUser)
        .map(Mono::block);
  }

  Mono<User> asyncCapitalizeUser(User user) {
    return Mono.just(new User(user.username()
        .toUpperCase(),
        user.firstName()
            .toUpperCase(),
        user.lastName()
            .toUpperCase()));
  }
}
