package com.sputik.jbehave;

import com.sputik.jbehave.api.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class IntegrationTestSession {

  @Autowired
  private ApplicationService applicationService;

  private int x;

  public void setX(int x) {
    this.x = x;
  }

  public int multiply(int y) {
    return applicationService.multiply(x, y);
  }

}
