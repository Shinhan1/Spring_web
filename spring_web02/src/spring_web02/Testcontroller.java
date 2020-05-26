package spring_web02;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class Testcontroller implements Controller {
	
	
	
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("test1", "데이터가 잘 넘어가나~");	//data
		mav.setViewName("hi"); 	//view name
		
		return mav;
	}
	
}
