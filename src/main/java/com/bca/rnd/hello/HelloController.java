package com.bca.rnd.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/hello")
public class HelloController {

    @GetMapping("")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        return "Hello " + name
                + "<br/>"
                + "Add api/hello?name=test";
    }

}
