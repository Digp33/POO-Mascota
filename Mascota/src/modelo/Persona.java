package modelo;
/*Crear la clase Persona tiene como atributos: nombre (String), paterno
(String), materno (String), fecha_nacimiento (Date) y CURP (String)
Equipo:
-Sosa SantiagO o Nadya Cristina*/

public class Persona {

    protected String nombre;
    protected String apellidoPaterno;
    protected String apellidoMaterno;
    protected Date fechaNacimiento;
    protected String curp;

    public Persona(String nombre, String apellidoPaterno, String apellidoMaterno, Date fechaNacimiento,
                   String curp) {

        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.fechaNacimiento= fechaNacimiento;
        this.curp = curp;

    }

    public void setNombre(String nombre) {

        this.nombre = nombre;

    }

    public void setApellidoPaterno(String apellidoPaterno) {

        this.apellidoPaterno = apellidoPaterno;

    }

    public void setApellidoMaterno(String apellidoMaterno) {

        this.apellidoMaterno = apellidoMaterno;

    }

    public void setFechaNacimiento(Date fechaNacimiento) {

        this.fechaNacimiento = fechaNacimiento;

    }

    public void setCurp(String curp) {

        this.curp = curp;

    }

    public String getNombre() {

        return nombre;

    }

    public String getApellidoPaterno() {

        return apellidoPaterno;

    }

    public String getApellidoMaterno() {

        return apellidoMaterno;

    }

    public String getFechaNacimiento() {

        return fechaNacimiento;

    }

    public String getCurp() {

        return curp;

    }

}