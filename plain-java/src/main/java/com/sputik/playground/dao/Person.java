package com.sputik.playground.dao;

import java.util.List;

public record Person(String id, String firsName, String lastName, Integer age,
                     List<Skill> skills) {

}


record Skill(String id, String name) {

}