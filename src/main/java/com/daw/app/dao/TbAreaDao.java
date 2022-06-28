/**
 * 
 */
package com.daw.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.daw.app.entity.TbArea;

public interface TbAreaDao extends JpaRepository<TbArea, Integer> {
	TbArea findByNombre(String nombre);
	TbArea findByNombreAndIdAreaNot(String nombre, Integer idArea);
}
