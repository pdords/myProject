package spring.web.ch03.ex01;
 
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
 
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
 
@Controller
@RequestMapping("/ch03/ex02")
public class AttrController {
    @RequestMapping(method=RequestMethod.GET)
    public String user(){
        return "ch03/ex02/userIn";
    }
    
    @RequestMapping(method=RequestMethod.POST)
    public String person(HttpServletRequest request, HttpSession session){
        String name = request.getParameter("name");
        int age = Integer.parseInt(request.getParameter("age"));
        request.setAttribute("user", new User(name+"(reqeust)", age));
        session.setAttribute("user", new User(name+"(session)", age+10));
        return "ch03/ex02/userOut";
    }
}