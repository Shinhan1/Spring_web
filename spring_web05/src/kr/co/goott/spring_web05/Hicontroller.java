package kr.co.goott.spring_web05;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class Hicontroller implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		
		String data = request.getParameter("data");
		
		
		
		
		ModelAndView mav = new ModelAndView("hi", "msg", "메시지 전달");
		mav.addObject("data",data);
		
		return mav;
	}

}
