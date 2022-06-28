/**
 * 
 */
package com.daw.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.daw.app.entity.TbArea;
import com.daw.app.entity.TbCargo;

public interface TbCargoDao extends JpaRepository<TbCargo, Integer> {
	TbCargo findByNombreAndTbArea(String nombre, TbArea area);
	TbCargo findByNombreAndTbAreaAndIdCargoNot(String nombre, TbArea area, Integer idCargo);
	List<TbCargo> findByTbAreaIdArea(Integer idArea);
}
