package com.ryan.learning;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RunningState implements State{

  @Override
  public void execute(Context context) {
    log.info("State: Running. Transitioning to Success|Fail State.");
    // Simulate some processing logic
    boolean isSuccess = Math.random() > 0.5;
    if (isSuccess) {
      context.changeState(new SuccessState());
    } else {
      context.changeState(new FailState());
    }
  }
}
