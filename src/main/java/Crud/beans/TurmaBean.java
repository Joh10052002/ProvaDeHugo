package Crud.beans;

import java.io.Serializable;
import java.util.Collection;

import javax.annotation.PostConstruct;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import Crud.Aluno;
import Crud.Turma;
import Crud.service.AlunoService;
import Crud.service.TurmaService;


@ViewScoped
@Named
public class TurmaBean implements Serializable {
	
@Inject
	
	private TurmaService service;

	protected Turma turma;

	protected Collection<Turma> turmas;
	
	public TurmaBean() {
	}
	
	@PostConstruct
	public void init () {
		turma = newTurma();
		turmas = getService().getAll();
		 
	}public void remove(Turma turma) {
		getService().remove(turma);
		limpar();
	}

	public Turma getTurma() {
		return turma;
	}

	public void setTurma(Turma turma) {
		this.turma = turma;
	}

	public Collection<Turma> getTurmas() {
		return turmas;
	}

	public void setTurmas(Collection<Turma> turmas) {
		this.turmas = turmas;
	}

	public void save() {
		getService().save(turma);
		limpar();
	}

	public void editar(Long id) {
		this.getTurma().setId(id);
		save();
	}

	public void limpar() {
		turmas = getService().getAll();
		turma = newTurma();
	}

	protected Turma newTurma() {
		return new Turma();
	}

	public TurmaService getService() {
		return service;
	}
	

}
