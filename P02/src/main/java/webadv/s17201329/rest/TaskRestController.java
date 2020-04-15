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
			return "��c�����У���const����һ����ʶ����ʱ�������ʶ����Ȼ��һ��������ֻ�Ǿ��г����ԣ����ܱ�ֱ�Ӹı�";
		}else if (id.equals("2")) {
			return "JVM(Java Virtual Machine):java����������ڱ�֤java�Ŀ�ƽ̨�����ԡ�\r\n" + 
					"                  java�����ǿ�ƽ̨��jvm���ǿ�ƽ̨�ġ�\r\n" + 
					"    JRE(Java Runtime Environment):java�����л���,����jvm+java�ĺ�����⡣    \r\n" + 
					"    JDK(Java Development Kit):java�Ŀ�������,����jre+��������\r\n";
		}else if (id.equals("3")) {
			return "Python��һ�������������ԣ���Python��һ�нԶ���;Python��һ�Ž���������;"
					+ "Python��һ�Ž���ʽ���ԣ��������ն��н���������;"
					+ "Python��һ�ſ�ƽ̨�����ԡ�û�в���ϵͳ�����ƣ����κβ���ϵͳ�϶���������Python���롿";
		}else {
			return "no result";
		}
	}
}

