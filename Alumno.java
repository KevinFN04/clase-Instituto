
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

    public boolean estaAprobado(){
        boolean aprobado = false;
        if (notaMedia() >= NOTA_MINIMA){
            aprobado = true;
        }
        return aprobado;
    }

    public void datosAlumno(){
        String notas = "Notas: ";
        int index = 0;
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Nº de clase: " + numeroClase);
        while (index < listaNotas.size()){
            if (index < listaNotas.size() - 1){
                notas = notas + listaNotas.get(index) + ", ";
            }
            else{
                notas = notas + listaNotas.get(index) + ".";
            }
            index++;
        }
        System.out.println("Nota Media: " + notas);
        if (!estaAprobado()){
            System.out.println("Suspenso");
        }
        else{
            System.out.println("Aprobado");
        }

    }
}
