package vista;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Paquete;
import modelo.Servicio;

public class VentanaPaquete extends JInternalFrame {

    private JComboBox<Servicio> cmbServicios;
    private JTextField txfPrecioTotal = new JTextField(10);
    private Paquete paquete;

    public VentanaPaquete() {

        super("Alta de Paquetes", false, true, false, true);
       
        paquete = new Paquete();
        
        add(crearPanelPrincipal());

        setSize(400, 200);
    }

    private JPanel crearPanelEdicion() {

        JPanel pnlEdicion = new JPanel();

        JLabel lblServicio = new JLabel("Servicio: ");

        JLabel lblPrecioTotal = new JLabel("Precio Total: ");
        
        cmbServicios = new JComboBox<>(Servicio.values());

        txfPrecioTotal.setEditable(false);
        
        pnlEdicion.setLayout(new GridLayout(3, 2));

        pnlEdicion.add(lblServicio);

        pnlEdicion.add(cmbServicios);

        pnlEdicion.add(lblPrecioTotal);

        pnlEdicion.add(txfPrecioTotal);
        
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
        
        btnAgregar.addActionListener(new ActionListener() {

            @Override

            public void actionPerformed(ActionEvent e) {

                agregarServicio();
            }
        });
        
        pnlControl.add(btnAgregar);

        return pnlControl;
    }

    private void agregarServicio() {

        Servicio servicioSeleccionado = (Servicio) cmbServicios.getSelectedItem();

        paquete.agregarServicio(servicioSeleccionado);
        
        txfPrecioTotal.setText(String.valueOf(paquete.getPrecioTotal()));
        
        JOptionPane.showMessageDialog(this, "Servicio agregado: " + servicioSeleccionado.getNombre());
    }
}
