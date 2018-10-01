package Crud.service;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import Crud.Aluno;
import Crud.Disciplina;
import Crud.dao.DisciplinaDAO;
import Crud.util.TransacionalCdi;

@ApplicationScoped
public class DisciplinaService implements Serializable, Service<Disciplina> {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7803325791425670859L;
	
	@Inject
	private DisciplinaDAO disciplinaDAO;
	
	/* (non-Javadoc)
	 * @see br.edu.ifpb.esperanca.daw2.services.Service#save(br.edu.ifpb.esperanca.daw2.ifoto.entities.Usuario)
	 */
	@Override
	@TransacionalCdi
	public void save(Disciplina disciplina) {
		disciplinaDAO.save(disciplina);
	}

	/* (non-Javadoc)
	 * @see br.edu.ifpb.esperanca.daw2.services.Service#update(br.edu.ifpb.esperanca.daw2.ifoto.entities.Usuario, boolean)
	 */
	@Override
	@TransacionalCdi
	public void update(Disciplina disciplina)  {
			disciplinaDAO.update(disciplina);
	}

	/* (non-Javadoc)
	 * @see br.edu.ifpb.esperanca.daw2.services.Service#delete(br.edu.ifpb.esperanca.daw2.ifoto.entities.Usuario)
	 */
	@Override
	@TransacionalCdi
	public void remove(Disciplina disciplina) {
		disciplinaDAO.remove(disciplina);
	}

	/* (non-Javadoc)
	 * @see br.edu.ifpb.esperanca.daw2.services.Service#getByID(long)
	 */
	@Override
	public Disciplina getByID(long disciplinaId)  {
			return disciplinaDAO.getByID(disciplinaId);
	}

	/* (non-Javadoc)
	 * @see br.edu.ifpb.esperanca.daw2.services.Service#getAll()
	 */
	@Override
	public List<Disciplina> getAll() {
			return disciplinaDAO.getAll();
	}

}
