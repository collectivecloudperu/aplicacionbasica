package com.aplicacionbasica.aplicacionbasica;

// Dependencias 
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication; 

// Anotaciones 
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AplicacionbasicaApplication {

	public static void main(String[] args) {
		SpringApplication.run(AplicacionbasicaApplication.class, args);
	}

	@GetMapping("/mensaje")
	public String mensaje(@RequestParam(value = "comunidad", defaultValue = "Nube Colectiva") String comunidad) {
		return String.format("<h1>Hola %s ! </h1>", comunidad);
	}

} 
