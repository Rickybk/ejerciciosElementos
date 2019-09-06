import java.util.ArrayList;
public class Terreno
{
    private ArrayList<Muro>     muros;
    private ArrayList<Chulla> tanques;
    //private ArrayList<>
    public Terreno()
    {
        
    }

    public void generarTanques(){
        tanques.add(new Chulla(100));
        tanques.add(new Chulla(200));
    } 

    public void generarTerreno()
    {
        for(int i=0;i<10;i++){
            for(int k=0;k<15;k++){
                
            }
        }
    }
}
