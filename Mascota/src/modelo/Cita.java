package modelo;
/*Para el registro de la Cita se va a manejar en la clase, el número de cita (int), la fecha y hora
(Date) y el cliente (Cliente), la mascota (Mascota) y dependiendo del tipo de servicio es decir
si es una cita médica se establece el veterinario de tipo (Veterinario) y/o asistente personal
(Asistente), la descripción del servicio (String) para guardar la descripción del tipo de
atención que se dará a la mascota, así como el tipo o tipos de paquetes que contrato para
la cita en la cita para esto ultimo manejar un arreglo para los paquetes que guarde los
paquetes que desea adquirir. No se pueden agendar citas para la misma fecha y hora, las
citas son de una hora, si algún gerente quiere asignar a un cliente una cita en una fecha y
hora ocupada no puede asignarla y lanzará una excepción: “No puede agendar la cita, ya se
encuentra ocupada"

Equipo: 
-Sosa Santiago Nadya Cristina. */

import java.time.LocalDate;
import java.time.LocalTime;

public class Cita {

    protected int numCita;
    protected localDate fecha;
    protected LocalTime hora;

    protected Veterninario vet;
    protected String descripción;
    protected Paquete paquetes;

    public Cita(String numCita, localDate fecha, LocalTime hora, Veterinario vet, String descripcion, Paquete paquetes) {

        this.numCita = numCita;
        this.fecha = fecha;
        this.hora = hora;
        this.vet = vet;
        this.descripcion = descripcion;
        this.paquetes = paquetes;

    }

    public void setNumCita(String numCita) {

        this.numCita = numCita;

    }

    public void setFecha(Date fecha) {

        this.fecha = fecha;

    }

    public void setHora(LocalTime hora) {

        this.hora = hora;

    }

    public void setVet(String vet) {

        this.vet = vet;

    }

    public void setDescripcion(String descripcion) {

        this.descripcion = descripcion;

    }

    public void setPaquetes(Paquete paquetes) {

        this.paquetes = paquetes;

    }

    public int getNumCita() {

        return numCita;

    }

    public Date getFecha() {

        return fecha;

    }

    public Date getHora() {

        return hora;

    }

    public Veterinario getVet() {

        return vet;

    }

    public String getDescripcion() {

        return descripción;

    }

    public String getPaquetes() {

        return paquetes;

    }

    public boolean Ocupado(Date fecha, LocalTime hora) {

        return this.fecha.equals(fecha) && this.hora.equals(hora);
    }
}