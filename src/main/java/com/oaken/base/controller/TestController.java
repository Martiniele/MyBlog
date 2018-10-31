package com.oaken.base.controller;


import com.alibaba.fastjson.JSON;
import com.oaken.base.entity.SysLog;
import com.oaken.base.entity.SysView;
import com.oaken.base.entity.model.Province;
import com.oaken.base.service.TestService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

@RestController
@RequestMapping("/")
public class TestController {
    @Autowired
    TestService testService;

    /**
     * 测试一
     *
     * @return
     */
    @ApiOperation("测试接口1")
    @GetMapping("/test1")
    public List<Province.ProvinceBean> listAllLog() {
        List<Province> provinceList = new LinkedList<>();
        testService.PrintSth(provinceList);
        List<Province.ProvinceBean> bean = new ArrayList<>();
        provinceList.forEach(it -> {
            if (it.getCountry().equals("english")) {
                bean.addAll(it.getProvince());
            }
        });
        return bean;
    }

    /**
     * 返回所有的系统浏览记录信息
     *
     * @return
     */
    @ApiOperation("测试接口2")
    @GetMapping("/test2")
    public Province listAllView() {
        String json2 = "{\"name\":\"china\",\"province\":\"guangxi\",\"city\":[{\"name\":\"nanning\"},{\"name\":\"hechi\"}]}";
        Province province = JSON.parseObject(json2, Province.class);
        return province;
    }
}
