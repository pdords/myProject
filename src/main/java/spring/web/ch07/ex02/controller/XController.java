package spring.web.ch07.ex02.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import spring.web.ch07.ex02.service.XService;

@Controller("ch07.ex02.XController")
@RequestMapping("/ch07/ex02/x")
public class XController {
	@Autowired private XService xService;
	
	@RequestMapping
	public void main(){}
	
	@RequestMapping("/good")
	@ResponseBody
	public int good(){
		return xService.good();
	}
	
	@RequestMapping("/bad")
	@ResponseBody
	public int bad(){
		return xService.bad();
	}
	
	@RequestMapping("/badWithX")
	@ResponseBody
	public int badWithX(){
		return xService.badWithX();
	}
}