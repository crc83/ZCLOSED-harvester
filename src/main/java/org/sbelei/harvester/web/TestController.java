package org.sbelei.harvester.web;

import java.util.List;

import org.springframework.social.google.api.Google;
import org.springframework.social.google.api.calendar.Calendar.EventReminder;
import org.springframework.social.google.api.impl.GoogleTemplate;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

@RestController("test")
public class TestController {
	
	@GetMapping("hello")
	public Mono<String> hello() {
		return Mono.just(1)
			    .map(integer -> "hello" + integer);
	}
	
	@GetMapping("google")
	public Mono<String> google() {
		Google google = new GoogleTemplate("AIzaSyCP_RLRvPX9FpUIL8C83i8GnjXTd55UABw");
		List<EventReminder> reminders = google.calendarOperations().getCalendar("f12apjjq3kg9i75uqm7qduvmlk@group.calendar.google.com").getDefaultReminders();
		for (EventReminder reminder : reminders) {
			System.out.println(reminder.toString());
		}
		return Mono.just(1)
				.map(integer -> "google" + integer);
	}
	
	@GetMapping("tinker")
	public Mono<String> tinker() {

		return Mono.just(1)
				.map(integer -> "google" + integer);
	}
	
}
