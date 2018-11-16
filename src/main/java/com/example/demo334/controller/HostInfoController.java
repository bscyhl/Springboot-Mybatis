package com.example.demo334.controller;


import com.example.demo334.entity.HostInfo;
import com.example.demo334.service.HostInfoService;
import jdk.nashorn.internal.ir.RuntimeNode;
import org.apache.catalina.Host;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/host")
public class HostInfoController {


    @Resource
    private HostInfoService hostInfoService;
    @RequestMapping("/getHostByIp")
    @ResponseBody
    public HostInfo getHostInfoByIp(HttpServletRequest request){

        String requestStr=request.getParameter("ip");
        HostInfo hostInfo=hostInfoService.getHostInfoByIp(requestStr);
        return hostInfo;
    }
}
