package spring.web.ch04.ex02.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.web.ch04.ex02.dao.HRDao;
import spring.web.ch04.ex02.domain.Employee;

@Service
public class HRServiceImpl implements HRService {
	@Autowired private HRDao hrDao;
	
	public Employee viewEmpCnt(){
		return hrDao.getEmpCnt();
	}
}
