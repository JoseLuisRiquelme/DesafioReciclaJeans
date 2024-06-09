package cl.praxis.model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ArchivoServicio {

    public List<Producto> cargarDatos(String rutaArchivo) {
        List<Producto> productos = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] campos = linea.split(",");
                if (campos.length == 7) {
                    Producto producto = new Producto(
                            campos[0],
                            campos[1],
                            campos[2],
                            campos[3],
                            campos[4],
                            campos[5],
                            campos[6]
                    );
                    productos.add(producto);
                }
            }
            System.out.println("Datos cargados correctamente en la lista");
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
        return productos;
    }
}
