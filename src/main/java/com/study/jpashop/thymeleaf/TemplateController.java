package com.study.jpashop.thymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/template")
public class TemplateController {
    @GetMapping("/fragment")
    public String template() {
        return "thymeleaf/template/fragment/fragmentMain";
    }

    @GetMapping("/layout")
    public String layout() {
        return "thymeleaf/template/layout/layoutMain";
    }

    /**
     * html 전체에 템플릿 레이아웃 적용
     */
    @GetMapping("/layoutExtend")
    public String layoutExtends() {
        return  "thymeleaf/template/layoutExtend/layoutExtendMain";
    }
}
