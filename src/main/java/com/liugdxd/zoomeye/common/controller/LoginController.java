package com.liugdxd.zoomeye.common.controller;

import cn.hutool.json.JSON;
import cn.hutool.json.JSONUtil;
import com.liugdxd.zoomeye.common.ZoomeyeConstant;
import com.liugdxd.zoomeye.common.controller.dto.LoginDto;
import com.liugdxd.zoomeye.common.controller.util.CommonResult;
import com.liugdxd.zoomeye.common.controller.util.TokenHelper;
import com.liugdxd.zoomeye.util.OKHttpUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <p>@description 登录控制层</p>
 * @author liugd
 * @date 2019/8/12 10:11
 * @version 1.0
 */
@Controller
@RequestMapping("admin")
@Slf4j
@Api(value = "LoginController|登录控制器")
public class LoginController {

    private static final String LOGIN_URL="/user/login";

    @ApiOperation(value="登录", notes="登录获取token")
    @PostMapping("/login")
    @ApiParam(name = "param", value = "登录钟馗之眼")
    @ResponseBody
    public CommonResult  login(@RequestBody LoginDto param){
        String response = "";
        try {
            response = OKHttpUtil.getInstance().executePostHttpConn(ZoomeyeConstant.COMMON_URL+LOGIN_URL, JSONUtil.toJsonStr(param));
            log.info("response is {}",response);
        } catch (Exception e) {
            return CommonResult.failed("调用失败");
        }
        JSON json = JSONUtil.toBean(response, JSON.class);
        log.info("token is {}",(json.getByPath("access_token").toString()));
        TokenHelper.getInstance().setToken(json.getByPath("access_token").toString());
        log.info("test token {}",TokenHelper.getInstance().getToken());
        return CommonResult.success(json);
    }
}
