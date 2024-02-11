/**
 * 
 */
package org.mfigueroa.jsfproject.controllers;

import java.io.IOException;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

/**
 * @author Miguel Figueroa Clase que permite controlar el funcionamiento de la
 *         pantalla de login.xhtml
 */
@ManagedBean
public class LoginController {
	/**
	 * usuario ingresado en el login
	 */
	private String usuario;

	/**
	 * contraseña usada en el login
	 */
	private String password;

	/**
	 * método que nos permite ingrear a la pantalla principal del login
	 */
	public void ingresar() {
		if (usuario.equals("mike") && password.equals("1234")) {
			try {
				this.redireccionar("principal.xhtml");
			} catch (IOException e) {
				FacesContext.getCurrentInstance().addMessage("formLogin:txtPassword",
						new FacesMessage(FacesMessage.SEVERITY_FATAL,"La página no existe...", ""));
			}
		} else {
			FacesContext.getCurrentInstance().addMessage("formLogin:txtPassword",
					new FacesMessage(FacesMessage.SEVERITY_INFO, "Usuario y/o contraseña incorrecto", ""));
		}
		System.out.println("Usuario: " + usuario);
	}

	private void redireccionar(String pagina) throws IOException {
		ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
		externalContext.redirect(pagina);
	}

	/**
	 * @return the usuario
	 */
	public String getUsuario() {
		return usuario;
	}

	/**
	 * @param usuario the usuario to set
	 */
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

}
