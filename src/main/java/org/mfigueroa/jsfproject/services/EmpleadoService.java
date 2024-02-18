/**
 * 
 */
package org.mfigueroa.jsfproject.services;

import java.util.ArrayList;
import java.util.List;

import org.mfigueroa.jsfproject.entity.Empleado;

/**
 * Clase que permite realizar la lógica de negociopara empleados.
 */
public class EmpleadoService {
	/**
	 * Método que permite consultar la lista de empleados de una empresa
	 * @return {@link Empleado} lista de empleados
	 */
	public List<Empleado> consultarEmpleados() {
		List<Empleado> empleados = new ArrayList<Empleado>();
		empleados.add(new Empleado("Alberto", "Salas", "López", "Software Engineer", true));
		empleados.add(new Empleado("Diego", "Paniagua", "RedRomero", "Senior Developer Java", true));
		empleados.add(new Empleado("Carlos", "Santana", "Ruiz", "Architect", true));
		empleados.add(new Empleado("Marcos", "Gutierrez", "Luna", "Web Developer", false));
		empleados.add(new Empleado("Alberto", "Salas", "López", "Software Engineer", true));
		empleados.add(new Empleado("Diego", "Paniagua", "RedRomero", "Senior Developer Java", true));
		empleados.add(new Empleado("Carlos", "Santana", "Ruiz", "Architect", true));
		empleados.add(new Empleado("Marcos", "Gutierrez", "Luna", "Web Developer", false));
		empleados.add(new Empleado("Alberto", "Salas", "López", "Software Engineer", true));
		empleados.add(new Empleado("Diego", "Paniagua", "RedRomero", "Senior Developer Java", true));
		empleados.add(new Empleado("Carlos", "Santana", "Ruiz", "Architect", true));
		empleados.add(new Empleado("Marcos", "Gutierrez", "Luna", "Web Developer", false));
		empleados.add(new Empleado("Alberto", "Salas", "López", "Software Engineer", true));
		empleados.add(new Empleado("Diego", "Paniagua", "RedRomero", "Senior Developer Java", true));
		empleados.add(new Empleado("Carlos", "Santana", "Ruiz", "Architect", true));
		empleados.add(new Empleado("Marcos", "Gutierrez", "Luna", "Web Developer", false));
		return empleados;
	}
}

