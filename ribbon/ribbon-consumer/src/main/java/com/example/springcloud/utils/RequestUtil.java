package com.example.springcloud.utils;

import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * @author zh
 * @date 2021/7/14 11:20
 */
public class RequestUtil {

    /**
     * 获取当前请求
     *
     * @return HttpServletRequest 如果没有绑定会返回null
     */
    public static HttpServletRequest getRequest() {
        RequestAttributes requestAttributes = RequestContextHolder.getRequestAttributes();
        if (requestAttributes == null) {
            return null;
        }
        if (requestAttributes instanceof ServletRequestAttributes) {
            ServletRequestAttributes servletRequestAttributes = (ServletRequestAttributes)requestAttributes;
            return servletRequestAttributes.getRequest();
        } else {
            return null;
        }
    }

    /**
     * 获取请求url
     *
     * @return
     */
    public static String getRequestUrl() {
        HttpServletRequest request = RequestUtil.getRequest();
        if (request == null) {
            return null;
        }

        return request.getServletPath();
    }

    /**
     * 返回简略请求信息
     *
     * @param request  request
     * @return 简略请求信息
     */
    public static String getSimpleRequest(HttpServletRequest request) {
        return request.getMethod() + " " + request.getServletPath();
    }

    /**
     * 返回简略请求信息
     *
     * @return 简略请求信息
     */
    public static String getSimpleRequest() {
        HttpServletRequest request = getRequest();
        if (request == null) {
            return null;
        }
        return request.getMethod() + " " + request.getServletPath();
    }


}
