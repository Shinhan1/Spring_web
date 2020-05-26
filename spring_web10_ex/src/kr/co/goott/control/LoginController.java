package kr.co.goott.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {
	@RequestMapping(value = "/member/login.do", method = RequestMethod.GET)
	public String loginProcess1() {
		return "login/login";
	}
	
//	@RequestMapping(value = "/member/login.do", method = RequestMethod.POST)
//	public String loginProcess2() {
//		return "login/login";
//	}
	
	
	
}
