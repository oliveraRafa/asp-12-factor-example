package com.example.demo;

import com.example.demo.component.CountComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.*;

@Controller
@SpringBootApplication
public class DemoApplication {

	@Autowired
	CountComponent countComponent;

	@RequestMapping("/")
	@ResponseBody
	String home() {
		return "Welcome to House Manager!";
	}

	@RequestMapping("/count")
	@ResponseBody
	String count() {
		countComponent.updateCount();
		return "You have " + countComponent.getCount() + " visitors";
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}