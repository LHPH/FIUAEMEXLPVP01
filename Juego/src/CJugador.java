package juego;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;

public class CJugador extends JPanel implements ActionListener{
    //coordenadas
    int auxtimerX=0;
    int auxtimerY=0;
    int[] x=new int[4];
    int[] y=new int[4];
    int[] f=new int[4];
    boolean[] b=new boolean[4];
    //variable para jugadores
    int Jugadores=0;
    //turno actual
    int turno=0;
    //numero en el dado
    int dado=0;
    //tiempo
    Timer timer;
    //variable para fondos de estrella
    int E=1;
    //cadena de nombres
    String[] Nombre = new String[4];
    //etiquetas para img
    JLabel Inicio = new JLabel();
    JLabel Fin = new JLabel();        
    JLabel SE = new JLabel(new ImageIcon("tablero SW.png"));
    JLabel Casilla1 = new JLabel(new ImageIcon("sw_01.png"));
    JLabel Casilla2 = new JLabel(new ImageIcon("sw_02.png"));
    JLabel Casilla3 = new JLabel(new ImageIcon("sw_03.png"));
    JLabel Casilla4 = new JLabel(new ImageIcon("sw_04.png"));
    JLabel Casilla5 = new JLabel(new ImageIcon("sw_05.png"));        
    JLabel Casilla6 = new JLabel(new ImageIcon("sw_06.png"));
    JLabel Casilla7 = new JLabel(new ImageIcon("sw_07.png"));
    JLabel Casilla8 = new JLabel(new ImageIcon("sw_08.png"));
    JLabel Casilla9 = new JLabel(new ImageIcon("sw_09.png"));
    JLabel Casilla10 = new JLabel(new ImageIcon("sw_10.png"));
    JLabel Casilla11 = new JLabel(new ImageIcon("sw_11.png"));
    JLabel Casilla12 = new JLabel(new ImageIcon("sw_12.png"));
    JLabel Casilla13 = new JLabel(new ImageIcon("sw_13.png"));
    JLabel Casilla14 = new JLabel(new ImageIcon("sw_14.png"));
    JLabel Casilla15 = new JLabel(new ImageIcon("sw_15.png"));
    JLabel Casilla16 = new JLabel(new ImageIcon("sw_16.png"));
    JLabel Casilla17 = new JLabel(new ImageIcon("sw_17.png"));
    JLabel Casilla18 = new JLabel(new ImageIcon("sw_18.png"));
    JLabel Casilla19 = new JLabel(new ImageIcon("sw_19.png"));
    JLabel Casilla24 = new JLabel(new ImageIcon("sw_24.png"));
    JLabel Casilla23 = new JLabel(new ImageIcon("sw_23.png"));
    JLabel Casilla22 = new JLabel(new ImageIcon("sw_22.png"));
    JLabel Casilla21 = new JLabel(new ImageIcon("sw_21.png"));
    JLabel Casilla20 = new JLabel(new ImageIcon("sw_20.png"));
    JLabel Casilla25 = new JLabel(new ImageIcon("sw_25.png"));
    JLabel Casilla26 = new JLabel(new ImageIcon("sw_26.png"));
    JLabel Casilla27 = new JLabel(new ImageIcon("sw_27.png"));
    JLabel Casilla28 = new JLabel(new ImageIcon("sw_28.png"));
    JLabel Casilla29 = new JLabel(new ImageIcon("sw_.png"));
    JLabel Casilla30 = new JLabel(new ImageIcon("sw_30.png"));
    JLabel Casilla31 = new JLabel(new ImageIcon("sw_34.png"));
    JLabel Casilla32 = new JLabel(new ImageIcon("sw_37.png"));
    JLabel Casilla33 = new JLabel(new ImageIcon("sw_33.png"));
    JLabel Casilla34 = new JLabel(new ImageIcon("sw_20.png"));
    JLabel Casilla35 = new JLabel(new ImageIcon("sw_13.png"));
    JLabel Casilla36 = new JLabel(new ImageIcon("sw_19.png"));
    JLabel Casilla37 = new JLabel(new ImageIcon("sw_14.png"));
    JLabel Casilla38 = new JLabel(new ImageIcon("sw_23.png"));
    JLabel Casilla39 = new JLabel(new ImageIcon("sw_32.png"));
    JLabel Casilla40 = new JLabel(new ImageIcon("sw_27.png"));
    JLabel Casilla41 = new JLabel(new ImageIcon("sw_11.png"));
    JLabel Casilla42 = new JLabel(new ImageIcon("sw_10.png"));
    JLabel Casilla43 = new JLabel(new ImageIcon("sw_08.png"));
    JLabel Casilla44 = new JLabel(new ImageIcon("sw_04.png"));
    JLabel Casilla45 = new JLabel(new ImageIcon("sw_15.png"));
    JLabel Casilla46 = new JLabel(new ImageIcon("sw_28.png"));
    JLabel Casilla47 = new JLabel(new ImageIcon("sw_25.png"));
    JLabel Casilla48 = new JLabel(new ImageIcon("sw_21.png"));
    JLabel Casilla49 = new JLabel(new ImageIcon("sw_06.png"));
    JLabel Casilla50 = new JLabel(new ImageIcon("sw_03.png"));
    JLabel Casilla51 = new JLabel(new ImageIcon("sw_01.png"));
    JLabel Casilla52 = new JLabel(new ImageIcon("sw_12.png"));
    JLabel Casilla53 = new JLabel(new ImageIcon("sw_09.png"));
    JLabel Casilla54 = new JLabel(new ImageIcon("sw_07.png"));
    JLabel Casilla55 = new JLabel(new ImageIcon("sw_05.png"));
    JLabel Casilla56 = new JLabel(new ImageIcon("sw_02.png"));        
    JLabel LJugador1 = new JLabel();
    JLabel LJugador2 = new JLabel();
    JLabel LJugador3 = new JLabel();
    JLabel LJugador4 = new JLabel();
    JLabel Inicio1 = new JLabel(new ImageIcon("Estrellas1.png"));    
    JButton BRegresar = new JButton();    
    JButton BDado = new JButton();
    //Frame que contendra el Jpanel y que tomara el valor de FTablero
    JFrame t=new JFrame();

    public CJugador(JFrame T) { 
        t=T;
        
        //inicialiar coordenadas
        x[0]=50;y[0]=20;f[0]=1;b[0]=false;
        x[1]=50;y[1]=35;f[1]=1;b[1]=false;
        x[2]=50;y[2]=50;f[2]=1;b[2]=false;
        x[3]=50;y[3]=65;f[3]=1;b[3]=false;
        
        LJugador1.setForeground(Color.blue);
        
        Inicio.setText("Darck Side");
        Inicio.setBounds(new Rectangle(20, 15, 70, 65));
        Inicio.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));        
        Fin.setText("Force");
        Fin.setBounds(new Rectangle(650, 405, 70, 65));
        Fin.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));        
        Inicio1.setBounds(new Rectangle(0, 0, 810, 555));
        SE.setBounds(new Rectangle(0, 0, 750, 500));
        //Inicio1.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));        
        Casilla1.setBounds(new Rectangle(90, 15, 70, 65));
        Casilla1.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        Casilla2.setBounds(new Rectangle(160, 15, 70, 65));
        Casilla2.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        Casilla3.setBounds(new Rectangle(230, 15, 70, 65));
        Casilla3.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        Casilla4.setBounds(new Rectangle(300, 15, 70, 65));
        Casilla4.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        Casilla5.setBounds(new Rectangle(370, 15, 70, 65));
        Casilla5.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        Casilla6.setBounds(new Rectangle(440, 15, 70, 65));
        Casilla6.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        Casilla7.setBounds(new Rectangle(510, 15, 70, 65));
        Casilla7.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        Casilla8.setBounds(new Rectangle(580, 15, 70, 65));
        Casilla8.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        Casilla9.setBounds(new Rectangle(90, 80, 70, 65));
        Casilla9.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        Casilla10.setBounds(new Rectangle(160, 80, 70, 65));
        Casilla10.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        Casilla11.setBounds(new Rectangle(230, 80, 70, 65));
        Casilla11.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        Casilla12.setBounds(new Rectangle(300, 80, 70, 65));
        Casilla12.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        Casilla13.setBounds(new Rectangle(370, 80, 70, 65));
        Casilla13.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        Casilla14.setBounds(new Rectangle(440, 80, 70, 65));
        Casilla14.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        Casilla15.setBounds(new Rectangle(510, 80, 70, 65));
        Casilla15.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        Casilla16.setBounds(new Rectangle(580, 80, 70, 65));
        Casilla16.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        Casilla17.setBounds(new Rectangle(90, 145, 70, 65));
        Casilla17.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        Casilla18.setBounds(new Rectangle(160, 145, 70, 65));
        Casilla18.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        Casilla19.setBounds(new Rectangle(230, 145, 70, 65));
        Casilla19.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        Casilla24.setBounds(new Rectangle(580, 145, 70, 65));
        Casilla24.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        Casilla23.setBounds(new Rectangle(510, 145, 70, 65));
        Casilla23.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        Casilla22.setBounds(new Rectangle(440, 145, 70, 65));
        Casilla22.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        Casilla21.setBounds(new Rectangle(370, 145, 70, 65));
        Casilla21.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        Casilla20.setBounds(new Rectangle(300, 145, 70, 65));
        Casilla20.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        Casilla25.setBounds(new Rectangle(90, 210, 70, 65));
        Casilla25.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        Casilla26.setBounds(new Rectangle(160, 210, 70, 65));
        Casilla26.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        Casilla27.setBounds(new Rectangle(230, 210, 70, 65));
        Casilla27.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        Casilla28.setBounds(new Rectangle(300, 210, 70, 65));
        Casilla28.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        Casilla29.setBounds(new Rectangle(370, 210, 70, 65));
        Casilla29.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        Casilla30.setBounds(new Rectangle(440, 210, 70, 65));
        Casilla30.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        Casilla31.setBounds(new Rectangle(510, 210, 70, 65));
        Casilla31.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        Casilla32.setBounds(new Rectangle(580, 210, 70, 65));
        Casilla32.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        Casilla33.setBounds(new Rectangle(90, 275, 70, 65));
        Casilla33.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        Casilla34.setBounds(new Rectangle(160, 275, 70, 65));
        Casilla34.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        Casilla35.setBounds(new Rectangle(230, 275, 70, 65));
        Casilla35.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        Casilla36.setBounds(new Rectangle(300, 275, 70, 65));
        Casilla36.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        Casilla37.setBounds(new Rectangle(370, 275, 70, 65));
        Casilla37.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        Casilla38.setBounds(new Rectangle(440, 275, 70, 65));
        Casilla38.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        Casilla39.setBounds(new Rectangle(510, 275, 70, 65));
        Casilla39.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        Casilla40.setBounds(new Rectangle(580, 275, 70, 65));
        Casilla40.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        Casilla41.setBounds(new Rectangle(90, 340, 70, 65));
        Casilla41.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        Casilla42.setBounds(new Rectangle(160, 340, 70, 65));
        Casilla42.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        Casilla43.setBounds(new Rectangle(230, 340, 70, 65));
        Casilla43.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        Casilla44.setBounds(new Rectangle(300, 340, 70, 65));
        Casilla44.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        Casilla45.setBounds(new Rectangle(370, 340, 70, 65));
        Casilla45.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        Casilla46.setBounds(new Rectangle(440, 340, 70, 65));
        Casilla46.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        Casilla47.setBounds(new Rectangle(510, 340, 70, 65));
        Casilla47.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        Casilla48.setBounds(new Rectangle(580, 340, 70, 65));
        Casilla48.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        Casilla49.setBounds(new Rectangle(90, 405, 70, 65));
        Casilla49.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        Casilla50.setBounds(new Rectangle(160, 405, 70, 65));
        Casilla50.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        Casilla51.setBounds(new Rectangle(230, 405, 70, 65));
        Casilla51.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        Casilla52.setBounds(new Rectangle(300, 405, 70, 65));
        Casilla52.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        Casilla53.setBounds(new Rectangle(370, 405, 70, 65));
        Casilla53.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        Casilla54.setBounds(new Rectangle(440, 405, 70, 65));
        Casilla54.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        Casilla55.setBounds(new Rectangle(510, 405, 70, 65));
        Casilla55.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        Casilla56.setBounds(new Rectangle(580, 405, 70, 65));
        Casilla56.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        //nombres de los jugadores
        LJugador1.setBounds(new Rectangle(665, 15, 70, 20));
        LJugador2.setBounds(new Rectangle(665, 40, 60, 20));
        LJugador3.setBounds(new Rectangle(665, 70, 60, 20));
        LJugador4.setBounds(new Rectangle(665, 100, 60, 20));
        //botones
        BRegresar.setText("Regresar");
        BRegresar.setBounds(new Rectangle(25, 495, 115, 20));
        BRegresar.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    BRegresar_actionPerformed(e);
                }
            });
        BDado.setBounds(new Rectangle(660, 145, 75, 70));
        BDado.setIcon(new ImageIcon("Dado6.png"));
        //LJugador1.add
        BDado.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    BDado_actionPerformed(e);
                }
            });
        //fonde de estrella
        //lo que mtemos al panel
        this.add(SE, null);
        this.add(BDado, null);
        this.add(BRegresar, null);
        this.add(LJugador4, null);
        this.add(LJugador3, null);
        this.add(LJugador2, null);
        this.add(LJugador1, null);
        this.add(Inicio1, null);
        this.add(Fin, null);
        this.add(Inicio, null);        
        this.add(Casilla56, null);
        this.add(Casilla55, null);
        this.add(Casilla54, null);
        this.add(Casilla53, null);
        this.add(Casilla52, null);
        this.add(Casilla51, null);
        this.add(Casilla50, null);
        this.add(Casilla49, null);
        this.add(Casilla48, null);
        this.add(Casilla47, null);
        this.add(Casilla46, null);
        this.add(Casilla45, null);
        this.add(Casilla44, null);
        this.add(Casilla43, null);
        this.add(Casilla42, null);
        this.add(Casilla41, null);
        this.add(Casilla40, null);
        this.add(Casilla39, null);
        this.add(Casilla38, null);
        this.add(Casilla37, null);
        this.add(Casilla36, null);
        this.add(Casilla35, null);
        this.add(Casilla34, null);
        this.add(Casilla33, null);
        this.add(Casilla32, null);
        this.add(Casilla31, null);
        this.add(Casilla30, null);
        this.add(Casilla29, null);
        this.add(Casilla28, null);
        this.add(Casilla27, null);
        this.add(Casilla26, null);
        this.add(Casilla25, null);
        this.add(Casilla20, null);
        this.add(Casilla21, null);
        this.add(Casilla22, null);
        this.add(Casilla23, null);
        this.add(Casilla24, null);
        this.add(Casilla19, null);
        this.add(Casilla18, null);
        this.add(Casilla17, null);
        this.add(Casilla16, null);
        this.add(Casilla15, null);
        this.add(Casilla14, null);
        this.add(Casilla13, null);
        this.add(Casilla12, null);
        this.add(Casilla11, null);
        this.add(Casilla10, null);
        this.add(Casilla9, null);
        this.add(Casilla8, null);
        this.add(Casilla7, null);
        this.add(Casilla6, null);
        this.add(Casilla5, null);
        this.add(Casilla4, null);
        this.add(Casilla3, null);
        this.add(Casilla2, null);
        this.add(Casilla1, null);
        this.add(Inicio1, null);
        //lugar del panel
        this.setBounds(100, 100, 300, 300);
        this.setBorder(new EmptyBorder(5, 5, 5, 5));
        //meter lo del panel al frame
        T.getContentPane().add(this,null);
        this.setLayout(null);
        this.setBounds(0,0,800,600);
    }

    public void paint(Graphics g) {
        //tamaño del circulo
        int tam=12;
        //pintar el jpanel
        super.paint(g);
        //saber cuantos circulos vamos a dibujar
        switch (Jugadores){
        case 2:
            //jugador 1
            g.setColor(Color.blue);
            g.fillOval(x[0],y[0], tam, tam);
            //juador 2
            g.setColor(Color.red);
            g.fillOval(x[1],y[1], tam, tam);
            break;
        case 3:
            //jugador 1
            g.setColor(Color.blue);
            g.fillOval(x[0],y[0], tam, tam);
            //juador 2
            g.setColor(Color.red);
            g.fillOval(x[1],y[1], tam, tam);
            //juador 3
            g.setColor(Color.green);
            g.fillOval(x[2],y[2], tam, tam);
                break;
        case 4:
            //jugador 1
            g.setColor(Color.blue);
            g.fillOval(x[0],y[0], tam, tam);
            //juador 2
            g.setColor(Color.red);
            g.fillOval(x[1],y[1], tam, tam);
            //juador 3
            g.setColor(Color.green);
            g.fillOval(x[2],y[2], tam, tam);
            //jugador 4
            g.setColor(Color.yellow);
            g.fillOval(x[3],y[3], tam, tam);
                break;
        }
        //Pintar A Las Casillas Los Numeros al Tablero
                //Casilla 1
                g.setColor(Color.WHITE);
                g.setFont(new Font("Tahoma",Font.BOLD,10));
                g.drawString("Darck Side",30 ,50);
                //Casilla 2
                g.setColor(Color.WHITE);
                g.setFont(new Font("Tahoma",Font.BOLD,10));
                g.drawString("1",150 ,75);
                //Casilla 3
                g.setColor(Color.WHITE);
                g.setFont(new Font("Tahoma",Font.BOLD,10));
                g.drawString("2",220 ,75);
                //Casilla 4
                g.setColor(Color.WHITE);
                g.setFont(new Font("Tahoma",Font.BOLD,10));
                g.drawString("3",290 ,75);
                //Casilla 5
                g.setColor(Color.WHITE);
                g.setFont(new Font("Tahoma",Font.BOLD,10));
                g.drawString("4",360 ,75);
                //Casilla 6
                g.setColor(Color.WHITE);
                g.setFont(new Font("Tahoma",Font.BOLD,10));
                g.drawString("5",430 ,75);
                //Casilla 7
                g.setColor(Color.WHITE);
                g.setFont(new Font("Tahoma",Font.BOLD,10));
                g.drawString("6",500 ,75);
                //Casilla 8
                g.setColor(Color.WHITE);
                g.setFont(new Font("Tahoma",Font.BOLD,10));
                g.drawString("7",570 ,75);
                //Casilla 9
                g.setColor(Color.WHITE);
                g.setFont(new Font("Tahoma",Font.BOLD,10));
                g.drawString("8",640 ,75);
                //Casilla 10
                g.setColor(Color.WHITE);
                g.setFont(new Font("Tahoma",Font.BOLD,10));
                g.drawString("16",145 ,140);
                //Casilla 11
                g.setColor(Color.WHITE);
                g.setFont(new Font("Tahoma",Font.BOLD,10));
                g.drawString("15",215 ,140);
                //Casilla 12
                g.setColor(Color.WHITE);
                g.setFont(new Font("Tahoma",Font.BOLD,10));
                g.drawString("14",285 ,140);
                //Casilla 13
                g.setColor(Color.WHITE);
                g.setFont(new Font("Tahoma",Font.BOLD,10));
                g.drawString("13",355 ,140);
                //Casilla 14
                g.setColor(Color.WHITE);
                g.setFont(new Font("Tahoma",Font.BOLD,10));
                g.drawString("12",425 ,140);
                //Casilla 15
                g.setColor(Color.WHITE);
                g.setFont(new Font("Tahoma",Font.BOLD,10));
                g.drawString("11",495 ,140);
                //Casilla 16
                g.setColor(Color.WHITE);
                g.setFont(new Font("Tahoma",Font.BOLD,10));
                g.drawString("10",565 ,140);
                //Casilla 17
                g.setColor(Color.WHITE);
                g.setFont(new Font("Tahoma",Font.BOLD,10));
                g.drawString("9",635 ,140);
                //Casilla 18
                g.setColor(Color.WHITE);
                g.setFont(new Font("Tahoma",Font.BOLD,10));
                g.drawString("17",145,205);
                //Casilla 19
                g.setColor(Color.WHITE);
                g.setFont(new Font("Tahoma",Font.BOLD,10));
                g.drawString("18",215,205);
                //Casilla 20
                g.setColor(Color.WHITE);
                g.setFont(new Font("Tahoma",Font.BOLD,10));
                g.drawString("19",285,205);
                //Casilla 21
                g.setColor(Color.WHITE);
                g.setFont(new Font("Tahoma",Font.BOLD,10));
                g.drawString("20",355,205);
                //Casilla 22
                g.setColor(Color.WHITE);
                g.setFont(new Font("Tahoma",Font.BOLD,10));
                g.drawString("21",425,205);
                //Casilla 23
                g.setColor(Color.WHITE);
                g.setFont(new Font("Tahoma",Font.BOLD,10));
                g.drawString("22",495,205);
                //Casilla 24
                g.setColor(Color.WHITE);
                g.setFont(new Font("Tahoma",Font.BOLD,10));
                g.drawString("23",565,205);
                //Casilla 25
                g.setColor(Color.WHITE);
                g.setFont(new Font("Tahoma",Font.BOLD,10));
                g.drawString("24",635,205);
                //Casilla 26
                g.setColor(Color.WHITE);
                g.setFont(new Font("Tahoma",Font.BOLD,10));
                g.drawString("32",145,270);
                //Casilla 27
                g.setColor(Color.WHITE);
                g.setFont(new Font("Tahoma",Font.BOLD,10));
                g.drawString("31",215,270);
                //Casilla 28
                g.setColor(Color.WHITE);
                g.setFont(new Font("Tahoma",Font.BOLD,10));
                g.drawString("30",285,270);
                //Casilla 29
                g.setColor(Color.WHITE);
                g.setFont(new Font("Tahoma",Font.BOLD,10));
                g.drawString("29",355,270);
                //Casilla 30
                g.setColor(Color.WHITE);
                g.setFont(new Font("Tahoma",Font.BOLD,10));
                g.drawString("28",425,270);
                //Casilla 31
                g.setColor(Color.WHITE);
                g.setFont(new Font("Tahoma",Font.BOLD,10));
                g.drawString("27",495,270);
                //Casilla 32
                g.setColor(Color.WHITE);
                g.setFont(new Font("Tahoma",Font.BOLD,10));
                g.drawString("26",565,270);
                //Casilla 33
                g.setColor(Color.WHITE);
                g.setFont(new Font("Tahoma",Font.BOLD,10));
                g.drawString("25",635,270);
                //Casilla 34
                g.setColor(Color.WHITE);
                g.setFont(new Font("Tahoma",Font.BOLD,10));
                g.drawString("33",145,335);
                //Casilla 35
                g.setColor(Color.WHITE);
                g.setFont(new Font("Tahoma",Font.BOLD,10));
                g.drawString("34",215,335);
                //Casilla 36
                g.setColor(Color.WHITE);
                g.setFont(new Font("Tahoma",Font.BOLD,10));
                g.drawString("35",285,335);
                //Casilla 37
                g.setColor(Color.WHITE);
                g.setFont(new Font("Tahoma",Font.BOLD,10));
                g.drawString("36",355,335);
                //Casilla 38
                g.setColor(Color.WHITE);
                g.setFont(new Font("Tahoma",Font.BOLD,10));
                g.drawString("37",425,335);
                //Casilla 39
                g.setColor(Color.WHITE);
                g.setFont(new Font("Tahoma",Font.BOLD,10));
                g.drawString("38",495,335);
                //Casilla 40
                g.setColor(Color.WHITE);
                g.setFont(new Font("Tahoma",Font.BOLD,10));
                g.drawString("39",565,335);
                //Casilla 41
                g.setColor(Color.WHITE);
                g.setFont(new Font("Tahoma",Font.BOLD,10));
                g.drawString("40",635,335);
                //Casilla 42
                g.setColor(Color.WHITE);
                g.setFont(new Font("Tahoma",Font.BOLD,10));
                g.drawString("48",145,400);
                //Casilla 43
                g.setColor(Color.WHITE);
                g.setFont(new Font("Tahoma",Font.BOLD,10));
                g.drawString("47",215,400);
                //Casilla 43
                g.setColor(Color.WHITE);
                g.setFont(new Font("Tahoma",Font.BOLD,10));
                g.drawString("46",285,400);
                //Casilla 44
                g.setColor(Color.WHITE);
                g.setFont(new Font("Tahoma",Font.BOLD,10));
                g.drawString("45",355,400);
                //Casilla 45
                g.setColor(Color.WHITE);
                g.setFont(new Font("Tahoma",Font.BOLD,10));
                g.drawString("44",425,400);
                //Casilla 46
                g.setColor(Color.WHITE);
                g.setFont(new Font("Tahoma",Font.BOLD,10));
                g.drawString("43",495,400);
                //Casilla 47
                g.setColor(Color.WHITE);
                g.setFont(new Font("Tahoma",Font.BOLD,10));
                g.drawString("42",565,400);
                //Casilla 48
                g.setColor(Color.WHITE);
                g.setFont(new Font("Tahoma",Font.BOLD,10));
                g.drawString("41",635,400);
                //Casilla 49
                g.setColor(Color.WHITE);
                g.setFont(new Font("Tahoma",Font.BOLD,10));
                g.drawString("49",145,465);
                //Casilla 50
                g.setColor(Color.WHITE);
                g.setFont(new Font("Tahoma",Font.BOLD,10));
                g.drawString("50",215,465);
                //Casilla 51
                g.setColor(Color.WHITE);
                g.setFont(new Font("Tahoma",Font.BOLD,10));
                g.drawString("51",285,465);
                //Casilla 52
                g.setColor(Color.WHITE);
                g.setFont(new Font("Tahoma",Font.BOLD,10));
                g.drawString("52",355,465);
                //Casilla 53
                g.setColor(Color.WHITE);
                g.setFont(new Font("Tahoma",Font.BOLD,10));
                g.drawString("53",425,465);
                //Casilla 54
                g.setColor(Color.WHITE);
                g.setFont(new Font("Tahoma",Font.BOLD,10));
                g.drawString("54",495,465);
                //Casilla 55
                g.setColor(Color.WHITE);
                g.setFont(new Font("Tahoma",Font.BOLD,10));
                g.drawString("55",565,465);
                //Casilla 56
                g.setColor(Color.WHITE);
                g.setFont(new Font("Tahoma",Font.BOLD,10));
                g.drawString("56",635,465);
                //Casilla 57
                g.setColor(Color.WHITE);
                g.setFont(new Font("Tahoma",Font.BOLD,10));
                g.drawString("The Force",660,440);

    }
    private void BDado_actionPerformed(ActionEvent f) {
        //se reproduce un sonido
        CAudio A=new CAudio();
        A.setAudio("SDado.wav");
        //esto es para que al oprimir el boton del dado se cambie una imagen de fondo
        if(E==1){
            E=2;
        }else{
            E=1;
        }
        Inicio1.setIcon(new ImageIcon("Estrellas"+E+".png"));
        //invocamos a metodo dado para saber que numero toco y luego iniciamos la animacion
        dado=this.Dado();
        this.Animacion();
        //deshabilitamos boton en lo q esta la animacion
        BDado.setEnabled(false);
    }
    int Dado(){
        //se invoca al metodo random para asignar un numero aleatorio al dado
        int n=(int)(Math.random()*6);
        n++;
        //se muestra el numero en una imagen para el botono
        BDado.setIcon(new ImageIcon("Dado"+n+".png"));
        return n;
    }

    private void BRegresar_actionPerformed(ActionEvent e) {
        //esto es para regresar al menu principal, antes de regresar se reproduce un sonido y se crea el nuevo objeto
        CAudio x=new CAudio();
        x.setAudio("SBoton.wav");
        t.dispose();
        FMPrincipal MP=new FMPrincipal();
        MP.setVisible(true);
    }
    void setJugadores(String[] Nombres,int n){
        //esto es para mostrar los nombres de los jugadores en el tablero
        this.Jugadores=n;
        Nombre=Nombres;
        switch (n){
        case 2:
            //se muestran solo 2 nombres y las etiquetas 3 y 4 se ocultan
            LJugador1.setText(Nombres[0]);
            LJugador2.setText(Nombres[1]);
            LJugador3.setVisible(false);
            LJugador4.setVisible(false);
            break;
        case 3:
            //se muestran 3 nombres y el 4° se oculta
            LJugador1.setText(Nombres[0]);
            LJugador2.setText(Nombres[1]);
            LJugador3.setText(Nombres[2]);
            LJugador4.setVisible(false);
            break;
        case 4:
            //se muestran los 4 nombres
            LJugador1.setText(Nombres[0]);
            LJugador2.setText(Nombres[1]);
            LJugador3.setText(Nombres[2]);
            LJugador4.setText(Nombres[3]);
            break;
        }
    }
    void getTurno(){
        //ciclo de jugadores
        if(turno==Jugadores){
            turno=1;
        }else{
            turno++;
        }
    }
    void Animacion(){
        this.getTurno();
        timer = new Timer(20, this);
        timer.restart();
    }
    void PreNombre(int t){
        if(t==Jugadores){
            t=1;
        }else{
            t++;
        }
        switch(t){
        case 1:
            LJugador1.setForeground(Color.BLUE);
            LJugador2.setForeground(Color.WHITE);
            LJugador3.setForeground(Color.WHITE);
            LJugador4.setForeground(Color.WHITE);
            break;
        case 2:
            LJugador1.setForeground(Color.WHITE);
            LJugador2.setForeground(Color.RED);
            LJugador3.setForeground(Color.WHITE);
            LJugador4.setForeground(Color.WHITE);
            break;
        case 3:
            LJugador1.setForeground(Color.WHITE);
            LJugador2.setForeground(Color.WHITE);
            LJugador3.setForeground(Color.GREEN);
            LJugador4.setForeground(Color.WHITE);
            break;
        case 4:
            LJugador1.setForeground(Color.WHITE);
            LJugador2.setForeground(Color.WHITE);
            LJugador3.setForeground(Color.WHITE);
            LJugador4.setForeground(Color.YELLOW);
            break;
        }
    }
    public void actionPerformed(ActionEvent e){
        //mover la pieza
        this.Movimientos();
        this.Detener();
        //redibujar ficha
        repaint();
    }
    void Movimientos(){
        //columnas nones avanzan a la derecha
        if(f[turno-1]==1 || f[turno-1]==3 || f[turno-1]==5){
            //mientras no llegue a la ultima casilla de la fila se mueve en x
            if(x[turno-1]!=610){
                x[turno-1]=x[turno-1]+5;
                //contador de movimientos
                auxtimerX++;
            }else{
                //en la ultima casilla de la fila debe de bajar
                this.bajar(turno);
            }
        }else{
            if(f[turno-1]==2 || f[turno-1]==4 || f[turno-1]==6){
                //columnas pares avanzan a la izquierda
                if(x[turno-1]!=120){
                    x[turno-1]=x[turno-1]-5;
                    //contador de movimientos
                    auxtimerX++;
                }else{
                    this.bajar(turno);
                }
            }else{
                //ultima fila
                if(f[turno-1]==7){
                    //si es diferente de 680 sigue avanzando a la drecha
                    if(x[turno-1]!=680 && b[turno-1]==false){
                        x[turno-1]=x[turno-1]+5;
                        //contador de movimientos
                        auxtimerX++;
                        //bandera para avanzar
                        b[turno-1]=false;
                    }else{
                        if(x[turno-1]==680 && b[turno-1]==false){
                            x[turno-1]=x[turno-1]-5;
                            //contador de movimientos
                            auxtimerX++;
                            //bandera para regreso
                            b[turno-1]=true;
                        }else{
                            if(x[turno-1]!=680 && b[turno-1]==true){
                                x[turno-1]=x[turno-1]-5;
                                //contador de movimientos
                                auxtimerX++;
                                //bandera de regreso
                                b[turno-1]=true;
                            }
                        }
                    }
                }
            }
        }   
    }
    void bajar(int t){
        //moverse en y
        y[turno-1]=y[turno-1]+5;
        //contador de movimientos
        auxtimerY++;
        //condicion de fin de movimiento (se compara con 13 para equilibrar los pixeles horizontales a verticales
        if(auxtimerY==13){
            //reiniciar contador de movimientos
            auxtimerY=0;
            dado--;
            //contador de fila
            f[turno-1]=f[turno-1]+1;
        }
    }
    void Detener(){
        //condicion para cortar movimiento
        if(auxtimerX==(14*dado)){
            this.SW_SE();
            //reinicir contador
            auxtimerX=0;
            //regresar bandera de final de fila
            b[turno-1]=false;
            //terminar animacion
            timer.stop();
            //habilitar dado
            BDado.setEnabled(true);
            //condicion de victoria
            if(x[turno-1]==680){
                JOptionPane.showMessageDialog( this,Nombre[turno-1]+ " ha ganado!!!","Felicidades!!!", JOptionPane.INFORMATION_MESSAGE);
                t.dispose();
                FMPrincipal nuevo=new FMPrincipal();
                nuevo.setVisible(true);
            }
            //cambiar el color del nombre del siguiete jugador
            this.PreNombre(turno);
        }
    }
    void SW_SE(){
        this.Escalera();
        this.Serpiente();        
    }
    void Escalera(){
        if(x[turno-1]==120 && f[turno-1]==1){//escalera 1
            this.SonidoEscalera();
            while(x[turno-1]!=190){
                x[turno-1]=x[turno-1]+1;
                y[turno-1]=y[turno-1]+1;
                f[turno-1]=2;
                repaint();
            }
            y[turno-1]=y[turno-1]-5;
            repaint();
        }else{
            if(x[turno-1]==610 && f[turno-1]==2){//escalera 2
                this.SonidoEscalera();
                while(x[turno-1]!=540){
                    x[turno-1]=x[turno-1]-1;
                    y[turno-1]=y[turno-1]+2;
                    f[turno-1]=4;
                    repaint();
                }
                y[turno-1]=y[turno-1]-10;
                repaint();
            }else{
                if(x[turno-1]==330 && f[turno-1]==3){//escalera 3
                    this.SonidoEscalera();
                    while(x[turno-1]!=470){
                        x[turno-1]=x[turno-1]+1;
                        y[turno-1]=y[turno-1]+1;
                        f[turno-1]=5;
                        repaint();
                    }
                    y[turno-1]=y[turno-1]-10;
                    repaint();
                }else{
                    if(x[turno-1]==610 && f[turno-1]==4){//escalera 4
                        this.SonidoEscalera();
                        while(x[turno-1]!=470){
                            x[turno-1]=x[turno-1]-1;
                            y[turno-1]=y[turno-1]+1;
                            f[turno-1]=6;
                            repaint();
                        }
                        y[turno-1]=y[turno-1]-10;
                        repaint();
                    }else{
                        if(x[turno-1]==120 && f[turno-1]==4){//escalera 5
                            this.SonidoEscalera();
                            while(y[turno-1]!=345){
                                y[turno-1]=y[turno-1]+1;
                                f[turno-1]=6;
                                repaint();
                            }
                        }else{
                            if(x[turno-1]==260 && f[turno-1]==6){//escalera 6
                                this.SonidoEscalera();
                                while(x[turno-1]!=190){
                                    x[turno-1]=x[turno-1]-1;
                                    y[turno-1]=y[turno-1]+1;
                                    f[turno-1]=7;
                                    repaint();
                                }
                                y[turno-1]=y[turno-1]-5;
                                repaint();
                            }
                        }
                    }
                }
            }
        }
    }
    void Serpiente(){
        if(x[turno-1]==400 && f[turno-1]==2){//serpiente 1
            this.SonidoSerpiente();
            while(x[turno-1]!=470){
                x[turno-1]=x[turno-1]+1;
                y[turno-1]=y[turno-1]-1;
                f[turno-1]=1;
                repaint();
            }
            y[turno-1]=y[turno-1]+5;
            repaint();
        }else{
            if(x[turno-1]==400 && f[turno-1]==3){//serpiente 2
                this.SonidoSerpiente();
                while(x[turno-1]!=260){
                    x[turno-1]=x[turno-1]-1;
                    y[turno-1]=y[turno-1]-1;
                    f[turno-1]=1;
                    repaint();
                }
                y[turno-1]=y[turno-1]+10;
                repaint();
            }else{
                if(x[turno-1]==400 && f[turno-1]==4){//serpiente 3
                    this.SonidoSerpiente();
                    while(x[turno-1]!=470){
                        x[turno-1]=x[turno-1]+1;
                        y[turno-1]=y[turno-1]-2;
                        f[turno-1]=2;
                        repaint();
                    }
                    y[turno-1]=y[turno-1]+10;
                    repaint();
                }else{
                    if(x[turno-1]==540 && f[turno-1]==5){//serpiente 4
                        this.SonidoSerpiente();
                        while(x[turno-1]!=470){
                            x[turno-1]=x[turno-1]-1;
                            y[turno-1]=y[turno-1]-1;
                            f[turno-1]=4;
                            repaint();
                        }
                        y[turno-1]=y[turno-1]+5;
                        repaint();
                    }else{
                        if(x[turno-1]==120 && f[turno-1]==7){//serpiente 5
                            this.SonidoSerpiente();
                            while(x[turno-1]!=190){
                                x[turno-1]=x[turno-1]+1;
                                y[turno-1]=y[turno-1]-4;
                                f[turno-1]=3;
                                repaint();
                            }
                            y[turno-1]=y[turno-1]+20;
                            repaint();
                        }else{
                            if(x[turno-1]==400 && f[turno-1]==7){//serpiente 6
                                this.SonidoSerpiente();
                                while(x[turno-1]!=260){
                                    x[turno-1]=x[turno-1]-1;
                                    y[turno-1]=y[turno-1]-1;
                                    f[turno-1]=5;
                                    repaint();
                                }
                                y[turno-1]=y[turno-1]+10;
                                repaint();
                            }
                        }
                    }
                }
            }
        }
    }
    void SonidoEscalera(){
        CAudio SEscalera=new CAudio();
        int n=(int)(Math.random()*5);
        String[] Audio={"s1.wav","s2.wav","s3.wav","s4.wav","s5.wav"};
        SEscalera.setAudio("Escaleras\\"+Audio[n]);  
        //System.out.println("Escalera"+Audio[n]);
        try {
            Thread.sleep(2000);
        }
        catch(InterruptedException e) {
        }
    }
    void SonidoSerpiente(){
        CAudio SSerpiente=new CAudio();
        int n=(int)(Math.random()*5);
        String[] Audio={"s1.wav","s2.wav","s3.wav","s4.wav","s5.wav"};
        SSerpiente.setAudio("Serpientes\\"+Audio[n]);  
        //System.out.println("Serpiente"+Audio[n]);
        try {
            Thread.sleep(2000);
        }
        catch(InterruptedException e) {
        }
    }
}
