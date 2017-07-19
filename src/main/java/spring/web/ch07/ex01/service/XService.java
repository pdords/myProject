package spring.web.ch07.ex01.service;

import java.util.List;

public interface XService {
	int good();			//정상흐름
	int badWithX();		//비정상흐름
	int badNoX();
	int badService();	//서비스중 에러
	List<Integer> listNums();
}