package vista;

import javax.swing.JInternalFrame;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.BorderLayout;

public class VentanaCita extends JInternalFrame {

    private JTextField txfNumCita = new JTextField(10);
    private JTextField txfFecha = new JTextField(10);
    private JTextField txfHora = new JTextField(10);
    private JTextField txfVet = new JTextField(10);
    private JTextField txfDescripcion = new JTextField(10);
    private JTextField txfPaquetes = new JTextField(10);
   
    public VentanaCita() {

        super("Registro de la cita", false, true, false, true);

        add(crearPanelPrincipal());

        setSize(300, 150);

    }

    private JPanel crearPanelEdicion() {

        JPanel pnlEdicion = new JPanel();

        JLabel lblNumCita = new JLabel("Numero de cita: ");

        JLabel lblFecha = new JLabel("Fecha: ");

        JLabel lblHora = new JLabel("Hora: ");

        JLabel lblVet = new JLabel("Veterinario: ");

        JLabel lblDescripcion = new JLabel("Descripcion: ");

        JLabel lblPaquetes = new JLabel("Paquetes: ");

        pnlEdicion.setLayout(new GridLayout(5, 5));

        pnlEdicion.add(lblNumCita);

        pnlEdicion.add(txfNumCita);

        pnlEdicion.add(lblFecha);

        pnlEdicion.add(txfFecha);

        pnlEdicion.add(lblHora);

        pnlEdicion.add(txfHora);

        pnlEdicion.add(lblVet);

        pnlEdicion.add(txfVet);

        pnlEdicion.add(lblDescripcion);

        pnlEdicion.add(txfDescripcion);

        pnlEdicion.add(lblPaquetes);

        pnlEdicion.add(txfPaquetes);

        return pnlEdicion;

    }

    public JPanel crearPanelPrincipal() {

        JPanel pnlPrincipal = new JPanel();

        pnlPrincipal.setLayout(new BorderLayout());

        pnlPrincipal.add(crearPanelEdicion(), BorderLayout.CENTER);

        pnlPrincipal.add(crearPanelControl(), BorderLayout.SOUTH);

        return pnlPrincipal;

    }

    public JPanel crearPanelControl() {

        JPanel pnlControl = new JPanel();

        JButton btnAgregar = new JButton("Agregar");

        pnlControl.add(btnAgregar);

        return pnlControl;

    }

}
