package com.sputik.jbehave.api.model;

public final class SharedContext {

  private SharedContext() {
  }

  private static final ThreadLocal<Person> local = new ContextLocal();

  public static Person getSharedContext() {
    return local.get();
  }

  public static void clearSharedContext() {
    local.remove();
  }

  static final class ContextLocal extends ThreadLocal<Person> {

    @Override
    protected Person initialValue() {
      return new Person();
    }
  }
}
