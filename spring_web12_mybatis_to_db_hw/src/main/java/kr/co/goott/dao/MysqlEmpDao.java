package kr.co.goott.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kr.co.goott.dto.EmpDTO;

public class MysqlEmpDao implements EmpDAO {
	
	SqlSession ss;
	
	public void setSs(SqlSession ss) {
		this.ss = ss;
	}
	

	@Override
	public List<EmpDTO> selectAll() {
		return ss.selectList("selectAllEmp");
	}

	@Override
	public EmpDTO selectOne(int no) {
		// TODO Auto-generated method stub
		return ss.selectOne("selectOneEmp", no);
	}

	@Override
	public void insertOne(EmpDTO dto) {
		ss.insert("insertOneEmp", dto);
	}

	@Override
	public void updateOne(EmpDTO dto) {
		ss.update("updateOneEmp", dto);
	}

	@Override
	public void deleteOne(int no) {
		ss.delete("deleteOneEmp", no);
	}

}
