package springboot_test.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.UUID;

@Controller
@ResponseBody
public class HelloControllrt {
    @RequestMapping("/hello")
    public String hello(){
        return "SUCCESS" ;
    }


    @RequestMapping("/sunshine")
    public String test(){
        return "success";
    }
}
