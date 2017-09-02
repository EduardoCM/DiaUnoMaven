package fumadores;

public class Fumador extends Thread{
    private Mesa mesa;
    public Fumador(Mesa mesa, String name) {
        super(name);
        this.mesa = mesa;
    }
    public boolean estaVivo(){
        return true;
    }

    @Override
    public void run() {
        while(true){
            Cigarro c=mesa.obtenerCigarro();
        }
    }
    
}
