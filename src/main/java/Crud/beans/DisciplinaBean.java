package Crud.beans;

import java.util.Collection;

import javax.annotation.PostConstruct;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import Crud.Aluno;
import Crud.Disciplina;
import Crud.service.AlunoService;
import Crud.service.DisciplinaService;

@ViewScoped
@Named
public class DisciplinaBean {
	
	@Inject
	
	private DisciplinaService service;
	
	protected Disciplina disciplina;
	
	protected Collection<Disciplina> disciplinas;
	
	
	@PostConstruct
	public void init () {
		disciplina = newDisciplina();
		disciplinas = getService().getAll();
		
	}public void remove(Disciplina disciplina) {
		getService().remove(disciplina);
		limpar();
	}

	public Disciplina getDisciplina() {
		return disciplina;
	}

	public void setExercicio(Disciplina disciplina) {
		this.disciplina = disciplina;
	}

	public Collection<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(Collection<Disciplina> diciplinas) {
		this.disciplinas = disciplinas;
	}

	public void save() {
		getService().save(disciplina);
		limpar();
	}

	public void editar(Long id) {
		this.getDisciplina().setId(id);
		save();
	}

	public void limpar() {
		disciplinas = getService().getAll();
		disciplina = newDisciplina();
	}
	
	protected Disciplina newDisciplina() {
		return new Disciplina();
	}

	public DisciplinaService getService() {
		return service;
	}
	

}
