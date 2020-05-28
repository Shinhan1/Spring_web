package kr.co.goott.persistence;

import java.util.List;

import kr.co.goott.domain.EmpDTO;


public interface DAO {
	public List<EmpDTO> selectAll();
		

}
