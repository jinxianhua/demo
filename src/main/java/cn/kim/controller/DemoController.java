package cn.kim.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "demo1",tags = "sd")
@RestController
public class DemoController {


    @GetMapping("get")
    @ApiOperation("get")
    public String get(){
        return "demo";
    }
}
