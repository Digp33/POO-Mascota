package modelo;
/*Para la mascota se va a manejar el atributo de nombre (String), raza (String), numeroMascota (int)
y un arreglo que contenga las vacunas aplicadas
Equipo:
-Sosa Santiago Nadya Cristina*/

import java.util.ArrayList;

public class Mascota {

    protected String nombre;
    protected String raza;
    protected int numeroMascota;
    protected ArrayList<> vacunas;


    public Mascota(String nombre, String raza, int numeroMascota, ArrayList<> vacunas) {

        this.nombre = nombre;
        this.raza = apellidoPaterno;
        this.numeroMascota = numeroMascota;
        this.vacunas = vacunas;

    }

    public void setNombre(String nombre) {

        this.nombre = nombre;

    }

    public void setRaza(String raza) {

        this.raza = raza;

    }

    public void setNumeroMascota(String numeroMascota) {

        this.numeroMascota = numeroMascota;

    }

    public void setVacunas(ArrayList<> vacunas) {

        this.vacunas = vacunas;

    }

    public String getNombre() {

        return nombre;

    }

    public String getRaza() {

        return raza;

    }

    public String getNumeroMascota() {

        return numeroMascota;

    }

    public ArratList<> getVacunas() {

        return vacunas;

    }

}