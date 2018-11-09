package de.e2.helloworld.app;

import static org.junit.jupiter.api.Assertions.*;

@org.junit.jupiter.api.extension.ExtendWith(org.springframework.test.context.junit.jupiter.SpringExtension.class)
@org.springframework.boot.test.context.SpringBootTest(webEnvironment = org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT)
@org.springframework.test.annotation.DirtiesContext
public class HelloWorldIT {

    @org.springframework.beans.factory.annotation.Autowired
    private HelloWorldController helloWorldController;

    @org.junit.jupiter.api.Test
    public void helloMessage() {
        java.util.Map<String, String> helloMessage = helloWorldController.hello("Rene");
        assertAll("message",
                () -> assertEquals(helloMessage.keySet().size(), 1),
                () -> assertTrue(helloMessage.keySet().contains("message")),
                () -> assertTrue(helloMessage.get("message").contains("Rene"))
        );
    }

}
