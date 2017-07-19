package spring.web.ch01.ex03;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller("userParamController")	
//예제 2번과 class명 중복 이경우 아이디가 중복된다고 에러메세지가 발생 이를 방지하기 위해 이름값 변경
@RequestMapping("/ch01/ex03")
public class UserController {
	@RequestMapping(value="/user", method = RequestMethod.GET)
	public String in(){
		return "ch01/ex03/userIn";
	}
	
	@RequestMapping(value="/user", method = RequestMethod.POST)
	public String out(User user){
		return "ch01/ex03/userOut";
	}
	//전송방식이 get방식일경우 in 메서드, post방식일경우 out메서드가 실행된다.

}
//@Controller @Service @Repository @Component 중 하나를 IOC방식으로 bean을 생성 이것의 아이디가 할당되는데 이것은 클래스명과같다.
//만약 다른 아이디 값을 주고 싶다면 뒤에("")에 주고싶은 이름값을 주면 된다.