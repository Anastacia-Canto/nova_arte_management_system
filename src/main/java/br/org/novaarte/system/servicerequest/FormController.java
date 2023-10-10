package br.org.novaarte.system.servicerequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FormController {
	
	
	@GetMapping("/form")
	public String test() {
		return "Working";
	}
	
	@PostMapping("/form")
	public ResponseEntity postController(@RequestBody Form form) {
		System.out.println(form);
		return ResponseEntity.ok(HttpStatus.OK);
	}
	
}
