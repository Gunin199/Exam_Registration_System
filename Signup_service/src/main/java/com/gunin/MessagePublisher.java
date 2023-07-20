package com.gunin;

import com.gunin.model.Student;
import org.apache.http.HttpResponse;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.gunin.messaging.MQConfig;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/signup")
public class MessagePublisher 
{
	
	@Autowired
	private RabbitTemplate template;

	@GetMapping("/home")
	public String home()
	{
		System.out.println("Inside home");

		return "signup";
	}

	@PostMapping("/submit")
	@CrossOrigin
	public ResponseEntity<String> submitApplication(@RequestBody Student student)
	{
		System.out.println(student.getEmailId());
		System.out.println(student.getStudentId());

		template.convertAndSend(MQConfig.EXCHANGE_NAME,MQConfig.ROUTING_KEY,student);

		System.out.println("Student data sent to message queue");
		return new ResponseEntity<>(student.toString(), HttpStatus.OK);
	}
}
