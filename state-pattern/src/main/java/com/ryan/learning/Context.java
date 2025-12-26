package com.ryan.learning;

import lombok.Getter;

@Getter
public class Context {
  private State state;

  public Context() {
    state = null;
  }

  public void changeState(State state) {
    this.state = state;
  }

  public void execute() {
    if (state != null) {
      state.execute(this);
    }
  }
}
