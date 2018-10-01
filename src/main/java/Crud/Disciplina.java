package Crud;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import Crud.entites.Identificavel;

@Entity
public class Disciplina implements Identificavel {
	
	@Id
	@GeneratedValue(generator = "disciplina_seq", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "disciplina_seq")
	
	private Long id;
	private String nomeDisciplina;
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getNomeDisciplina() {
		return nomeDisciplina;
	}
	
	public void setNomeDisciplina(String nomeDisciplina) {
		this.nomeDisciplina = nomeDisciplina;
	}

	public Disciplina() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Disciplina [id=" + id + ", nomeDisciplina=" + nomeDisciplina + "]";
	}
	
	

}
