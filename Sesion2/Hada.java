public class Hada
{
    private String            nombre;
    private int                 edad;
    private double             extra;
    private double polvomagicoBase = 10;
    public Hada(String nombre, int edad)
    {
        this.nombre = nombre;
        this.edad   = edad;
    }
    
    public double Participar(){
        extra = ((polvomagicoBase * 1.5)/100)*edad;
        return polvomagicoBase+extra;
    }
}
