
package fumadores;

public class PruebaFumadores {
    public static void main(String[] args) {
        Mesa m=new Mesa();
        Productor<Cerillo> p1=new Productor<Cerillo>(m, "Alex", new Cerillo());
        Productor<Tabaco> p2=new Productor<Tabaco>(m, "Ramiro", new Tabaco());
        Productor<Papel> p3=new Productor<Papel>(m, "Fabian", new Papel());
        
        Fumador c=new Fumador(m, "Juan");
        Fumador d=new Fumador(m, "Pepe");
        p1.start();
        p2.start();
        p3.start();
        c.start();
        d.start();
        
    }
}
