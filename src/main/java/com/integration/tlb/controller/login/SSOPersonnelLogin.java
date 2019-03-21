package com.integration.tlb.controller.login;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SSOPersonnelLogin {
	
	private static Logger logger = LoggerFactory.getLogger(SSOPersonnelLogin.class);
	
	@RequestMapping("/login.do")
	public String hellow() {
		logger.info("进入{}",SSOPersonnelLogin.class);
		return "personnelLogin";
	}
}
