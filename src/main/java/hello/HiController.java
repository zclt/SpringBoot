package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HiController {

  @RequestMapping("/hi")
  public String index() {
    return "<strong>Hi!</strong>";
  }

}