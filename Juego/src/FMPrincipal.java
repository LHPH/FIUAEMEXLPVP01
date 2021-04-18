package juego;

import java.awt.Color;
import java.awt.Dimension;

import java.awt.Rectangle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;

public class FMPrincipal extends JFrame {
    String[] x={"2 Jugadores","3 Jugadores","4 Jugadores"};
    
    private JComboBox CBJugadores = new JComboBox(x);
    private JLabel LJugadores = new JLabel();
    private JButton BIniciar = new JButton();
    private JButton BInstrucciones = new JButton();
    private JLabel LNombre1 = new JLabel();
    private JLabel LNombre2 = new JLabel();
    private JLabel LNombre3 = new JLabel();
    private JLabel LNombre4 = new JLabel();
    private JTextField CBNombre1 = new JTextField();
    private JTextField CBNombre2 = new JTextField();
    private JTextField CBNombre3 = new JTextField();
    private JTextField CBNombre4 = new JTextField();
    private JLabel Inicio = new JLabel(new ImageIcon("Logo.png"));

    public FMPrincipal() {
        try {
            jbInit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void jbInit() throws Exception {
        this.getContentPane().setLayout( null );
        this.setSize(new Dimension(811, 576));
        this.setTitle("Serpientes y escaleras");
        this.setIconImage (new ImageIcon("sw_ico.png").getImage());
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        
        //Poner El Reproductor de Musica
        
        
        CBJugadores.setBounds(new Rectangle(30, 70, 155, 20));
        CBJugadores.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    CBJugadores_actionPerformed(e);
                }
            });
        LJugadores.setText("Seleccione el numero de jugadores");
        LJugadores.setBounds(new Rectangle(30, 35, 220, 20));
        BIniciar.setText("Iniciar");
        BIniciar.setBounds(new Rectangle(30, 215, 70, 20));
        BIniciar.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    BIniciar_actionPerformed(e);
                }
            });
        BInstrucciones.setText("Instrucciones");
        BInstrucciones.setBounds(new Rectangle(35, 490, 125, 20));
        BInstrucciones.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    BInstrucciones_actionPerformed(e);
                }
            });
        LNombre1.setText("Nombre del Jugador");
        LNombre1.setBounds(new Rectangle(30, 105, 100, 20));
        LNombre2.setText("Nombre del Jugador");
        LNombre2.setBounds(new Rectangle(30, 130, 100, 20));
        LNombre3.setText("Nombre del Jugador");
        LNombre3.setBounds(new Rectangle(30, 155, 100, 20));
        LNombre4.setText("Nombre del Jugador");
        LNombre4.setBounds(new Rectangle(30, 180, 100, 20));
        CBNombre1.setBounds(new Rectangle(135, 105, 105, 20));
        CBNombre1.setText("Jugador 1");
        CBNombre1.setEditable(true);
        CBNombre2.setBounds(new Rectangle(135, 130, 105, 20));
        CBNombre2.setText("Jugador 2");
        CBNombre2.setEditable(true);
        CBNombre3.setBounds(new Rectangle(135, 155, 105, 20));
        CBNombre3.setText("Jugador 3");
        CBNombre3.setEditable(true);
        CBNombre4.setBounds(new Rectangle(135, 180, 105, 20));
        CBNombre4.setText("Jugador 4");
        CBNombre4.setEditable(true);
        LNombre3.setVisible(false);
        LNombre4.setVisible(false);
        CBNombre3.setVisible(false);
        CBNombre4.setVisible(false);

        Inicio.setBounds(new Rectangle(0, 0, 810, 555));
        Inicio.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.getContentPane().add(CBNombre4, null);
        this.getContentPane().add(CBNombre3, null);
        this.getContentPane().add(CBNombre2, null);
        this.getContentPane().add(CBNombre1, null);
        this.getContentPane().add(LNombre4, null);
        this.getContentPane().add(LNombre3, null);
        this.getContentPane().add(LNombre2, null);
        this.getContentPane().add(LNombre1, null);
        this.getContentPane().add(BInstrucciones, null);
        this.getContentPane().add(BIniciar, null);
        this.getContentPane().add(LJugadores, null);
        this.getContentPane().add(CBJugadores, null);
        this.getContentPane().add(Inicio, null);
    }

    private void BInstrucciones_actionPerformed(ActionEvent e) {
        CAudio x=new CAudio();
        x.setAudio("SBoton.wav");
        DInstrucciones I= new DInstrucciones(null,"Instrucciones",true);
        I.setVisible(true);
    }

    private void BIniciar_actionPerformed(ActionEvent e) {
        //reproducir sonido
        CAudio x=new CAudio();
        x.setAudio("SBoton.wav");
        this.dispose();
        //pasa saber cuantos jugadores son
        int i=CBJugadores.getSelectedIndex();
        i=i+2;
        //meter los nombres de los jugadores a un vector
        String[] SNJ = new String[4];
        if(i==2){
            SNJ[0]=CBNombre1.getText();
            SNJ[1]=CBNombre2.getText();
        }else{
            if(i==3){
                SNJ[0]=CBNombre1.getText();
                SNJ[1]=CBNombre2.getText();
                SNJ[2]=CBNombre3.getText();
            }else{
                SNJ[0]=CBNombre1.getText();
                SNJ[1]=CBNombre2.getText();
                SNJ[2]=CBNombre3.getText();
                SNJ[3]=CBNombre4.getText();
            }
        }
        //crear el tablero y mostrarlo
        FTablero T=new FTablero(i);
        T.setJugadores(SNJ,i);
        T.setVisible(true);
    }

    private void CBJugadores_actionPerformed(ActionEvent e) {
        //cargar nombres
        //para que el jugador pueda escribir su nombre
        int i=CBJugadores.getSelectedIndex();
        i=i+2;
        //mostrar los combobox  necesarios para el numero de jugadores
        if(i==2){
            LNombre3.setVisible(false);
            CBNombre3.setVisible(false);
            LNombre4.setVisible(false);
            CBNombre4.setVisible(false);
        }else{
            if(i==3){
                LNombre3.setVisible(true);
                CBNombre3.setVisible(true);
                LNombre4.setVisible(false);
                CBNombre4.setVisible(false);
            }else{
                LNombre3.setVisible(true);
                CBNombre3.setVisible(true);
                LNombre4.setVisible(true);
                CBNombre4.setVisible(true);
            }   
        }        
    }
}
