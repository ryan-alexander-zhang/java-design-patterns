package com.ryan.learning;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class StateA implements State{

  @Override
  public void doAction() {
    log.info("State A is performing its action.");
  }
}
