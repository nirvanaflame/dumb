package com.sputik.jbehave.api;

import org.springframework.stereotype.Service;

@Service
public class ApplicationService {
  public int multiply(int x, int y) {
    return x * y;
  }
}
