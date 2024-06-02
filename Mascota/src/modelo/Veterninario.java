package modelo;
/*La clase veterinario debe de contener de heredar a persona y este debe de contener el número de
cédula (int) de veterinario
Equipo
-Sosa Santiago Nadya Cristina*/

class Veterinario extends Persona {

    protected int cedula;
    protected char tipoVet; //Si es asistente a, o si es veterinario v
    
    public Veterninario(String nombre, String apellidoPaterno, String apellidoMaterno, Date fechaNacimiento,
    String curp, int cedula, char tipoVet) {

        super(nombre, apellidoPaterno, apellidoMaterno, fechaNacimiento, curp, cedula, tipoVet)
        this.cedula = cedula;
        this.tipoVet = tipoVet;
      
    }

    public void setCedula(int cedula){

        this.cedula = cedula;
    }

    public void setTipoVet(char tipoVet){

        this.tipoVet = tipoVet;
    }

    public int getCedula(){

        return cedula;
    }

    public char getTipoVet(){

        return tipoVet;
    }

}