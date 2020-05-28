package kr.co.goott.dao;

import java.util.List;

import kr.co.goott.dto.EmpDTO;

public interface EmpDAO {
	public List<EmpDTO> selectAll();
	public EmpDTO selectOne(int no);
	public void insertOne(EmpDTO dto);
	public void updateOne(EmpDTO dto);
	public void deleteOne(int no);
}
