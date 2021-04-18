package juego;

import java.awt.Dimension;
import java.awt.Frame;

import java.awt.Rectangle;

import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class DInstrucciones extends JDialog {
    private JTabbedPane TPInstrucciones = new JTabbedPane();
    private JPanel PInstricciones = new JPanel();
    private JPanel PAyuda = new JPanel();
    private JLabel jLabel1 = new JLabel();
    private JTextArea TAInstrucciones = new JTextArea();
    private JLabel jLabel2 = new JLabel();
    private JLabel jLabel3 = new JLabel();
    private JLabel jLabel4 = new JLabel();

    public DInstrucciones() {
        this(null, "", false);
    }

    public DInstrucciones(Frame parent, String title, boolean modal) {
        super(parent, title, modal);
        try {
            jbInit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void jbInit() throws Exception {
        this.setSize(new Dimension(400, 333));
        this.getContentPane().setLayout( null );
        this.setIconImage (new ImageIcon("sw_ico.png").getImage());
        this.setLocationRelativeTo(null);
        TPInstrucciones.setBounds(new Rectangle(15, 15, 360, 280));
        PInstricciones.setLayout(null);
        PAyuda.setLayout(null);
        TAInstrucciones.setBounds(new Rectangle(10, 10, 340, 245));
        TAInstrucciones.setText("Se juega entre dos o más persona. Se emplea un solo dado\n" +
                            "En cada jugada se tira solo una vez.\n" +
                            "En cada jugada la ficha se avanzará el numero de puntos \n" +
                            "que marque el dado. \n" +
                            "Cuando una ficha llegua a un numero donde este un\n" +
                            "Lightsaber rojo , la ficha se moverá a donde esta la punta\n" +
                            "del mismo.\n" +
                            "Si la ficha llega donde esta un Lightsaber verde, azul o \n" +
                            "morado se moverá donde esta la punta del Lightsaber.\n" +
                            "El triunfo lo tiene el jugador que exactamente llegue\n" +
                            "a la casilla \"Force\", advirtiendo que cuando el dado\n" +
                            "marque mayor numero de puntos que los necesarios para \n" +
                            "llegar a la Fuerza , la ficha regresara tantas casillas como\n" +
                            "números de fichas excedan.");
        jLabel2.setText("Version 1.1.2.1.0");
        jLabel2.setBounds(new Rectangle(125, 120, 100, 20));
        jLabel3.setText("Copyright © 1987, 2012 StarWars. All rights reserved.");
        jLabel3.setBounds(new Rectangle(40, 170, 300, 25));
        jLabel4.setText("Star Wars: Serpientes y Escaleras");
        jLabel4.setBounds(new Rectangle(100, 70, 205, 20));
        PInstricciones.add(TAInstrucciones, null);
        
        TPInstrucciones.addTab("Instrucciones", PInstricciones);
        PAyuda.add(jLabel4, null);
        PAyuda.add(jLabel3, null);
        PAyuda.add(jLabel2, null);
        TPInstrucciones.addTab("Acerca de...", PAyuda);
        this.getContentPane().add(TPInstrucciones, null);
    }
}
