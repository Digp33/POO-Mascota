package modelo;
/*Para la clase Gerente también debe heredar de Persona y este
debe tener (has a) la sucursal de tipo (Sucursal) y adicional un número de gerente
Equipo:
-Sosa Santiago Nadya Cristina
*/

class Gerente extends Persona {

    public int numGerente;
    public Sucursal sucursal;

    public Gerente(String nombre, String apellidoPaterno, String apellidoMaterno, Date fechaNacimiento,
    String curp, int numGerente, Sucursal sucursal) {

        super(nombre, apellidoPaterno, apellidoMaterno, fechaNacimiento, curp, numGerente, sucursal);
        this.numGerente = numGerente;
        this.sucursal = sucursal;
    }

    public void setNumGerente(int numGerente){

        this.numGerente = numGerente;
    }

    public void setMascota(Sucursal sucursal){

        this.sucursal = sucursal;
    }

    public int getNumGerente(){

        return numGerente;
    }

    public Mascota getSucursal(){

        return sucursal;
    }
   
}
