package spring_web07_controller_anno_hw;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ViewMenuController {
	
	@RequestMapping(value = "viewData.do")
	public ModelAndView show(HttpServletRequest req) {
		return new ModelAndView("view", "data", req.getParameter("message"));
	}
	
	@RequestMapping(value = "viewData2.do")
	public String show2(HttpServletRequest req) {
		
		String data = req.getParameter("message");
		
		req.setAttribute("data2", data);
		
		return "view";
	}

}
