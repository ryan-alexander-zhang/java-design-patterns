package com.ryan.learning;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FailState implements State{

  @Override
  public void execute(Context context) {
    log.info("State: Fail. Process failed.");
  }
}
