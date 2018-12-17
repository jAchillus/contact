package org.cloud.contact.business.transfer.services.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {
    @Value("${book.author}")//获取application.yml文件中名为ip的value值
    private String ip;
    @Value("${book.name}")//获取application.yml文件中名为port的value值,并且自动完成数据类型转换
    private String port;
    @RequestMapping("/config")
    public String config() {
        return "ip:"+ip+",port:"+port;
    }

}
