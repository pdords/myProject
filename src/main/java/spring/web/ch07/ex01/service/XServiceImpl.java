package spring.web.ch07.ex01.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import spring.web.ch07.ex01.dao.XDao;

@Service
public class XServiceImpl implements XService{
	@Autowired private XDao xDao;
	
	@Transactional
	public int good(){
		int cnt = 0;
		cnt += xDao.addNext();
		return cnt;
	}
	
	@Transactional
	public int badWithX(){
		int cnt = 0;
		cnt += xDao.addNext();
		cnt += xDao.addCurr();
		return cnt;
	}
	
	public int badNoX(){
		int cnt = 0;
		cnt += xDao.addNext();
		cnt += xDao.addCurr();
		return cnt;
	}
	
	@Transactional
	public int badService(){
		int cnt = 0;
		cnt += xDao.addNext();
		int tmp = 3/0;
		return cnt;
	}
	
	public List<Integer> listNums(){
		return xDao.getRows();
	}
}
