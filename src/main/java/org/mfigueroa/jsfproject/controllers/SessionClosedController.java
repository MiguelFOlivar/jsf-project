/**
 * 
 */
package org.mfigueroa.jsfproject.controllers;

import java.io.IOException;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

/**
 * @author Miguel Figueroa
 * Clase que se encarga de cerrar la sesion del usuario.
 */
@ManagedBean
public class SessionClosedController {
	@PostConstruct
	public void init() {
		System.out.println("Cerrar sesion...");
	}
	
	/**
	 * Metodo que permite cerrar la sesion del usuario y volver a la pantalla login
	 */
	public void cerrarSesion() {
		ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
		externalContext.invalidateSession();
		try {
			this.redireccionar("login.xhtml");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * Metodo que permite redireccionar a un apágina
	 * @param pagina {@link String} pagina a redireccionar
	 * @throws IOException excepcion lanzada al no encontrar la pagina
	 */
	private void redireccionar(String pagina) throws IOException {
		ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
		externalContext.redirect(pagina);
	}

}
