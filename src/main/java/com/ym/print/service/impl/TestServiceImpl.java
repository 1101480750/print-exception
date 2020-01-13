package com.ym.print.service.impl;

import com.ym.print.components.MessageSourceService;
import com.ym.print.constant.MsgCdConstant;
import com.ym.print.exception.BusinessException;
import com.ym.print.service.TestService;
import com.ym.print.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.expression.Operation;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private MessageSourceService mss;
    @Override
    public void getName(UserVo userVo) {
        if (null == userVo.getUsername()) {
            throw new BusinessException(MsgCdConstant.ALIPAY_AUTHENTICATION_FAIL, mss.getOrigMessage(MsgCdConstant.ALIPAY_AUTHENTICATION_FAIL));
        }
    }
}
