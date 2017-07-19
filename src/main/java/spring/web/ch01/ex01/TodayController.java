package spring.web.ch01.ex01;

import java.time.LocalDate;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TodayController {
	@RequestMapping("/")	//리퀘스트가 전달되면 아래값들이 실행될수 있게한다.
	public String home(Model model){
		LocalDate date = LocalDate.now();
		model.addAttribute("today",date);
		return "ch01/ex01/today";
		//suffix의 .jsp 앞에 붙여지는 값이 된다.
	}
}	//main.jsp가 필요가 없어진다. 그냥 /만 붙이면 나머지가 알아서 부여저서 실행 가능해진다.