import java.util.Random;
public class Libro extends Documento
{
    private String    titulo;
    private String editorial;
    private int      edicion;
    private String     autor;
    private int       codice;

    public Libro(String titulo, String editorial, int edicion, String autor){
        codice = 0;
        //this(titulo,editorial,edicion,autor,codice);
    }
    
    public Libro(String titulo, String editorial, int edicion, String autor,int codice){
        this.titulo    = titulo;
        this.editorial = editorial;
        this.edicion   = edicion;
        this.autor     = autor;
        this.codice    = codice;
    }

    
}
