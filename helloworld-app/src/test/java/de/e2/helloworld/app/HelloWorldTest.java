package de.e2.helloworld.app;

import static org.junit.jupiter.api.Assertions.*;

public class HelloWorldTest {
    @org.junit.jupiter.api.Test
    public void helloMessage() {
        de.e2.helloworld.lib.Greeter greeter = new de.e2.helloworld.lib.Greeter();
        HelloWorldController controller = new HelloWorldController(greeter);

        java.util.Map<String, String> helloMessage = controller.hello("Rene");
        assertAll("message",
                () -> assertEquals(helloMessage.keySet().size(), 1),
                () -> assertTrue(helloMessage.keySet().contains("message")),
                () -> assertTrue(helloMessage.get("message").contains("Rene"))
        );
    }
}
