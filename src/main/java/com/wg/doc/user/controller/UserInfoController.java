package com.wg.doc.user.controller;


import com.wg.doc.user.service.UserInfoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@Api(value = "USER_INFO", tags = { "USER_INFO" })
@RestController
@RequestMapping("/user")
public class UserInfoController {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserInfoController.class);

    @Autowired
    private UserInfoService userInfoService;

    @GetMapping("/customer/age")
    @ApiOperation(value="停车场数据每小时汇报", notes="停车场数据每小时汇报")
    public Map<String,Object> getCustomerByAge() {


        return null;
    }

}
