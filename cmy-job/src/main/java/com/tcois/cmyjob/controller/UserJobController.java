package com.tcois.cmyjob.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @projectName: cmy-k8s
 * @package: com.tcois.cmyjob.controller
 * @className: UserJobController
 * @author: Terry Cai
 * @description: Job Controller for monitoring user's actions
 * @date: 11/26/23 1:08 PM
 * @version: 1.0
 */

@RestController
@RequestMapping("/api/v1/job/user")
public class UserJobController {

    @GetMapping
    @ApiOperation("Get user's list")
    public void getUserList(){

    }

}
