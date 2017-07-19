package spring.web.ch04.ex02.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import spring.web.ch04.ex02.domain.Employee;
import spring.web.ch04.ex02.service.HRService;

@Controller
@RequestMapping("/ch04/ex02")
public class HRController {
	@Autowired private HRService hrService;
	
	@RequestMapping("/hr")
	public @ModelAttribute("emp") Employee hrCnt(){
		return hrService.viewEmpCnt();
	}
}
//서비스의 객체를 받아서 컨트롤러에 투입시킨다. (DI)