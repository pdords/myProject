package spring.web.ch04.ex02.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import spring.web.ch04.ex02.dao.mapper.HRMapper;
import spring.web.ch04.ex02.domain.Employee;

@Repository
public class HRDaoImpl implements HRDao{
	@Autowired private HRMapper hrMapper;
	
	public Employee getEmpCnt(){
		return hrMapper.getEmpCnt();
	}
}