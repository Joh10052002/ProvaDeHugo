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
	private String nomeProfessor;
	private String cpfProf;
	private String nascimento;
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getNomeProfessor() {
		return nomeProfessor;
	}
	
	public void setNomeProfessor(String nomeProfessor) {
		this.nomeProfessor = nomeProfessor;
	}
	
	public String getCpfProf() {
		return cpfProf;
	}
	
	public void setCpfProf(String cpfProf) {
		this.cpfProf = cpfProf;
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
		return "Professor [id=" + id + ", nomeProfessor=" + nomeProfessor + ", cpfProf=" + cpfProf + ", nascimento="
				+ nascimento + "]";
	}
	


	
	
	
	
	
	

}
