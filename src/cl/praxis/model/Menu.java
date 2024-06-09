package cl.praxis.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {

        ProductoServicio productoServicio = new ProductoServicio();
        Scanner sc = new Scanner(System.in);
        ArrayList<Producto> listaProductos = new ArrayList<>();
        listaProductos.add(new Producto("jeans","15000","Super pitillo","4-bb","54","Yulong","Azul"));
        listaProductos.add(new Producto("camisa","25000","Moda ancha","3-bb","54","Denime","Negro"));
        listaProductos.add(new Producto("gorro","8500","Poliester abrigador","2-bb","L","Sportiva","Beige"));


        int op;
        String codigoProducto;
        int indexAtributo;
        String campoEditado;
        System.out.print("=========Menu=========\n" +
                "1 Listar Producto\n" +
                "2 Editar Producto\n" +
                "3 Importar Datos\n" +
                "4 Salir\n" +
                "Ingrese una opcion:\n");
        op=sc.nextInt();
        if(op==1){
            productoServicio.listaProductos(listaProductos);
        } else if (op==2) {
            System.out.println("Editar producto");
            System.out.println("Ingrese codigo del producto");
            codigoProducto=sc.next();
            Producto producto = productoServicio.buscarProducto(listaProductos,codigoProducto);
            System.out.print("1.-El nombre del articulo actual es:"+producto.getArticulo()+"\n"+
                    "2.-El codigo del producto : "+producto.getCodigo()+"\n"+
                    "3.-El color del producto: "+producto.getColor()+"\n"+
                    "4.-La descripción del producto: "+producto.getDescripcion()+"\n"+
                    "5.-La marca del producto: "+producto.getMarca()+"\n"+
                    "6.-El precio del producto: "+producto.getPrecio()+"\n"+
                    "7.-La talla del producto: "+producto.getTalla()+"\n"+
                    "Ingrese la opcion a editar de los datos del producto:");
            indexAtributo=sc.nextInt();
            if(indexAtributo==1){
                System.out.printf("Ingrese el nuevo nombe del producto: %s\n",producto.getArticulo());
                campoEditado= sc.next();
                productoServicio.editarProducto(producto,indexAtributo,campoEditado);
                System.out.println(producto);
            } else if (indexAtributo==2) {
                System.out.printf("Ingrese el nuevo codigo del producto: %s, actualmente con el codigo: %s\n",producto.getArticulo(),producto.getCodigo());
                campoEditado= sc.next();
                productoServicio.editarProducto(producto,indexAtributo,campoEditado);
                System.out.println(producto);
            }else if (indexAtributo==3) {
                System.out.printf("Ingrese el nuevo color del producto: %s, actualmente con el color: %s\n", producto.getArticulo(),producto.getColor());
                campoEditado= sc.next();
                productoServicio.editarProducto(producto,indexAtributo,campoEditado);
                System.out.println(producto);
            }else if (indexAtributo==4) {
                System.out.printf("Ingrese la nueva descripcion del producto: %s, actualmente con la descripcion: %s\n",producto.getArticulo(),producto.getDescripcion());
                sc.nextLine();
                campoEditado= sc.nextLine();
                productoServicio.editarProducto(producto,indexAtributo,campoEditado);
                System.out.println(producto);
            }else if (indexAtributo==5) {
                System.out.printf("Ingrese la nueva marca del producto: %s, actualmente con la marca: %s\n",producto.getArticulo(),producto.getMarca());
                campoEditado= sc.next();
                productoServicio.editarProducto(producto,indexAtributo,campoEditado);
                System.out.println(producto);
            }else if (indexAtributo==6) {
                System.out.printf("Ingrese el nuevo precio del producto: %s, actualmente con el precio: %s\n",producto.getArticulo(),producto.getPrecio());
                campoEditado= sc.next();
                productoServicio.editarProducto(producto,indexAtributo,campoEditado);
                System.out.println(producto);
            }else if (indexAtributo==7) {
                System.out.printf("Ingrese la nueva talla del producto: %s, actualmente con la talla: %s\n",producto.getArticulo(),producto.getTalla());
                campoEditado= sc.next();
                productoServicio.editarProducto(producto,indexAtributo,campoEditado);
                System.out.println(producto);
            }

        } else if (op==3) {
            System.out.println("Cargar Datos");
            System.out.print("Ingresa la ruta en donde se encuentra el archivo ==>'(src/cl/praxis/model/assets/ProductosImportados.csv)'");
            sc.nextLine();
            String rutaArchivo = sc.nextLine();

            ArchivoServicio archivoServicio = new ArchivoServicio();
            List<Producto> productosImportados = archivoServicio.cargarDatos(rutaArchivo);
            listaProductos.addAll(productosImportados);

            for(Producto producto:listaProductos) {
                System.out.println(producto);
                System.out.println("-------------------------");
            }
            System.out.println("Datos cargados correctamente en la lista");
        } else if (op==4) {

            System.out.print("Abandonando el sistema de clientes...\n" +
                    "Acaba de salir del sistema");

            System.exit(0);

        }

    }
}
