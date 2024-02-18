/**
 * 
 */
package org.mfigueroa.jsfproject.controllers;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.mfigueroa.jsfproject.dto.UsuarioDTO;

/**
 * @author Miguel Figueroa
 * Clase que se encarga de mantener la informacion del usuario que ingresa a la aplicación.
 */

@ManagedBean
@SessionScoped
public class SessionController {
	/**
	 * Usuario que se mantendra en sesión.
	 */
	private UsuarioDTO usuarioDTO;
	
	@PostConstruct
	public void init() {
		System.out.println("Cargando la informacion del usuario en sesión.");
	}
	
	/**
	 * @return the usuarioDTO
	 */
	public UsuarioDTO getUsuarioDTO() {
		return usuarioDTO;
	}

	/**
	 * @param usuarioDTO the usuarioDTO to set
	 */
	public void setUsuarioDTO(UsuarioDTO usuarioDTO) {
		this.usuarioDTO = usuarioDTO;
	}
	
}
