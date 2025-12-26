package com.ryan.learning;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContextTest {

  @Test
  void request() {
    Context context = new Context();
    context.changeState(new PendingState());
    context.execute();
    context.execute();
  }
}