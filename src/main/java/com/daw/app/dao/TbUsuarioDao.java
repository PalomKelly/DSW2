/**
 * 
 */
package com.daw.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.daw.app.entity.TbUsuario;

public interface TbUsuarioDao extends JpaRepository<TbUsuario, Integer>{
	TbUsuario findByUsername(String username);
	TbUsuario findByUsernameAndIdUsuarioNot(String username, Integer idUsuario);
}
