package edu.menuClinica.servicios;

import java.util.Scanner;

/**
 * Interfaz que enumera los métodos del a funionalidad del menú
 * @author rfg - 031023
 */
public interface MenuInterfaz {
	
	/**
	 * Mostrar el menú al usuario y que recoja la opción
	 * @author rfg - 031023
	 * @return (int) el número de la acción que selecciona el usuario
	 */
	public int mostraMenuYSeleccion(Scanner comunicacionTecladoM);

}
