package com.liugdxd.zoomeye.common.controller.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * <p>@ClassName LoginDto</p>
 * <p>@description TODO</p>
 *
 * @author liugd
 * @version 1.0
 * @date 2019/8/12 14:19
 */
@Data
@ApiModel(value="登录对象")
public class LoginDto {
    @ApiModelProperty(value="用户名" ,required=true)
    private String username;
    @ApiModelProperty(value="密码" ,required=true)
    private String password;
}
