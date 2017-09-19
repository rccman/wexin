package com.rencc.wexin.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;

/**
 * com.rencc.wexin.service
 *
 * @Project: wexin
 * @Author: rencc
 * @Description:
 * @Date: Created in 2017/9/19 16:55
 */
@Service("coreService")
public class CoreServiceImpl implements CoreService {

    private static Logger log = LoggerFactory.getLogger(CoreServiceImpl.class);

    /**
     * 处理微信发送过来的请求（包括事件推送）
     * @param request
     * @return
     */
    @Override
    public String processRequest(HttpServletRequest request) {
        return "";
    }
}
