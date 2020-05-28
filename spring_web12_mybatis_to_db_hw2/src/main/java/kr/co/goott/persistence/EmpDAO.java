package kr.co.goott.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;

import kr.co.goott.domain.EmpDTO;

public class EmpDAO implements DAO{
	
	@Inject
	SqlSession ss;
	
	public void setSs(SqlSession ss) {
		this.ss = ss;
	}
	
	@Override
	public List<EmpDTO> selectAll() {
		// TODO Auto-generated method stub
		return ss.selectList("selectAllEmp");
	}

}
