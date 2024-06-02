package modelo;

public enum Servicio {

    CORTE("Corte", 150.0),
    BANIO("Baño", 100.0),
    DESPARASITACION("Desparasitación", 200.0),
    ESTERILIZACION("Esterilización", 500.0),
    VACUNACION("Vacunación", 250.0);

    private final String nombre;
    private final double precio;

    
    private Servicio(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }
}
