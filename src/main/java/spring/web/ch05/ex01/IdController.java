package spring.web.ch05.ex01;

import java.io.UnsupportedEncodingException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/ch05/ex01/id")
public class IdController {
	@RequestMapping
	public String form(){
		return "ch05/ex01/idIn";
	}
	
	@RequestMapping(value="/validate", method=RequestMethod.GET)
	@ResponseBody
	public Result validateld(String loginId){
		try{
			loginId = java.net.URLDecoder.decode(loginId, "utf-8");
		}catch(UnsupportedEncodingException e){}
		
		boolean isDuplicated = false;
		if((int)(Math.random()*2)==1) isDuplicated = true;
		
		Result result = new Result();
		result.setDuplicated(isDuplicated);
		result.setAvailabled(loginId + (int)(Math.random()*1000));
		return result;	//{duplicated:true, availableld:"~"}
	}
}