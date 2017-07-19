package spring.web.ch07.ex01.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import spring.web.ch07.ex01.service.XService;

@Controller
@RequestMapping("/ch07/ex01/x")
public class XController {
	@Autowired private XService xService;
	
	@RequestMapping
	public String index(){
		return "ch07/ex01/x";
	}	//첫화면을 보여줌.
	
	@ResponseBody
	@RequestMapping("/good")
	public int good(){
		return xService.good();
	}//단순히 서비스에서 처리한것을 리턴할 뿐이다. json형태로 리턴 이유는 리스폰스 바디가 있기때문

	@ResponseBody
	@RequestMapping("/badWithX")
	public int badWithX(){
		return xService.badWithX();
	}
	
	@ResponseBody
	@RequestMapping("/badNoX")
	public int badNoX(){
		return xService.badNoX();
	}
	
	@ResponseBody
	@RequestMapping("/badService")
	public int badService(){
		return xService.badService();
	}
	
	@ResponseBody
	@RequestMapping("/listNums")
	public List<Integer> listNums(){
		return xService.listNums();
	}
}