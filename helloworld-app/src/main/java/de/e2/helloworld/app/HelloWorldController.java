package de.e2.helloworld.app;

@org.springframework.stereotype.Controller
@org.springframework.context.annotation.Description("A controller for handling requests for hello messages")
public class HelloWorldController {
  final private de.e2.helloworld.lib.Greeter greeter;

  public HelloWorldController(de.e2.helloworld.lib.Greeter greeter) {
    this.greeter = greeter;
  }

  @org.springframework.web.bind.annotation.GetMapping("/{name}")
  @org.springframework.web.bind.annotation.ResponseBody
  public java.util.Map<String, String> hello(@org.springframework.web.bind.annotation.PathVariable("name") String name) {
    return java.util.Collections.singletonMap("message", greeter.greet(name));
  }

}
