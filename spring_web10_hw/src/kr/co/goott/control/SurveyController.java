package kr.co.goott.control;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class SurveyController {
	
	@RequestMapping("/survey/survey.choose")
	public String selectOne() {
		return "surveyForm";
	}
	
	@RequestMapping("/survey/survey.ok")
	public String selectedOne(HttpServletRequest req) {
		
		String name = req.getParameter("rd");
//		System.out.println(name);
		
//		model.addAttribute("name", name);
		req.setAttribute("name", name);
		
		return "surveySubmitted";
	}
	
	
}
