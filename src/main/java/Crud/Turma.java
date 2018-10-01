package Crud;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import Crud.entites.Identificavel;

@Entity
public class Turma implements Identificavel {
	
	@Id
	@GeneratedValue(generator = "exercicio_seq", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "exercicio_seq")
	private Long id;
	private String nomeTurma;
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getNomeTurma() {
		return nomeTurma;
	}
	
	public void setNomeTurma(String nomeTurma) {
		this.nomeTurma = nomeTurma;
	}

	public Turma() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Turma [id=" + id + ", nomeTurma=" + nomeTurma + "]";
	}
	
	
	
	

}
