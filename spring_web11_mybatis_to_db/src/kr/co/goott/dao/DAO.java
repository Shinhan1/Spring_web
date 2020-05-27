package kr.co.goott.dao;

import java.util.List;

import kr.co.goott.dto.DeptDTO;

public interface DAO {
	public List<DeptDTO> selectAll();
	public DeptDTO selectOne(int no);
	public void insertOne(DeptDTO deptDto);
	public void updateOne(DeptDTO deptDto);
	public void deleteOne(int no);
}
