package kr.co.goott.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.goott.dao.EmpDAO;
import kr.co.goott.dto.EmpDTO;

@Controller
public class EmpController {
	
	@Autowired
	EmpDAO dao;
	
	public void setDao(EmpDAO dao) {
		this.dao = dao;
	}
	
	@RequestMapping(value = "/*")
	public String list(Model model) {
		List<EmpDTO> list = dao.selectAll();
		
		model.addAttribute("list", list);
		
		return "list";
	}
	
	@RequestMapping(value = "/insert")
	public String processStep2() {
		return "insertForm";
	}
	
	@RequestMapping(value = "/insertOk")
	public String processStep3(@ModelAttribute EmpDTO dto) {
		dao.insertOne(dto);
		
		return "redirect:/empList";
	}
	
	
	
	
	
	
	
	
	
}
