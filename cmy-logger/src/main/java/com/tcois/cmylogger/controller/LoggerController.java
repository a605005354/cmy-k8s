package com.tcois.cmylogger.controller;

import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @projectName: cmy-k8s
 * @package: com.tcois.cmylogger.controller
 * @className: LoggerController
 * @author: Terry Cai
 * @description: Controller for logger
 * @date: 11/29/23 2:27 PM
 * @version: 1.0
 */

@RestController
@RequestMapping("/api/v1/logger/logger/")
@Slf4j
public class LoggerController {

    @Resource
    private KafkaTemplate<String, String> kafkaTemplate;

    @GetMapping("/applog")
    public String test(@RequestParam("param") String jsonStr){

//        System.out.println(jsonStr);
 
        log.info(jsonStr);

        kafkaTemplate.send("ods_base_log", jsonStr);

        return "success";
    }

}
