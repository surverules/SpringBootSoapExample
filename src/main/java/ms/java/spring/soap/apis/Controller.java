package ms.java.spring.soap.apis;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/hello")
    public String helloWorld(){
        return "Hello World !!";
    }

}
