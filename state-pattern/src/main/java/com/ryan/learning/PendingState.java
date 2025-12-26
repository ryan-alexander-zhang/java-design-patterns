package com.ryan.learning;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PendingState implements State{

  @Override
  public void execute(Context context) {
    log.info("State: Pending. Transitioning to Approved State.");
    context.changeState(new RunningState());
  }
}
