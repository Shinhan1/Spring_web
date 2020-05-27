package ko.co.goott;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SurveyController {
	@RequestMapping(value = "/survey/survey.choose")
	public String processStep1() {
		return "surveyForm";
	}
	
	@RequestMapping(value = "/survey/survey.ok")
	public String processStep2(HttpServletRequest req) {
		String[] img = req.getParameterValues("ck");
		
		if(img == null) {
			return "surveyForm";
		}else {
			req.setAttribute("img", img);
			return "surveySubmitted";
		}
		
	}
	
}
