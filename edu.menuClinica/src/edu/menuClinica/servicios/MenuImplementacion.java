package edu.menuClinica.servicios;

import java.util.Scanner;

/**
 * Implementación de la interfaz menú
 * @author rfg - 061023
 */
public class MenuImplementacion implements MenuInterfaz {

	@Override
	public int mostraMenuYSeleccion(Scanner comunicacionTecladoM) {
		
		int opcionSeleccionada;
		
		System.out.println("#############################");
		System.out.println("0. Cerrar la aplicacion");
		System.out.println("1. Registro de paciente");
		System.out.println("2. Ingreso de paciente");
		System.out.println("3. Alta de paciente");
		System.out.println("4. Resumen de ingresos y altas");
		System.out.println("5. Historial del paciente");
		System.out.println("#############################");
		System.out.println("Elija una opción: ");
		
		opcionSeleccionada = comunicacionTecladoM.nextInt();
				
		return opcionSeleccionada;
	}


}
