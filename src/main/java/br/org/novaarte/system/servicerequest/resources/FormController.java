package br.org.novaarte.system.servicerequest.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.org.novaarte.system.servicerequest.entities.Form;
import br.org.novaarte.system.servicerequest.services.FormService;

@RestController
@RequestMapping(value = "/form")
public class FormController {

	@Autowired
	private FormService service;
	
	@GetMapping
	public String test() {
		return "Working";
	}
	
	@PostMapping
	public ResponseEntity<HttpStatus> postController(@RequestBody Form form) {
		System.out.println(form);
		form = service.insert(form);
		return ResponseEntity.ok(HttpStatus.OK);
	}
	
}
