package cn.springcloud;

import org.springframework.stereotype.Component;

@Component
public class SayHiServiceHystrix implements SayHiService {
    @Override
    public String sayHi(String name) {
        return "hi" + name +",error";
    }
}
