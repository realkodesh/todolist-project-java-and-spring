package controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import entity.Todo;
import service.TodoService;

//WEB onde vamos interagir com nosso seviço

@RestController
@RequestMapping("/todos")

public class TodoController {

	// Para exectarmos as operações no controller precisamos de um todo service que
	// criamos
	private TodoService todoService;

	public TodoController(TodoService todoService) {
		super();
		this.todoService = todoService;
	}
 
	//Depois de montar estrutura do controllador agora expomos as operações usando os @postmapping e outros para criar endpoints (pontos de acesso)
	
	
	@PostMapping
	List<Todo> create(@RequestBody Todo todo) { //@RequestBody para dizer que a todo vai ser enviada no corpo da requisição
		
		return todoService.create(todo);

	}

	@GetMapping
	List<Todo> list() {
		
		return todoService.list(); //retorna lista de todo


	}

	@PutMapping
	List<Todo> update(@RequestBody Todo todo) {
		
		return todoService.update(todo);

	}

	//delete/todos/id
	@DeleteMapping("{id}") //Passa o id para ser deletado e usa o @PathVariable("id")
	List<Todo> delete(@PathVariable("id") Long id) { 
		
		return todoService.delete(id);

	}

}
