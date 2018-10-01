package Crud;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import Crud.entites.Identificavel;

@Entity
public class Aluno implements Identificavel{
	
	@Id
	@GeneratedValue(generator = "aluno_seq", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "aluno_seq")
	
	private Long id;
	@Override
	public String toString() {
		return "Aluno [id=" + id + ", nomeAluno=" + nomeAluno + ", matricula=" + matricula + ", cpf=" + cpf
				+ ", nascimento=" + nascimento + "]";
	}
	public Aluno() {
		super();
		// TODO Auto-generated constructor stub
	}
	private String nomeAluno;
	private String matricula;
	private String cpf;
	private String nascimento;
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getNomeAluno() {
		return nomeAluno;
	}
	
	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}
	
	public String getMatricula() {
		return matricula;
	}
	
	public void setMatricula(String matricula) {
		this.matricula = matricula;
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
	
	

}
