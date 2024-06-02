package control;

import vista.VentanaPrincipal;
import vista.VentanaCita;
import vista.VentanaCliente;
import vista.VentanaGerente;
import vista.VentanaVeterinario;
import vista.VentanaMascota;
import vista.VentanaPaquete;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ManipuladorMenu implements ActionListener {

    private static ManipuladorMenu instancia;

    private ManipuladorMenu() {}

    public static ManipuladorMenu getInstancia() {

        if(instancia == null) {

            instancia = new ManipuladorMenu();

        }

        return instancia;

    }

    @Override
    public void actionPerformed(ActionEvent evento) {

        VentanaPrincipal ventanaPrincipal = VentanaPrincipal.getInstance();

        String menu = evento.getActionCommand();

        VentanaMascota ventanaMascota = new VentanaMascota();
        VentanaCliente ventanaCliente = new VentanaCliente();
        VentanaVeterinario ventanaVeterinario = new VentanaVeterinario();
        VentanaGerente ventanaGerente = new VentanaGerente();
        VentanaPaquete ventanaPaquete = new VentanaPaquete();
        VentanaCita ventanaCita = new VentanaCita();

        switch (menu) {

            case "Alta de Clientes" -> {

                ventanaCliente.setVisible(true);

                ventanaPrincipal.getEscritorio().add(ventanaCliente);

            }

            case "Alta de mascota" -> {


                ventanaMascota.setVisible(true);

                ventanaPrincipal.getEscritorio().add(ventanaMascota);

            }

            case "Alta de veterninarios o asistente personal" -> {

                ventanaVeterinario.setVisible(true);

                ventanaPrincipal.getEscritorio().add(ventanaVeterinario);

            }

            case "Baja de veterninarios o asistente personal" -> {

                //ventanaVeterinario.setVisible(true);

                //ventaPrincipal.getEscritorio().add(ventanaProveedor);

            }

            case "Alta de gerente en sucursal" -> {

                ventanaGerente.setVisible(true);

                ventanaPrincipal.getEscritorio().add(ventanaGerente);

            }

            case "Registro de citas de veterninario a domicilio" -> {

                ventanaCita.setVisible(true);

                ventanaPrincipal.getEscritorio().add(ventanaCita);

            }

            case "Adopcion de mascotas" -> {

                //VentanaCita.setVisible(true);

                //ventaPrincipal.getEscritorio().add(ventanaProveedor);

            }

            case "Devolucion de mascotas" -> {

                //VentanaCita.setVisible(true);

                //ventaPrincipal.getEscritorio().add(ventanaProveedor);

            }

            case "Pago de paquetes" -> {

                //VentanaCita.setVisible(true);

                //ventaPrincipal.getEscritorio().add(ventanaProveedor);

            }

            case "Consulta de citas de veterinarios" -> {

                //VentanaCita.setVisible(true);

                //ventaPrincipal.getEscritorio().add(ventanaProveedor);

            }   
            
            case "Consulta de paquetes" -> {

                //VentanaCita.setVisible(true);

                //ventaPrincipal.getEscritorio().add(ventanaProveedor);

            } 

            case "Consulta de adopciones" -> {

                //VentanaCita.setVisible(true);

                //ventaPrincipal.getEscritorio().add(ventanaProveedor);

            }  

            case "Consulta de veterninarios" -> {

                //VentanaCita.setVisible(true);

                //ventaPrincipal.getEscritorio().add(ventanaProveedor);

            }
            
            case "Escritura de algo" -> {

                //VentanaCita.setVisible(true);

                //ventaPrincipal.getEscritorio().add(ventanaProveedor);

            }

            case "Salir" ->

                System.exit(0);

        }

    }

}