/**
 * 
 */
package org.mfigueroa.jsfproject.controllers;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.mfigueroa.jsfproject.entity.Empleado;
import org.mfigueroa.jsfproject.services.EmpleadoService;


/**
 * @author Miguel Figueroa clase que se encarga de procesar la informacion para
 *         la pantalla principal.xhtml.
 */

@ManagedBean
@ViewScoped
public class PrincipalController {
	/**
	 * lista de empleados para la tabla
	 */
	private List<Empleado> empleados;
	
	/**
	 * Se encarga de inicializar la informacion de la pantalla principal
	 */
	
	@PostConstruct
	public void init() {
		this.consultarEmpleados();
	}

	/**
	 * Servicio con los metodos que realizan la logica de negocio para empleados
	 */
	private EmpleadoService empService = new EmpleadoService();

	/**
	 * Metodo que consulta la lista de empleados.
	 */
	public void consultarEmpleados() {
		this.empleados = this.empService.consultarEmpleados();
	}

	/**
	 * @return the empleados
	 */
	public List<Empleado> getEmpleados() {
		return empleados;
	}

	/**
	 * @param empleados the empleados to set
	 */
	public void setEmpleados(List<Empleado> empleados) {
		this.empleados = empleados;
	}

}
