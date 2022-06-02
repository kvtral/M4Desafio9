
# Desafio 9 
### Tienda Indiana Jeans

El desafío está basado en las lecturas de los siguientes capítulos:
- Polimorfismo.
- Abstracción I.

### Autor
**Alvaro J. Carrillanca**   
*alvaro(dot)carrillanca(at)gmail.com*  
[Github/kvtral](https://github.com/kvtral/)

---

## Descripción 

La tienda “Indiana Jeans” necesita actualizar su sistema de ventas. Los productos ofrecidos son Jeans, Poleras y Polerones, sin embargo, la tienda busca contar con una aplicación para agregar nuevos productos y listarlos. Es por esto, que le solicitan los siguientes requerimientos:

## Requerimientos

#### 1.- Crear la clase Producto con los siguientes parámetros:
```java
String articulo.
String precio.
String descripcion.
String codigo.
String talla.
String marca.
String color.
```
#### 2.- Generar los getters y setters correspondientes en la clase Producto y el método toString.

#### 3.- Generar una clase ProductoServicio que contendrá una ArrayList llamada listaProductos, con su respectivo getters y setters. Además, esta clase debe contar con los siguientes métodos con sus respectivas aplicaciones:
```java
listarProductos()
agregarProductos()
```

#### 4.- Crear la clase abstracta ExportadorTxt con el método abstracto exportar. Esta pueda ser extendida por la clase ExportarTxt

#### 5.- Crear la clase ExportadorTxt extendido por herencia de la clase ExportarTxt. Utilizamos el método exportar y generamos aquellos códigos que nos ayuden a exportar la lista de productos en un archivo “.txt”.

#### 6.- Crear una clase Menu que contendrá un menú similar al que vemos a continuación, recordar que debemos generar todas las instancias de scanner en esta clase.

```java
1 Listar Producto
2 Agregar Producto
3 Exportar Datos
4 Salir
Ingrese una opción:
```

#### 7.- Crear una clase Utilidad para usar métodos de limpieza de pantalla y tiempo de espera.

## Contribuciones
Pull requests son bienvenidos. Si tiene alguna sugerencia o mejora que puede ser agregada también me puede escribir al correo indicado.





