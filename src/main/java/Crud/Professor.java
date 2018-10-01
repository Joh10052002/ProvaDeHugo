package Crud;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import Crud.entites.Identificavel;

@Entity
public class Professor implements Identificavel {
	
	@Id
	@GeneratedValue(generator = "professor_seq", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "professor_seq")
	
	private Long id;
	private String nome;
	private String cpf;
	private String nascimento;
	private String username;
	private String password;
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassowrd(String password) {
		this.password = password;
	}

	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getnome() {
		return nome;
	}
	
	public void setnome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getNascimento() {
		return nascimento;
	}
	
	public void setNascimento(String nascimento) {
		this.nascimento = nascimento;
	}

	public Professor() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Professor [id=" + id + ", nome=" + nome + ", cpf=" + cpf + ", nascimento="
				+ nascimento + "]";
	}
	


	
	
	
	
	
	

}
