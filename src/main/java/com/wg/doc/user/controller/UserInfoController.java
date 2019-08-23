package com.wg.doc.user.controller;


import com.wg.doc.base.domain.ResultVo;
import com.wg.doc.base.enums.StatusCode;
import com.wg.doc.user.entity.UserInfo;
import com.wg.doc.user.service.UserInfoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Api(value = "USER_INFO", tags = { "USER_INFO" })
@RestController
@RequestMapping("/user")
public class UserInfoController {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserInfoController.class);

    @Autowired
    private UserInfoService userInfoService;

    @GetMapping("/{id}")
    @ApiOperation(value="停车场数据每小时汇报", notes="停车场数据每小时汇报")
    @ApiImplicitParam(paramType = "path", dataType = "Long", name = "id", value = "id", required = true)
    public ResultVo<UserInfo> getCustomerByAge(@PathVariable long id) {
        ResultVo<UserInfo> resultVo = new ResultVo<>();
        resultVo.setData(userInfoService.getUser(id));
        resultVo.setCode(StatusCode.SUCCESS.getCode());
        resultVo.setMsg(StatusCode.SUCCESS.getMessage());
        return resultVo;
    }

}
