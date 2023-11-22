package mvc_test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/")
public class WebController {

	@GetMapping("index")
	public ModelAndView getHome() {
		return new ModelAndView("pages/index");
	}
}

