package spring_web08_db;

import javax.servlet.http.HttpServletRequest;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller		// 한 컨트롤러로 여러가지 주소를 받을 수 있도록 Annotation 설정
public class DaoController {
	
	@RequestMapping(value = "list.do")
	public ModelAndView show() {
		return new ModelAndView("list", "list", "DB에서 데이터가 넘어왔음");
	}
	
	@RequestMapping(value = "view.do")
	public String view(HttpServletRequest req) {
		String data = req.getParameter("no");
		// int deptno = Integer.parseInt(data);
		// dao.selectOne(deptno); => 조회 후 결과 리턴
		
		req.setAttribute("dataOne", data);
		
		return "view";
	}
	
	@RequestMapping(value = "insert.do")
	public ModelAndView insert() {
		return new ModelAndView("insertData", "vo", "DeptDTO");
	}
	
	
}
