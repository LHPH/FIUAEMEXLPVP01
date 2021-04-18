package juego;

import java.awt.Color;
import java.awt.Dimension;

import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Rectangle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EtchedBorder;

public class FTablero extends JFrame {
    //instanciar el objeto de los jugadores
    CJugador J1=new CJugador(this);
    public FTablero(int n) {
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
    }
    void setJugadores(String[] Nombres,int n){
        //vector para mostrar nombres
        String[] SJugadores=Nombres;
        //Mostrar y asignar vaiables en CJugador
        J1.setJugadores(SJugadores, n);
    }
}