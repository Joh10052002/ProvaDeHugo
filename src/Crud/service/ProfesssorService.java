package Crud.service;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import Crud.Professor;
import Crud.dao.ProfessorDAO;
import Crud.util.TransacionalCdi;

@ApplicationScoped
public class ProfesssorService implements Serializable, Service<Professor>{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7803325791425670859L;
	
	@Inject
	private ProfessorDAO professorDAO;
	
	/* (non-Javadoc)
	 * @see br.edu.ifpb.esperanca.daw2.services.Service#save(br.edu.ifpb.esperanca.daw2.ifoto.entities.Usuario)
	 */
	@Override
	@TransacionalCdi
	public void save(Professor professor) {
		professorDAO.save(professor);
	}

	/* (non-Javadoc)
	 * @see br.edu.ifpb.esperanca.daw2.services.Service#update(br.edu.ifpb.esperanca.daw2.ifoto.entities.Usuario, boolean)
	 */
	@Override
	@TransacionalCdi
	public void update(Professor professor)  {
			professorDAO.update(professor);
	}

	/* (non-Javadoc)
	 * @see br.edu.ifpb.esperanca.daw2.services.Service#delete(br.edu.ifpb.esperanca.daw2.ifoto.entities.Usuario)
	 */
	@Override
	@TransacionalCdi
	public void remove(Professor professor) {
		professorDAO.remove(professor);
	}

	/* (non-Javadoc)
	 * @see br.edu.ifpb.esperanca.daw2.services.Service#getByID(long)
	 */
	@Override
	public Professor getByID(long professorId)  {
			return professorDAO.getByID(professorId);
	}

	/* (non-Javadoc)
	 * @see br.edu.ifpb.esperanca.daw2.services.Service#getAll()
	 */
	@Override
	public List<Professor> getAll() {
			return professorDAO.getAll();
	}




}
