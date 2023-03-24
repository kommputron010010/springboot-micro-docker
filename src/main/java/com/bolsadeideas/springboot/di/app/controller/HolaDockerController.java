package com.bolsadeideas.springboot.di.app.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaDockerController {
	
	@GetMapping
	public ResponseEntity<String> holaMudndo(){
		return ResponseEntity.ok("Hola Mundo desde mi app contenida con Docker");
	}
}
