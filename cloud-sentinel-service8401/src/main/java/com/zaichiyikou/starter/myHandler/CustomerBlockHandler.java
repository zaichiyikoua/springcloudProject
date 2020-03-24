package com.zaichiyikou.starter.myHandler;

import org.springframework.stereotype.Component;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.zaichiyikou.starter.pojo.CommonResult;

//自定义限流处理类
@Component
public class CustomerBlockHandler {
    public static CommonResult handleException(BlockException exception) {
        return new CommonResult(400, "自定义的限流处理类.....");
    }
    public static CommonResult handleException2(BlockException exception) {
        return new CommonResult(400, "自定义的限流处理类2.....");
    }
}
