package com.sputik.jbehave.api;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class ApplicationServiceTest {

  @Test
  void shouldReturnProductionOfTwo() {
    ApplicationService service = new ApplicationService();
    assertThat(service.multiply(2, 3)).isEqualTo(6);
  }
}