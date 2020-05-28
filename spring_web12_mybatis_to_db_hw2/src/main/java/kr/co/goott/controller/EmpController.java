package kr.co.goott.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.goott.domain.EmpDTO;
import kr.co.goott.persistence.DAO;

@Controller
public class EmpController {
	
	@Inject
	DAO dao;
	
	public void setDao(DAO dao) {
		this.dao = dao;
	}
	
	@RequestMapping(value = "/empList")
	public String list(Model model) {
		
		List<EmpDTO> list = dao.selectAll();
		
		model.addAttribute("list", list);
		
		return "listAll";
		
		
	}

}






