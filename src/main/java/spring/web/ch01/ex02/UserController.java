package spring.web.ch01.ex02;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ch01/ex02")	//모든 메서드들 앞에 붙게되는 url설정은 클래스에 작성.
public class UserController {
	@RequestMapping("/1")
	public String view(){
		return "ch01/ex02/user";	//view만 준비한경우
	}	//아무것도 없는것이 선택되어 화면나오고끝
	
	//view는 url주소가 할당되었을때 찾아갈 폴더명
	//모델은 안의 내용물을 의미한다고 생각 하는것이 편할것.
	@RequestMapping("/2")
	public String content(Model model){
		model.addAttribute("user",new User("최한석",23));
		return "ch01/ex02/user";
	}	//뷰 모델 모두준비 모델을 포함한 화면이 전송
	
	@RequestMapping("/user")
	public User user(@ModelAttribute("user2")User user){
		user.setName("한아름");
		user.setAge(30);
		return user;
	}	//모델만 준비한 경우. 위와 나오는 결과가 같다. 암묵적으로 뷰가 할당되는 것이다.
		//데이터는 하나인데 이름을 여러개 붙여서 복사가 가능한 방법을 보여준다.
		//모델 어트리뷰트에 다른이름을 넣으면 또다른 유저로 복제가 가능하다.
	
	//requestMapping 뒤에 url을 적는다. 리퀘스트매핑에 반드시 붙어있어야 리퀘스트 메서드가된다
	//단, url은 생략이 가능, 생략할경우 클래스에 붙은 url주소가 바로 적용이 된다.
}	//클래스에 주소값을 기본적으로 사용되고 메서드안에서 추가적인 주소를 넣어 줄 수 있다.
