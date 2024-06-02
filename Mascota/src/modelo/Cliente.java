package modelo;
/* Crear la clase Cliente, la cual hereda de Persona, además debe contener el numero de cliente (int) como atributo y
como un cliente puede tener una mascota (has a) debe tener el atributo Mascota.
Equipo: 
-Sosa Santiago Nadya Cristina
*/

class Cliente extends Persona {

    public int numCliente;
    public Mascota mascota;

    public Cliente(String nombre, String apellidoPaterno, String apellidoMaterno, Date fechaNacimiento,
    String curp, int numCliente, Mascota mascota) {

        super(nombre, apellidoPaterno, apellidoMaterno, fechaNacimiento, curp, numCliente, mascota);
        this.numCliente = numCliente;
        this.mascota = mascota;
    }

    public void setNumCliente(int numCliente){

        this.numCliente = numCliente;
    }

    public void setMascota(Mascota mascota){

        this.mascota = mascota;
    }

    public int getNumCliente(){

        return numCliente;
    }

    public Mascota getMascota(){

        return mascota;
    }
   
}
