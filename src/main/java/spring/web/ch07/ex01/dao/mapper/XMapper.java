package spring.web.ch07.ex01.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

public interface XMapper {
	@Insert("insert into x values(x_seq.nextval)")
	int addNext();
	
	@Insert("insert into x values(x_seq.currval)")
	int addCurr();
	
	@Select("select x from x order by x")
	List<Integer> getRows();
}