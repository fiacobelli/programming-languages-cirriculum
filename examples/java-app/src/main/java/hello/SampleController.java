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

    @RequestMapping("/rest/test/")
    @ResponseBody
    RestTestData restTest() {
        return new RestTestData("He there from the REST service!");
    }

    private class RestTestData{

      private String data;

      public RestTestData(String data)
      {
        setData(data);
      }

      public String getData()
      {
        return this.data;
      }

      public void setData(String data)
      {
        this.data = data;
      }

    }
    public static void main(String[] args) throws Exception {
        SpringApplication.run(SampleController.class, args);
    }
}
