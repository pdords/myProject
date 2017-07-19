package spring.web.ch07.ex01.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import spring.web.ch07.ex01.dao.mapper.XMapper;

@Repository
public class XDaoImpl implements XDao{
	@Autowired private XMapper xMapper;
	
	public int addNext(){
		return xMapper.addNext();
	}
	
	public int addCurr(){
		return xMapper.addCurr();
	}
	
	public List<Integer> getRows(){
		return xMapper.getRows();
	}
}