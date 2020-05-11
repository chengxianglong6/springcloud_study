package cn.springcloud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @Autowired
    SayHiService sayHiService;

    @RequestMapping("hi")
    public String sayHi(@RequestParam String name){
        return sayHiService.sayHi(name);
    }
}
