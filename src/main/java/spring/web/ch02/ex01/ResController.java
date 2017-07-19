package spring.web.ch02.ex01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ch02/ex01")
public class ResController {
	@RequestMapping("/img")
	public void image(){}
	//뷰를 리턴하는 메서드들이다.
	//리턴값이 없다면 url이 리턴이된다.
	
	@RequestMapping("/css")
	public void css(){}
	
	@RequestMapping("/js")
	public void js(){}
}
//ch02/ex01/img 가 spring-context.xml에 bean이 받아 /WEP-INF/views/와 .jsp를 붙여준다.
//그리고 그 경로에 알맞는 jsp페이지 값을 출력해서 보여주는 것이다.
//그러므로 주소창에는 풀네임을 다 입력하지 않고 자동으로 할당되어 나오는 값을 볼 수 있는 것이다.