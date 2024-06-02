package vista;

import javax.swing.JInternalFrame;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.BorderLayout;

public class VentanaGerente extends JInternalFrame {

    private JTextField txfNombre = new JTextField(10);
    private JTextField txfAPaterno = new JTextField(10);
    private JTextField txfAMaterno = new JTextField(10);
    private JTextField txfFechaNacimiento = new JTextField(10);
    private JTextField txfCurp = new JTextField(10);
    private JTextField txfNumGerente = new JTextField(10);
    private JTextField txfSucursal = new JTextField(10);

    public VentanaGerente() {

        super("Registro de gerentes", false, true, false, true);

        add(crearPanelPrincipal());

        setSize(300, 150);

    }

    private JPanel crearPanelEdicion() {

        JPanel pnlEdicion = new JPanel();

        JLabel lblNombre = new JLabel("Nombre: ");

        JLabel lblAPaterno = new JLabel("Apellido Paterno: ");

        JLabel lblAMaterno = new JLabel("Apellido Materno: ");

        JLabel lblFechaNacimiento = new JLabel("Fecha de Nacimiento: ");

        JLabel lblCurp = new JLabel("Curp: ");

        JLabel lblNumGerente = new JLabel("Numero de gerente: ");

        JLabel lblSucursal = new JLabel("Sucursal: ");

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

        pnlEdicion.add(lblNumGerente);

        pnlEdicion.add(txfNumGerente);

        pnlEdicion.add(lblSucursal);

        pnlEdicion.add(txfSucursal);

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