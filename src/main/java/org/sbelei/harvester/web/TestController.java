package org.sbelei.harvester.web;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

@RestController
public class TestController {
	
	@GetMapping("hello")
	public Mono<String> hello() {
		return Mono.just(1)
			    .map(integer -> "foo" + integer);
	}
	
	
//	private ConfigurableGoogleTemplate google = new ConfigurableGoogleTemplate("APP_ACCESS_TOKEN", "https://www.googleapis.com/");;

//	@RequestMapping(value = "/test", method = RequestMethod.GET)
	String index(Model model) {
//		final CalendarPage calPage = google.calendarOperations().calendarListQuery().minAccessRole(PermissionRole.READER).getPage();
//		System.out.println("");
		return "index";
	}
}
