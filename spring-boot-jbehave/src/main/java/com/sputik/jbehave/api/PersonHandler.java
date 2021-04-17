package com.sputik.jbehave.api;

import com.sputik.jbehave.api.model.Person;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController("/")
public class PersonHandler {

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
