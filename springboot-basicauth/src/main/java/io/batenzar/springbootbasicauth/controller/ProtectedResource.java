package io.batenzar.springbootbasicauth.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProtectedResource {
	
	private List<String> resources = new ArrayList<>();
	
	public ProtectedResource() {
		resources.add("Resource A");
		resources.add("Resource B");
		resources.add("Resource C");
	}

	@GetMapping("/resources")
	public String list() {
		return resources.toString();
	}
	
	
	@GetMapping("/resources/{id}")
	public String get(@PathVariable("id") int id) {
		return resources.get(id);
	}
}
