package ee.abruka.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TereService {
    
    @GetMapping
    public String tere() {
        return "tere!";
    }

}
