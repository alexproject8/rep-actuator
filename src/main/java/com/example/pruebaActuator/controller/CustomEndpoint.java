package com.example.pruebaActuator.controller;

import org.springframework.boot.actuate.endpoint.web.annotation.RestControllerEndpoint;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@Component
@RestControllerEndpoint(id="customEndpoint")
public class CustomEndpoint {

	@GetMapping("/random")
	public ResponseEntity<String> customEndPoint(){
		
		return new ResponseEntity<>("Frase que devuelve",HttpStatus.OK);
		
	}
	
	//para visualizarlo se debe escribir en el navegador => http://localhost:8080/actuator/customEndpoint/random
}
