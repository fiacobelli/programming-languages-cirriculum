// borrowed from here: https://projects.spring.io/spring-boot/#quick-start
package hello;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
@EnableAutoConfiguration
public class SampleController {

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World!";
    }

    @RequestMapping("/add")
    @ResponseBody
    Answer add(int lhs, int rhs) {
        return new Answer(lhs+rhs);
    }

    @RequestMapping("/subtract")
    @ResponseBody
    Answer subtract(int lhs, int rhs) {
        return new Answer(lhs-rhs);
    }

    @RequestMapping("/multiply")
    @ResponseBody
    Answer multiply(int lhs, int rhs) {
        return new Answer(lhs*rhs);
    }

    @RequestMapping("/divide")
    @ResponseBody
    Answer divide(int lhs, int rhs) {
        return new Answer(  (float)lhs  / (float)rhs);
    }

    private class Answer{

      private float answer;

      public Answer(float answer)
      {
        setAnswer(answer);
      }

      public float getAnswer()
      {
        return this.answer;
      }

      public void setAnswer(float answer)
      {
        this.answer = answer;
      }

    }
    public static void main(String[] args) throws Exception {
        SpringApplication.run(SampleController.class, args);
    }
}
