import java.util.ArrayList;
public class Cuento
{
    ArrayList<Hada>        hadas = new ArrayList <Hada>();
    ArrayList<Arbol>     arboles = new ArrayList <Arbol>();
    ArrayList<Abeja>    colmena1 = new ArrayList <Abeja>();
    ArrayList<Abeja>    colmena2 = new ArrayList <Abeja>();
    ArrayList<Lenador> lenadores = new ArrayList <Lenador>();
    public Cuento(){
       hadas.add(new Hada("test",1));
       hadas.add(new Hada("test2",2));
       arboles.add(new Arbol("test"));
       arboles.add(new Arbol("test2"));
       colmena1.add(new Abeja("test",1));
       colmena1.add(new Abeja("test2",2));
       colmena2.add(new Abeja("test",1));
       colmena2.add(new Abeja("test2",2));
       lenadores.add(new Lenador("test",1));
       lenadores.add(new Lenador("test2",2));
    }
    
    public void participarHada(){
        System.out.println(hadas.get(0).Participar());
        System.out.println(hadas.get(1).Participar());              
    }
    
    public void participarArbol(){
        System.out.println(arboles.get(0).Participar());
        System.out.println(arboles.get(1).Participar());
    }
    
    public void participarAbeja(){
        double cantidadMiel = 2.78*colmena1.size();
        System.out.println("Vuelo,vuelo;junto a "+colmena1.size()+" abejas y dulce manjar de "+cantidadMiel+" gr"+" produzco");
    }
    
    public void participarLenador(){
    
    }
}
