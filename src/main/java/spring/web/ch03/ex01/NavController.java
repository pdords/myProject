package spring.web.ch03.ex01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ch03/ex01")
public class NavController {
	@RequestMapping("/forward")
	public String forward(){
		return "forward:forward/target";
	}
	
	@RequestMapping("/forward/target")
	public String target(){
		return "ch03/ex01/forward";
	}
	
	@RequestMapping("/redirect")
	public String second(){
		return "redirect:redirect/target";
	}
	
	@RequestMapping("/redirect/target")
	public String target2(){
		return "ch03/ex01/redirect";
	}
}//jsp forward방식과 redirect 방식을 spring에서 적용하는 방법.
//자동으로 타겟으로 연결이 가능.