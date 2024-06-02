package modelo;
/* 
clase Tarjeta la cuál debe contener el número de
tarjeta (long), la fecha de vencimiento (Date) y el número CVC de seguridad (short).
Para determinar el monto del pago de cada servicio contratado se le hace la sumatoria década
paquete y se aplica al cargo (double) de la tarjeta

Equipo:
-Sosa Santiago Nadya Cristina*/

public class Tarjeta {

    protected long numTarjeta;
    protected Date fechaVencimiento;
    protected short cvc;
    

    public Tarjeta(long numTarjeta, Date fechaVencimiento, short cvc) {

        this.numTarjeta = numTarjeta;
        this.fechaVencimeiento = fechaVencimiento;
        this.cvc = cvc;

    }

    public void setTarjeta(long tarjeta) {

        this.tarjeta = tarjeta;

    }

    public void setFechaVencimiento(Date fechaVencimiento) {

        this.fechaVencimiento = fechaVencimiento;

    }

    public void setCvc(short cvc) {

        this.cvc = cvc;

    }

    public long getTrajeta() {

        return tarjeta;

    }

    public Date getFechaVencimiento() {

        return fechaVencimiento;

    }

    public short getCvc() {

        return cvc;

    }

}