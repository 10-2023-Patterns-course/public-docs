package com.example.demo;

import com.example.demo.service.StudentBuilder;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.event.EventListener;

import java.util.List;

@RequiredArgsConstructor
@SpringBootApplication
public class DemoApplication {

	private final StudentBuilder studentBuilder;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@EventListener(ApplicationStartedEvent.class)
	public void afterStart() {
		System.out.println("App started");

		var student = studentBuilder.create("Иванов", "Иван", null, List.of(5, 4, 3));
		System.out.println(student);

	}

}
