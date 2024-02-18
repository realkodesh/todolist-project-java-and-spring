package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import entity.Todo;

//Interface Repository faz interação com banco, tem acesso ao banco, busca, cria e atualiza todos
//Extende jpa repository e informamos a entidade e o tipo do id 

public interface TodoRepository extends JpaRepository<Todo, Long> {
	
	

}
