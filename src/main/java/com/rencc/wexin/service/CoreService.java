package com.rencc.wexin.service;

import javax.servlet.http.HttpServletRequest;

/**
 * com.rencc.wexin.service
 *
 * @Project: wexin
 * @Author: rencc
 * @Description: 核心服务接口
 * @Date: Created in 2017/9/19 16:54
 */
public interface CoreService {
    String processRequest(HttpServletRequest request) ;
}
