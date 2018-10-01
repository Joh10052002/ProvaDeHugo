package Crud.beans;

import java.io.Serializable;
import java.util.Collection;

import javax.annotation.PostConstruct;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import Crud.Professor;
import Crud.service.ProfesssorService;

@ViewScoped
@Named
public class ProfessorBean {
		
	@Inject
		
	private ProfesssorService service;

		protected Professor professor;

		protected Collection<Professor> professores;
		
		public ProfessorBean() {
		}
		
		@PostConstruct
		public void init () {
			professor = newProfessor();
			professores = getService().getAll();
			
		}public void remove(Professor professores) {
			getService().remove(professor);
			limpar();
		}

		public Professor getProfessor() {
			return professor;
		}

		public void setProfessor(Professor professor) {
			this.professor = professor;
		}

		public Collection<Professor> getProfessores() {
			return professores;
		}

		public void setProfessores(Collection<Professor> professores) {
			this.professores = professores;
		}

		public void save() {
			getService().save(professor);
			limpar();
		}

		public void editar(Long id) {
			this.getProfessor().setId(id);
			save();
		}

		public void limpar() {
			professores = getService().getAll();
			professor = newProfessor();
		}

		protected Professor newProfessor() {
			return new Professor();
		}

		public ProfesssorService getService() {
			return service;
		}
		

}
