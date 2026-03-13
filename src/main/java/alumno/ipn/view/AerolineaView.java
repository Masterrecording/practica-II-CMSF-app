package alumno.ipn.view;

import javax.swing.*;
import java.awt.*;

public class AerolineaView extends JFrame {

    public JTextField Tnombre = new JTextField();
    public JTextField Tpais = new JTextField();
    public JTextField Tfundacion = new JTextField();

    public JButton Bguardar = new JButton("Guardar");

    public AerolineaView(){

        setTitle("Registro Aerolinea");
        setSize(350,300);
        setLayout(new GridLayout(4,2));

        add(new JLabel("Nombre:"));
        add(Tnombre);

        add(new JLabel("Pais:"));
        add(Tpais);

        add(new JLabel("Fundacion:"));
        add(Tfundacion);

        add(Bguardar);

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}