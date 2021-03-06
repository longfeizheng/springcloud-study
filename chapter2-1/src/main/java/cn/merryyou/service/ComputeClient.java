package cn.merryyou.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by 11 on 2017/3/22.
 */
@FeignClient(value = "compute-service")
public interface ComputeClient {

    @RequestMapping(value = "/add" , method = RequestMethod.GET)
    Integer add(@RequestParam(value = "a") Integer a , @RequestParam(value = "b") Integer b);
}
