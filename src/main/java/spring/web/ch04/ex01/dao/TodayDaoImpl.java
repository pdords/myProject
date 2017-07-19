package spring.web.ch04.ex01.dao;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import spring.web.ch04.ex01.dao.mapper.TodayMapper;

@Repository
public class TodayDaoImpl implements TodayDao{
	@Autowired private TodayMapper todayMapper;
	
	public Date getCurrentDate(){
		return todayMapper.getCurrentDate();
	}
}
//autowired를 이용하면 생성자가 필요가 없다.