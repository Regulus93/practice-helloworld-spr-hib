package regulus93.helloworld.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import regulus93.helloworld.service.GreetingService;

@RestController
@RequestMapping("/greetings")
public class GreetingController {
	
	@Autowired
	private GreetingService greetingService;
	
	@GetMapping("sayHello")
	public ResponseEntity<String> sayHello(@RequestParam("lang") String lang){
		return ResponseEntity.ok(greetingService.getGreeting(lang).getGreeting());
	}
	

}
