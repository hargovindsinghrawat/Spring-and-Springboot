package com.hargovind.learnspringsecurity.resources;

import java.util.List;
import java.util.Optional;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoResource {

	private static final List<Todo> TODOS_LIST = 
			List.of(new Todo("hargovind","Learn AWS"),
					new Todo("hargovind","Learn Spring"));
	
	@GetMapping("/todos")
	public List<Todo> retrieveAllTodos() {
		return TODOS_LIST;
	}
	
	@GetMapping("/users/{username}/todo")
	@PreAuthorize("hasRole('USER') and #username == authentication.name")
	public Todo retrieveTodoForSpecificUser(@PathVariable("username") String username) {
		return TODOS_LIST.get(0); 
	}
	
	@PostMapping("/users/{username}/todos")
	public void createTodoForSpecificUser(@PathVariable("username") String username
			, @RequestBody Todo todo) {
	}
}

record Todo (String username, String description) {}