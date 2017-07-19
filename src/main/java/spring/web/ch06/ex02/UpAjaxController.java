package spring.web.ch06.ex02;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/ch06/ex02/upload")
public class UpAjaxController {
	@Value("${uploadDir}")
	private String uploadDir;
	
	@RequestMapping(method = RequestMethod.GET)
	public String upload(){
		return "ch06/ex02/uploadIn";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	@ResponseBody
	public boolean upload(MultipartFile uploadFile, HttpServletRequest request){
		boolean isStored = true;
		String dir = request.getServletContext().getRealPath(uploadDir);
		System.out.println("dir: "+dir);
		String fileName = uploadFile.getOriginalFilename();
		try{
			save(dir+"/"+fileName, uploadFile);
		}catch(IOException e){
			isStored = false;
		}
		return isStored;
	}
	
	private void save(String fileFullName, MultipartFile uploadFile) throws IOException{
		uploadFile.transferTo(new File(fileFullName));
	}
}
