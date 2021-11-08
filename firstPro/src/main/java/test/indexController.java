package test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class indexController {
	@RequestMapping("/index.do")
	public String main() {
		System.out.println("어노테이션 기반 컨트롤러");
		return "test/index";
	}
	@RequestMapping("/test.do")
	public ModelAndView test() {
		ModelAndView mav = new ModelAndView();
		String result = "컨트롤러에서 공유하는 데이터";
		mav.addObject("result",result);//데이터 공유 
		mav.setViewName("test/result");//뷰이름 셋팅
		return mav;
	}
}
