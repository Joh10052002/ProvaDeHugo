package Crud.service;

import java.util.List;

import Crud.entites.Identificavel;

public interface Service <E extends Identificavel> {
	
	void save(E e);

	void update(E e);

	void remove(E e);

	E getByID(long id);

	List<E> getAll();

}
