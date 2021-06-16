package com.sputik.jbehave.api.model;

import java.util.Objects;

public final class Person {

  private String name;
  private Integer age;

  public Person(String name, Integer age) {
    this.name = name;
    this.age = age;
  }

  public Person() {
    this("", 0);
  }

  public String getName() {
    return name;
  }

  public Integer getAge() {
    return age;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == this) {
      return true;
    }
    if (obj == null || obj.getClass() != this.getClass()) {
      return false;
    }
    var that = (Person) obj;
    return Objects.equals(this.name, that.name)
           && Objects.equals(this.age, that.age);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, age);
  }

  @Override
  public String toString() {
    return "Person["
           + "name=" + name + ", "
           + "age=" + age + ']';
  }

}
