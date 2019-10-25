package com.spring.boot.mybatisplus.service;

import com.alibaba.fastjson.JSONObject;
import com.spring.boot.mybatisplus.entity.PlatformSalaryItemDefinition;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class IPlatformSalaryItemDefinitionServiceTest {
    @Autowired
    private IPlatformSalaryItemDefinitionService platformSalaryItemDefinitionService;

    @Test
    public void test() {
        PlatformSalaryItemDefinition platformSalaryItemDefinition = platformSalaryItemDefinitionService.getById(2243);
        System.out.println(JSONObject.toJSONString(platformSalaryItemDefinition));
    }
}
