package com.playground.sputik.model;

import java.util.Objects;

public final class User {

  private final String username;
  private final String firstName;
  private final String lastName;

  public User(String username, String firstName, String lastName) {
    this.username = username;
    this.firstName = firstName;
    this.lastName = lastName;
  }

  public String username() { return username; }

  public String firstName() { return firstName; }

  public String lastName() { return lastName; }

  @Override
  public boolean equals(Object obj) {
    if (obj == this) {
      return true;
    }
    if (obj == null || obj.getClass() != this.getClass()) {
      return false;
    }
    var that = (User) obj;
    return Objects.equals(this.username, that.username) && Objects.equals(this.firstName,
                                                                          that.firstName) && Objects
               .equals(this.lastName, that.lastName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(username, firstName, lastName);
  }

  @Override
  public String toString() {
    return "User[" + "username=" + username + ", " + "firstName=" + firstName + ", " + "lastName="
           + lastName + ']';
  }


}
