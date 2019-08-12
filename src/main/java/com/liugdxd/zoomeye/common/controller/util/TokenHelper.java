package com.liugdxd.zoomeye.common.controller.util;

import lombok.Data;

/**
 * <p>@ClassName TokenHelper</p>
 * <p>@description token数据保存</p>
 *
 * @author liugd
 * @version 1.0
 * @date 2019/8/12 13:54
 */
@Data
public class TokenHelper {

    private static final TokenHelper tokenHelper = new TokenHelper();

    private  String token = "";

    private TokenHelper(){

    }

    public static TokenHelper getInstance() {
        return tokenHelper;
    }

}
