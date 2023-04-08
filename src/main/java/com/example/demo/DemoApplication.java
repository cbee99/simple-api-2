package com.example.demo;
import com.example.demo.student.Student;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);
	}
//new comment here
	@GetMapping("/")
	public String hello() {
		return "index page";
	}

	@GetMapping("/about")
	public String about() {
		return "This is the about me page";
	}

	@GetMapping("/contact-us")
	public String contact() {
		return "Insert contact page here";
	}

	@GetMapping("/hello")
	public Object getObject() {
		Map<String, Object> object = new HashMap<>();
		object.put("key1", "value1");
		return object;
	}
	@GetMapping("/Student")
	public List<Student> names() {
		return List.of(
				new Student(
						1L,
						"Chris",
						"Chris@email.com",
						LocalDate.of(2028, 8, 28),
						41)
		);
	}
//	comment



}
