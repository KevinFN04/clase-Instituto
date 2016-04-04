
/**
 * Write a description of class Alumno here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alumno
{
    private String nombre;
    private int edad;
    private int numeroClase;
    private ArrayListInt listaNotas;
    public static final int NOTA_MINIMA = 5;

    /**
     * Constructor for objects of class Alumno
     */
    public Alumno(String nombre, int edad)
    {
        this.nombre = nombre;
        this.edad = edad;
        this.numeroClase = numeroClase;
        this.listaNotas = new ArrayListInt();
    }

    public void añadirNota(int nota){
        listaNotas.add(nota);
    }

    public float notaMedia(){
        int sumaDeNotas = 0;
        int index = 0;
        float notaMedia = 0;
        while (index < listaNotas.size()){
            sumaDeNotas = sumaDeNotas + listaNotas.get(index);
            index++;
        }
        if (index != 0){
            notaMedia = sumaDeNotas / index;
        }
        return notaMedia;
    }
}
