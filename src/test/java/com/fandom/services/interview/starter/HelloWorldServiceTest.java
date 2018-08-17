package com.fandom.services.interview.starter;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HelloWorldServiceTest {

  HelloWorldService helloWorldService = new HelloWorldService();

  @Test
  public void hello_candidate() {
    assertEquals("Hello candidate!", helloWorldService.hello("candidate"));
  }
}
