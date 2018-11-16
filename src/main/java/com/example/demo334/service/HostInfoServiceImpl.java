package com.example.demo334.service;

import com.example.demo334.dao.HostInfoMapper;
import com.example.demo334.entity.HostInfo;
import com.example.demo334.entity.HostInfoExample;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service(value="hostInfoService")
public class HostInfoServiceImpl implements HostInfoService{

    @Resource
    private HostInfoMapper hostInfoMapper;

    public HostInfo getHostInfoByIp(String hostIp){

        HostInfoExample example = new HostInfoExample();
        HostInfoExample.Criteria criteria;
        criteria=example.createCriteria();

//        criteria.andHostIpEqualTo(hostIp);

        criteria.andHostNameEqualTo(hostIp);

        List<HostInfo> resultHostInfo = hostInfoMapper.selectByExample(example);
        return resultHostInfo.get(0);
    }



}
