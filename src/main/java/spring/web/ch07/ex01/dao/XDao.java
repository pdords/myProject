package spring.web.ch07.ex01.dao;

import java.util.List;

public interface XDao {
	int addNext();
	int addCurr();
	List<Integer> getRows();
}