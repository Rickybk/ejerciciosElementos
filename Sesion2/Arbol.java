
public class Arbol
{
    private String  nombre;
    private int hojasBase = 0;

    public Arbol(String nombre)
    {
        this.nombre = nombre;
    }

    public String Participar(){
        hojasBase = hojasBase+10;
        String participar = "Larga vida tendre,ya que "+hojasBase+" hojas tengo y creceré";
        return participar;
    }

}
