package com.example.demo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


	@RestController
	@SpringBootApplication
	@RequestMapping("/hi")
	public class Demo1Application {

		@RequestMapping("/{Name}/ages")
		
		Employee home( @PathVariable("Name") String name, @RequestParam ("age") Integer age )
		{
			Employee e = new Employee();
			e.setName(name);
			e.setAge(age);
			return e;
			
		}
		
	public static void main(String[] args) {
		SpringApplication.run(Demo1Application.class, args);
	}
}
