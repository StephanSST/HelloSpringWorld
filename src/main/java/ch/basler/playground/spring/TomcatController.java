package ch.basler.playground.spring;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TomcatController {

  @RequestMapping("/version")
  public String showVersion() {
    return "Greetings to Integration Service Team from Spring Boot! v1.0";
  }

}
