package vista;

import javax.swing.JInternalFrame;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.BorderLayout;

public class VentanaCliente extends JInternalFrame {

    private JTextField txfNombre = new JTextField(10);
    private JTextField txfAPaterno = new JTextField(10);
    private JTextField txfAMaterno = new JTextField(10);
    private JTextField txfFechaNacimiento = new JTextField(10);
    private JTextField txfCurp = new JTextField(10);
    private JTextField txfNumCliente = new JTextField(10);
    private JTextField txfMascota = new JTextField(10);

    public VentanaCliente() {

        super("Registro de cliente", false, true, false, true);

        add(crearPanelPrincipal());

        setSize(300, 150);

    }

    private JPanel crearPanelEdicion() {

        JPanel pnlEdicion = new JPanel();

        JLabel lblNombre = new JLabel("Nombre: ");

        JLabel lblAPaterno = new JLabel("Apellido Paterno: ");

        JLabel lblAMaterno = new JLabel("Apellido Materno: ");

        JLabel lblFechaNacimiento = new JLabel("Fecha nacimiento: ");

        JLabel lblCurp = new JLabel("Curp: ");

        JLabel lblNumCliente = new JLabel("Numero del cliente: ");

        JLabel lblMascota = new JLabel("Mascota: ");

        pnlEdicion.setLayout(new GridLayout(7, 7));

        pnlEdicion.add(lblNombre);

        pnlEdicion.add(txfNombre);

        pnlEdicion.add(lblAPaterno);

        pnlEdicion.add(txfAPaterno);

        pnlEdicion.add(lblAMaterno);

        pnlEdicion.add(txfAMaterno);

        pnlEdicion.add(lblFechaNacimiento);

        pnlEdicion.add(txfFechaNacimiento);

        pnlEdicion.add(lblCurp);

        pnlEdicion.add(txfCurp);

        pnlEdicion.add(lblNumCliente);

        pnlEdicion.add(txfNumCliente);

        pnlEdicion.add(lblMascota);

        pnlEdicion.add(txfMascota);

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
