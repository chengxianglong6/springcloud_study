package cn.springcloud;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value="eurekaclient",fallback = SayHiServiceHystrix.class)
public interface SayHiService {

    @RequestMapping("hi")
    String sayHi(@RequestParam("name") String name);
}
