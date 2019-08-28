import java.util.ArrayList;
public class Biblioteca
{
    private ArrayList<Documento> documentos;
    private ArrayList<Lector>      lectores;
    private ArrayList<Servicio>   registros;
    char[] alpha;

    public Biblioteca(){
        generarLibros();
        generarLector();
    }

    public void generarLibros(){
        /*
        alpha = new char[26];
        for(int i = 0;i < 26; i++){
            alpha[i] = (char)(65 + i);
        }
        */
        documentos.add(new Libro("Calculo","Leonardo",10,"Chungara"));
    }

    public void generarLector(){
        lectores.add(new Lector("Dorian","123456"));
    }
    
    public void mostrarLibros(){
        for(int i = 0; i < alpha.length;i++){
            System.out.print(alpha[i]);
        }
    }
    
    public boolean buscarLibro(String nombre){
        boolean existe = false;
        
        return existe;
    }
    
    public int buscarCodice(){
        int codice = 0;
        
        return codice;
    }
    
    public void prestamo(String docId){
        //Prestamo prestamo = new prestamo()
    }
    
    public void devolucion(){
    
    }
}
