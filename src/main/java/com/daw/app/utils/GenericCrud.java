/**
 * 
 */
package com.daw.app.utils;

import java.util.List;

public interface GenericCrud<E,ID> {
	E save(E e);
	E update(E e);
	void delete(E e);
	E findById(ID id);
	List<E> findAll();
}
