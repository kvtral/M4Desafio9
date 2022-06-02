package cl.edutecno.service;

import java.util.ArrayList;
import java.util.Scanner;

import cl.edutecno.model.Producto;

public class ProductoServicio {
	
	private ArrayList<Producto> listaProductos;

	public ProductoServicio() {
		listaProductos = new ArrayList<>();
	}

	public ArrayList<Producto> getListaProductos() {
		return listaProductos;
	}

	public void setListaProductos(ArrayList<Producto> listaProductos) {
		this.listaProductos = listaProductos;
	}
	
	public void listarProductos() {
		if (!getListaProductos().isEmpty()) {
			System.out.println("#################################");
			System.out.println("#     PRODUCTOS DISPONIBLES     #");
			System.out.println("#################################");
			System.out.println();
			
			for (Producto productoTemp : listaProductos) {
				System.out.println("##    " + productoTemp.toString());
			}
			System.out.println("##");
			System.out.println("#################################");

		} else {
			
			System.out.println("#################################");
			System.out.println("#         SIN PRODUCTOS         #");
			System.out.println("#################################");
			
		}
	}
	
	public void agregarProductos() {
		Scanner sc = new Scanner(System.in);
		Producto producto =  new Producto();
		System.out.println("#################################");
		System.out.println("#        INGRESE PRODUCTO       #");
		System.out.println("#################################");
		System.out.println("#  INGRESE NOMBRE DEL PRODUCTO  #");
		System.out.println("#################################");
		producto.setArticulo(sc.nextLine());
		System.out.println("#################################");
		System.out.println("#  INGRESE PRECIO DEL PRODUCTO  #");
		System.out.println("#################################");
		producto.setPrecio(sc.nextLine());
		System.out.println("#################################");
		System.out.println("#    DESCRIPCION DEL PRODUCTO   #");
		System.out.println("#################################");
		producto.setDescripcion(sc.nextLine());
		System.out.println("#################################");
		System.out.println("#  INGRESE CODIGO DEL PRODUCTO  #");
		System.out.println("#################################");
		producto.setCodigo(sc.nextLine());
		System.out.println("#################################");
		System.out.println("#  INGRESE TALLA  DEL PRODUCTO  #");
		System.out.println("#################################");
		producto.setTalla(sc.nextLine());
		System.out.println("#################################");
		System.out.println("#  INGRESE MARCA  DEL PRODUCTO  #");
		System.out.println("#################################");
		producto.setMarca(sc.nextLine());
		System.out.println("#################################");
		System.out.println("#  INGRESE COLOR  DEL PRODUCTO  #");
		System.out.println("#################################");
		producto.setColor(sc.nextLine());
		
		listaProductos.add(producto);
		
	}
	

}
