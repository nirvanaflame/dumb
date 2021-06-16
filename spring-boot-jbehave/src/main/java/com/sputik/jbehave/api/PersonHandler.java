package com.sputik.jbehave.api;

import com.sputik.jbehave.api.model.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class PersonHandler {

  private static final Logger log = LoggerFactory.getLogger(PersonHandler.class);

  @GetMapping("person/Alex}")
  public ResponseEntity<Person> getAlex() {
    log.info("Call getPerson()!");
    return ResponseEntity.ok().contentType(MediaType.APPLICATION_JSON).body(new Person("Alex", 23));
  }

  @GetMapping("person/**}")
  public ResponseEntity<Person> getEugen() {
    log.info("Call getPerson()!");
    return ResponseEntity.ok().contentType(MediaType.APPLICATION_JSON)
        .body(new Person("Eugen", 23));
  }
}
