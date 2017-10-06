package de.e2.helloworld.lib;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class GreeterTest {

  @Test
  public void greet() {
    Greeter greeter = new Greeter();
    String message = greeter.greet("Rene");

    Assert.assertThat(message, CoreMatchers.endsWith("Rene"));
  }

}
