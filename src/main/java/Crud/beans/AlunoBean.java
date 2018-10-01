package Crud.beans;

import java.io.Serializable;
import java.util.Collection;

import javax.annotation.PostConstruct;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;


import Crud.Aluno;
import Crud.service.AlunoService;

@ViewScoped
@Named
public class AlunoBean implements Serializable {
	
	@Inject
	
	private AlunoService service;

	protected Aluno aluno;

	protected Collection<Aluno> alunos;
	
	public AlunoBean() {
	}
	
	@PostConstruct
	public void init () {
		aluno = newAluno();
		alunos = getService().getAll();
		
	}public void remove(Aluno aluno) {
		getService().remove(aluno);
		limpar();
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public Collection<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(Collection<Aluno> alunos) {
		this.alunos = alunos;
	}

	public void save() {
		getService().save(aluno);
		limpar();
	}

	public void editar(Long id) {
		this.getAluno().setId(id);
		save();
	}

	public void limpar() {
		alunos = getService().getAll();
		aluno = newAluno();
	}

	protected Aluno newAluno() {
		return new Aluno();
	}

	public AlunoService getService() {
		return service;
	}
	
	
	
	
	

}
