package com.zaichiyikou.starter.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.zaichiyikou.starter.myHandler.CustomerBlockHandler;
import com.zaichiyikou.starter.pojo.CommonResult;
import com.zaichiyikou.starter.pojo.Payment;

@RestController
public class RateLimitController {
    @RequestMapping(value = "/sentinel/byResource", method = RequestMethod.GET)
    // SentinelResource注解 blockHandler参数指向降级方法的方法名
    @SentinelResource(value = "ByResource", blockHandler = "handleException")
    public CommonResult ByResource() {
        return new CommonResult(200, "按照资源名称限流测试", new Payment(2020l, "serial001"));
    }

    // 这个就是类似于hystirx中的那个command方法指定的降级方法
    public CommonResult handleException(BlockException exception) {
        return new CommonResult(400, exception.getClass().getCanonicalName() + "\t 服务不可用");
    }
    
    // 自定义限流处理类，然后指定处理类，指定处理类中的处理方法
    // 实现自定义和全局统一的处理
    @GetMapping("/rateLimit/customerBlockHandler")
    @SentinelResource(value = "customerBlockHandler",
            blockHandlerClass = CustomerBlockHandler.class,
            blockHandler = "handlerException2") // 这个blockHandler指定了自定义处理类中的handlerException2方法
    public CommonResult customerBlockHandler()
    {
        return new CommonResult(200,"按客戶自定义",new Payment(2020L,"serial002"));
    }
}
