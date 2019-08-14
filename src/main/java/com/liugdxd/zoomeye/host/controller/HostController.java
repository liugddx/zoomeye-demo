package com.liugdxd.zoomeye.host.controller;

import com.alibaba.fastjson.JSON;
import com.liugdxd.zoomeye.common.ZoomeyeConstant;
import com.liugdxd.zoomeye.common.controller.util.CommonResult;
import com.liugdxd.zoomeye.common.controller.util.TokenHelper;
import com.liugdxd.zoomeye.es.bo.ZoomeyeData;
import com.liugdxd.zoomeye.service.IZoomeyeService;
import com.liugdxd.zoomeye.util.OKHttpUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import okhttp3.Headers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author  liugd
 */
@Controller
@RequestMapping("/host")
@Api(value = "HostController|redis数据收集")
public class HostController {

    private static final String QUERY = "/host/search";

    @Autowired
    private IZoomeyeService zoomeyeService;

    @ApiOperation("查询数据")
    @GetMapping("/search")
    @ResponseBody
    public CommonResult search4data(@ApiParam(value = "查询条件", required = true) @RequestParam(value = "query") String query){
        String response = "";
        try {

            Headers headers = new Headers.Builder().add("Authorization", "JWT " + TokenHelper.getInstance().getToken()).build();
            response = OKHttpUtil.getInstance().executeGetHttpConn(ZoomeyeConstant.COMMON_URL+QUERY+"?query="+query,headers);
        } catch (Exception e) {
            return CommonResult.failed("查询失败");
        }

        ZoomeyeData zoomeyeData = JSON.parseObject(response, ZoomeyeData.class);

        return CommonResult.success(zoomeyeService.bathSave(zoomeyeData.getMatches()));
    }


}
