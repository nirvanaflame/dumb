package com.sputik.jbehave.client;

import com.sputik.jbehave.api.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

@Component
public class PersonWebClient {

  private static final String BASE_URL = "http://localhost:8080";

  private final WebClient client;

  @Autowired
  PersonWebClient() {
    client = WebClient.create(BASE_URL);
  }

  public Person getPersonByName(String name) {
    return client.get().uri(BASE_URL + "/person/" + name)
        .accept(MediaType.APPLICATION_JSON)
        .retrieve()
        .bodyToMono(Person.class)
        .block();
  }
}
