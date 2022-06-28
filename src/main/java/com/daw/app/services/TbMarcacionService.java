/**
 * 
 */
package com.daw.app.services;

import java.time.LocalDate;
import java.util.List;

import com.daw.app.entity.TbEmpleado;
import com.daw.app.entity.TbMarcacion;
import com.daw.app.utils.GenericCrud;

public interface TbMarcacionService extends GenericCrud<TbMarcacion, Integer>{
	void registrar(TbMarcacion e);
	TbMarcacion findByFechaAndTbEmpleado(LocalDate fecha, TbEmpleado empleado);
}
