package spring.web.ch07.ex02.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("ch07.ex02.XServiceImpl")
public class XServiceImpl implements XService{
	@Transactional
	public int good(){
		return 1;		
	}
	
	public int bad(){
		return 3/0;
	}
	
	@Transactional
	public int badWithX(){
		return 3/0;
	}
}