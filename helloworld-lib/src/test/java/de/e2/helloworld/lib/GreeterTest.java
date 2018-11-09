package de.e2.helloworld.lib;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class GreeterTest {

    @Test
    public void greet() {
        Greeter greeter = new Greeter();
        String message = greeter.greet("Rene");
        assertTrue(message.endsWith("Rene"));
    }

}
