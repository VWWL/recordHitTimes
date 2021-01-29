package org.example.controller;

import lombok.SneakyThrows;
import org.example.po.HitPoint;
import org.example.service.HitPointService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author wangweili
 * @version 1.0
 * @date 2021/1/25 5:53 下午
 */
@Controller
public class HitPointController {

    @Autowired
    private HitPointService hitPointService;

    @GetMapping("/")
    @SneakyThrows
    public void recordHitTimes(HttpServletRequest request, HttpServletResponse response) {
        HitPoint hitPoint = new HitPoint();
        hitPoint.setIpAddress(request.getRemoteAddr());
        Integer integer = hitPointService.recordHitTimes(hitPoint);
        response.setContentType("text/html;charset=utf-8");
        response.getWriter().write("<h1>您访问了帅到没朋友到王唯力的页面" + integer + "次</h1>");
    }
}
