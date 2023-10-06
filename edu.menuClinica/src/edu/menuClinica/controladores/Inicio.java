package edu.menuClinica.controladores;

import java.util.Scanner;

import edu.menuClinica.servicios.MenuImplementacion;
import edu.menuClinica.servicios.MenuInterfaz;

/**
 * Clase por la que se accede a la aplicación
 * 290923
 * @author rfg
 */
public class Inicio {
	/**
	 * Método principal de nuestra aplicación
	 * Define el procedimiento, es de donde toda acción parte
	 * y a donde toda acción llega cuando acaba.
	 * 200923
	 * @author rfg
	 * @param args
	 */
	public static void main(String[] args) {
		
		int seleccionUsuario;
		boolean cerrarMenu = false;
		Scanner comunicacionTeclado = new Scanner(System.in);
		MenuInterfaz mi = new MenuImplementacion();
		
				
		while(!cerrarMenu) {

			seleccionUsuario = mi.mostraMenuYSeleccion(comunicacionTeclado);
			
			switch(seleccionUsuario) {
				case 0:
					System.out.println("[INFO] - Se ejecuta caso 0");
					cerrarMenu = true;
					break;
				case 1:
					System.out.println("[INFO] - Se ejecuta caso 1");
					break;
				case 2:
					System.out.println("[INFO] - Se ejecuta caso 2");
					break;
				case 3:
					System.out.println("[INFO] - Se ejecuta caso 3");
					break;
				case 4:
					System.out.println("[INFO] - Se ejecuta caso 4");
					break;
				case 5:
					System.out.println("[INFO] - Se ejecuta caso 5");
					break;
				default:
					System.out.println("[INFO] - Se ejecuta caso default");
					break;					
			}
			
		}

	}

}
