package vista;

import control.ManipuladorMenu;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.JOptionPane;
import javax.swing.JDesktopPane;

public class VentanaPrincipal extends JFrame {

    private static VentanaPrincipal instancia;
    private JDesktopPane escritorio = new JDesktopPane();

    private VentanaPrincipal() {

        super("Menu Principal");

        add(escritorio);

        setJMenuBar(getBarraMenu());

        setVisible(true);

        setSize(600, 400);

        setLocationRelativeTo(null);

        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public static VentanaPrincipal getInstance() {

        if(instancia == null) {

            instancia = new VentanaPrincipal();

        }

        return instancia;

    }

    private JMenuBar getBarraMenu() {

        JMenuBar barraMenu = new JMenuBar();

        JMenu menu1 = new JMenu("Menu 1");

        JMenu menu2 = new JMenu("Menu 2");

        JMenu menu3 = new JMenu("Menu 3");

        JMenu menu4 = new JMenu("Menu 4");

        JMenu menu5 = new JMenu("Menu 5");

        JMenu menu6 = new JMenu("Menu 6");

        JMenu menu7 = new JMenu("Menu 7");

        JMenu menu8 = new JMenu("Menu 8");

        JMenu menu9 = new JMenu("Menu 9");

        JMenu menu10 = new JMenu("Menu 10");

        JMenu menu11 = new JMenu("Menu 11");

        JMenu menu12 = new JMenu("Menu 12");


        JMenuItem opcion11 = new JMenuItem("Alta de Clientes");

        JMenuItem opcion21 = new JMenuItem("Alta de Mascotas");

        JMenuItem opcion31 = new JMenuItem("Alta de veterninarios o asistente personal");

        JMenuItem opcion32 = new JMenuItem("Baja de veterninarios o asistente personal");

        JMenuItem opcion41 = new JMenuItem("Alta de gerente en sucursal");

        JMenuItem opcion51 = new JMenuItem("Registro de citas de veterninario a domicilio");

        JMenuItem opcion61 = new JMenuItem("Adopcion de mascotas");

        JMenuItem opcion62 = new JMenuItem("Devolucion de mascotas");

        JMenuItem opcion71 = new JMenuItem("Pago de paquetes");

        JMenuItem opcion81 = new JMenuItem("Consulta de citas de veterinarios");

        JMenuItem opcion91 = new JMenuItem("Consulta de paquetes");
        
        JMenuItem opcion101 = new JMenuItem("Consulta de adopciones");

        JMenuItem opcion111 = new JMenuItem("Consulta de veterninarios");

        JMenuItem opcion121 = new JMenuItem("Escritura de algo");

        JMenuItem opcionSalir = new JMenuItem("Salir");

        opcion11.addActionListener(ManipuladorMenu.getInstancia());

        opcionSalir.addActionListener(ManipuladorMenu.getInstancia());

        opcion21.addActionListener(ManipuladorMenu.getInstancia());

        opcion31.addActionListener(ManipuladorMenu.getInstancia());

        opcion32.addActionListener(ManipuladorMenu.getInstancia());

        opcion41.addActionListener(ManipuladorMenu.getInstancia());

        opcion51.addActionListener(ManipuladorMenu.getInstancia());

        opcion61.addActionListener(ManipuladorMenu.getInstancia());

        opcion62.addActionListener(ManipuladorMenu.getInstancia());

        opcion71.addActionListener(ManipuladorMenu.getInstancia());

        opcion81.addActionListener(ManipuladorMenu.getInstancia());

        opcion91.addActionListener(ManipuladorMenu.getInstancia());

        opcion101.addActionListener(ManipuladorMenu.getInstancia());

        opcion111.addActionListener(ManipuladorMenu.getInstancia());

        opcion121.addActionListener(ManipuladorMenu.getInstancia());

        menu1.add(opcion11);

        menu2.add(opcion21);

        menu3.add(opcion31);

        menu3.add(opcion32);

        menu4.add(opcion41);

        menu4.add(opcion41);

        menu5.add(opcion51);

        menu6.add(opcion61);

        menu6.add(opcion62);

        menu7.add(opcion71);

        menu8.add(opcion81);

        menu9.add(opcion91);

        menu10.add(opcion101);

        menu11.add(opcion111);
        
        menu12.add(opcion121);

        menu1.add(opcionSalir);

        barraMenu.add(menu1);

        barraMenu.add(menu2);

        barraMenu.add(menu3);

        barraMenu.add(menu4);

        barraMenu.add(menu5);

        barraMenu.add(menu6);

        barraMenu.add(menu7);

        barraMenu.add(menu8);

        barraMenu.add(menu9);

        barraMenu.add(menu10);

        barraMenu.add(menu11);

        return barraMenu;

    }

    public void mostrarMensaje(String texto) {

        JOptionPane.showMessageDialog(this, texto, "Mensaje: ", JOptionPane.PLAIN_MESSAGE);

    }

    public JDesktopPane getEscritorio() {

        return escritorio;

    }

}