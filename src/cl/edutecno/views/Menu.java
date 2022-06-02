package cl.edutecno.views;

import java.util.Scanner;

import cl.edutecno.service.ExportadorTxt;
import cl.edutecno.service.ProductoServicio;
import cl.edutecno.utility.Utilidades;

public class Menu {

	public void ejecucionMenu() {
		
		Scanner sc = new Scanner (System.in);
		ProductoServicio productoServicio = new ProductoServicio ();
		ExportadorTxt exportador = new ExportadorTxt();
		String opcion;
		
		do {
			
			System.out.println("#################################");
			System.out.println("#            M E N U            #");
			System.out.println("#################################");
			System.out.println("#                               #");
			System.out.println("#   1.- Listar Productos        #");
			System.out.println("#   2.- Agregar Productos       #");
			System.out.println("#   3.- Exportar Datos          #");
			System.out.println("#   4.- Exportar Datos          #");
			System.out.println("#   5.- Salir                   #");
			System.out.println("#                               #");
			System.out.println("#################################");
			System.out.println("#                               #");
			System.out.println("#   Ingrese una opci�n:         #");
			System.out.println("#                               #");
			System.out.println("#################################");
			
			opcion = sc.nextLine();
			
			switch (opcion) {
			
			case "1":
				productoServicio.listarProductos();
				break;
				
			case "2":
				productoServicio.agregarProductos();
				break;
				
			case "3":
				System.out.println("# Ingrese el nombre de la carpeta para exportar el archivo # ");
				String ruta = sc.nextLine();
				exportador.exportar(ruta, productoServicio.getListaProductos());
				break;
			
			case "4":
				Utilidades.limpiarPantalla();
				break;
				
			case "5":
				System.out.println("#################################");
				System.out.println("#    HA SALIDO DEL PROGRAMA     #");
				System.out.println("#################################");
				break;
				
			default:
				System.out.println("#################################");
				System.out.println("#    INGRESE OPCION VALIDA      #");
				System.out.println("#################################");
				break;
			}

		} while (!opcion.contentEquals("5"));

	}

}
