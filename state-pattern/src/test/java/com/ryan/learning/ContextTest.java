package com.ryan.learning;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContextTest {

  @Test
  void request() {
    Context context = new Context();

    State stateA = new StateA();
    context.changeState(stateA);
    context.request();
    assertEquals(stateA, context.getState());

    State stateB = new StateB();
    context.changeState(stateB);
    context.request();
    assertEquals(stateB, context.getState());
  }
}