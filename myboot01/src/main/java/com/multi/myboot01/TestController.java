package com.multi.myboot01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
	// JSP 페이지 없이 답 문서 body에 출력
	@ResponseBody
	@RequestMapping("/")
	public String home() {
		return "hello boot!";
	}
}
