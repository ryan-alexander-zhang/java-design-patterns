package com.ryan.learning;

import lombok.Getter;

@Getter
public class Context {
  private String extraInfo;
  private State state;

  public Context() {
    extraInfo = "Initial Info";
    state = null;
  }

  public void changeState(State state) {
    this.state = state;
  }

  public void request() {
    if (state != null) {
      state.doAction(this);
    }
  }
}
