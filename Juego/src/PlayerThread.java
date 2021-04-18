package juego;
import javazoom.jl.player.*;


public class PlayerThread extends Thread {
    private jlp mReproductor = null;
    public PlayerThread(String pFileName) {
        
        try{
            String [] args = new String[1];
            args[0] = pFileName;
            mReproductor = jlp.createInstance(args);
                }catch (Exception e){
                    e.printStackTrace();
                }
        
    }
    public void run(){
        try{
            while(true){
                
                mReproductor.play();
                Thread.sleep(1000); //Esperar un Segundo y Volver A Reproducir
                
            }
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
}