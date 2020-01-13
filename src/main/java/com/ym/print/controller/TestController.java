package com.ym.print.controller;

import com.ym.print.request.RestRequest;
import com.ym.print.response.RestResponse;
import com.ym.print.service.TestService;
import com.ym.print.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试controller
 * @author zhouyaoming
 */
@RestController
public class TestController {

    @Autowired
    private TestService testService;
    /**
     * 获取名称
     *
     * @param request
     * @return
     * @author wentao
     * @time 2018/03/21
     */
    @RequestMapping(value = "/getName", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public RestResponse listAclSysVersions(@Validated @RequestBody RestRequest<UserVo> request) {
        UserVo userVo = request.getBody();
        testService.getName(userVo);
        return RestResponse.success();
    }
}
