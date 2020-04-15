package webadv.s17201329.rest;

import org.springframework.scheduling.config.Task;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("api/v1/task")
public class TaskRestController {
	
	@RequestMapping(value="",method=RequestMethod.GET,produces="application/json")
	public String task1(String id) {
		if (id.equals("1")) {
			return "在c语言中：当const修饰一个标识符的时候，这各标识符依然是一个变量，只是具有常属性，不能被直接改变";
		}else if (id.equals("2")) {
			return "JVM(Java Virtual Machine):java虚拟机，用于保证java的跨平台的特性。\r\n" + 
					"                  java语言是跨平台，jvm不是跨平台的。\r\n" + 
					"    JRE(Java Runtime Environment):java的运行环境,包括jvm+java的核心类库。    \r\n" + 
					"    JDK(Java Development Kit):java的开发工具,包括jre+开发工具\r\n";
		}else if (id.equals("3")) {
			return "Python是一门面向对象的语言，在Python中一切皆对象;Python是一门解释性语言;"
					+ "Python是一门交互式语言，即其在终端中进行命令编程;"
					+ "Python是一门跨平台的语言【没有操作系统的限制，在任何操作系统上都可以运行Python代码】";
		}else {
			return "no result";
		}
	}
}

