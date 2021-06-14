package com.sputik.playground.dao;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
//@Document(value = "person")
@Builder
@AllArgsConstructor
public class Person {

  //    @Id
  private String id;
  private String firstName;
  private String lastName;
  private Integer age;
  private List<Skill> skills;

}
