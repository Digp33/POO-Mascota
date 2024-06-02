package vista;

import javax.swing.JInternalFrame;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.BorderLayout;

public class VentanaMascota extends JInternalFrame {

    private JTextField txfNombre = new JTextField(10);
    private JTextField txfRaza = new JTextField(10);
    private JTextField txfNumeroMascota = new JTextField(10);
    private JTextField txfVacunas = new JTextField(10);
    
    public VentanaMascota() {

        super("Registro de mascota", false, true, false, true);

        add(crearPanelPrincipal());

        setSize(300, 150);

    }

    private JPanel crearPanelEdicion() {

        JPanel pnlEdicion = new JPanel();

        JLabel lblNombre = new JLabel("Nombre de la mascota: ");

        JLabel lblRaza = new JLabel("Raza: ");

        JLabel lblNumeroMascota = new JLabel("Numero de la mascota: ");

        JLabel lblVacunas = new JLabel("Vacunas: ");

        pnlEdicion.setLayout(new GridLayout(5, 5));

        pnlEdicion.add(lblNombre);

        pnlEdicion.add(txfNombre);

        pnlEdicion.add(lblRaza);

        pnlEdicion.add(txfRaza);

        pnlEdicion.add(lblNumeroMascota);

        pnlEdicion.add(txfNumeroMascota);

        pnlEdicion.add(lblVacunas);

        pnlEdicion.add(txfVacunas);

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
