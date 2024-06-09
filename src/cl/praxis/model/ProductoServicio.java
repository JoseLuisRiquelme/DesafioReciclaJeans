package cl.praxis.model;

import java.util.ArrayList;

public class ProductoServicio {

    private ArrayList<Producto> listaProductos;

    public ProductoServicio() {
    }

    public ProductoServicio(ArrayList<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }

    public ArrayList<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(ArrayList<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }

    public void listaProductos(ArrayList<Producto> listaProductos){


        for (Producto producto: listaProductos
        ) {
            System.out.println(producto.toString());
            System.out.println("--------------------------------------");
        }

    }
    public static Producto buscarProducto(ArrayList<Producto> listaProductos,String codigoProducto)
    {
        for (Producto producto : listaProductos) {
            if (producto.getCodigo().equalsIgnoreCase(codigoProducto)) {
                return producto;
            }
        }
        return null;
    }
    public void editarProducto(Producto producto,int indexAtributo,String campoEditado) {

        if(producto==null){
            System.out.println("Producto no existe");

            } else {
            if(indexAtributo==1){
                producto.setArticulo(campoEditado);
            } else if (indexAtributo==2) {
                producto.setCodigo(campoEditado);
            }else if (indexAtributo==3) {
                producto.setColor(campoEditado);
            }else if (indexAtributo==4) {
                producto.setDescripcion(campoEditado);
            }else if (indexAtributo==5) {
                producto.setMarca(campoEditado);
            }else if (indexAtributo==6) {
                producto.setPrecio(campoEditado);
            }else if (indexAtributo==7) {
                producto.setTalla(campoEditado);
            }
        }
    }


    }

