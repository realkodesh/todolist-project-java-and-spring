package entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity // a class entity é uma entidade
@Table(name = "todos") // cria o nome da tabela
public class Todo {
	 
	//Descrever propriedades do todo
	
	@Id // Sinaliza que ela é o id da entidade
	@GeneratedValue(strategy = GenerationType.IDENTITY ) // Seja gerado de forma sequencial no bd e não precise informar quando for criar uma ToDo
	private Long id; // identidcador unico do registro
    private String nome;
    private String descricao;
    private boolean realizado; //Se a tarefa foi realizada ou não
    private int prioridade;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public boolean isRealizado() {
		return realizado;
	}
	public void setRealizado(boolean realizado) {
		this.realizado = realizado;
	}
	public int getPrioridade() {
		return prioridade;
	}
	public void setPrioridade(int prioridade) {
		this.prioridade = prioridade;
	}
    
    
}
