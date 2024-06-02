package modelo;

/*Alta de paquetes (cortes, baño, desparasitación, esterilización,
etc.)
Equipo: 
-Sosa Santiago Nadya Cristina. */

import java.util.ArrayList;
import java.util.List;

public class Paquete {
    private List<Servicio> servicios;
    private double precioTotal;

    public Paquete() {
        this.servicios = new ArrayList<>();
        this.precioTotal = 0.0;
    }

    // Este metodo es para agregar un servicio al paquete
    public void agregarServicio(Servicio servicio) {

        servicios.add(servicio);
        precioTotal += servicio.getPrecio();
    }

    // Este metodo es para obtener la lista de servicios
    public List<Servicio> getServicios() {
        return servicios;
    }

    // Este metodo es para obtener el precio total del paquete
    public double getPrecioTotal() {
        return precioTotal;
    }

}
