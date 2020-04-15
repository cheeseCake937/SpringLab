package webadv.s17201329.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TaskController {
	
	@RequestMapping("/")
	public String home() {
		return "task";
	}
}
