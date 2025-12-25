package com.ryan.learning;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class StateB implements State{

  @Override
  public void doAction(Context context) {
    log.info("State B is performing its action.");
    context.changeState(this);
  }
}
