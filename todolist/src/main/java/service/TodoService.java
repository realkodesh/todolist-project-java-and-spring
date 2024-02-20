package service;

import java.util.List;

import org.springframework.stereotype.Service;

import entity.Todo;
import repository.TodoRepository;

//Vamos colocar todas as operações que vai ser feita 

@Service // Pra ser serviço spring e ser passivo de injeção
public class TodoService {

	//Pensar nas integrações com outros times/aplicações, por exemplo aplicação de front-end por isso todas operções vai retornar uma lista de todo

	//Para executar todas operações no service precisa do repositorio que criamos
	private TodoRepository todoRepository;
	
	
	//recomendavel injeção de dependencia via construtor pois já tem o autowired implicitamento sendo utilizado
	public TodoService(TodoRepository todoRepository) {
		super();
		this.todoRepository = todoRepository;
	}
	
	public List<Todo> create(Todo todo){
		
	    todoRepository.save(todo);
		
		return list();
		
	}
	public List<Todo> list(){
		
		return todoRepository.findAll();
		
	}
	public List<Todo> update(Todo todo){
		
		todoRepository.save(todo); // Para salvar a aplicação
		
		return list();

		
	}
	public List<Todo> delete(Long id){
		todoRepository.deleteById(id);
		return list();

		
	}
	
	
	
	
	
	
	
}
