
/**
 * Write a description of class ArrayListInt here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ArrayListInt
{
    //guarda un array de numeros enteros.
    private int[] arrayList;

    /**
     * Constructor de la clase ArrayListInt
     */
    public ArrayListInt(){
        arrayList = new int[0];
    }

    /**
     * Añade un objeto al arrayList
     */
    public void add(int elemento){
        int[] array2 = arrayList;
        arrayList = new int[array2.length + 1];
        for (int count = 0; count < array2.length; count++)
        {
            arrayList[count] = array2[count];
        }
        arrayList[array2.length] = elemento;
    }

    /**
     * Añade un objeto al arrayList en la posicion de index.
     */
    public void add(int index, int elemento){
        if (index <= arrayList.length && index >= 0){
            int[] array2 = arrayList;
            arrayList = new int[array2.length + 1];
            for (int count = 0; count < array2.length; count++)
            {
                if (index < count){
                    arrayList[count] = array2[count];                    
                }
                else{
                    arrayList[count+1] = array2[count];
                }
            }
            arrayList[index] = elemento;
        }
    }

    /**
     * Limpia la lista de objetos.
     */
    public void clear(){
        arrayList = new int[0];
    }

    /**
     * busca un objeto en la coleccion y devuelve true si esta.
     */
    public boolean contains(int elemento){
        boolean encontrado = false;
        int count = 0;
        while (!false && count < arrayList.length){
            if (arrayList[count] == elemento){
                encontrado = true;
            }
            count++;
        }
        return encontrado;
    }

    /**
     * Devuelve el elemento de la lista en la posicion dada.
     */
    public int get(int index){
        int elemento = 0;
        if (index < arrayList.length && index >= 0){
            elemento = arrayList[index];
        }
        else{
            elemento = -1;
        }
        return elemento;
    }

    /**
     * cambia un elemento de la lista
     */
    public void set(int index, int element){
        if (index < arrayList.length && index >= 0){
            arrayList[index] = element;
        }
    }

    /**
     * busca el indice de un elemento dado
     */
    public int indexOf(int elemento){
        int index = 0;
        int count = 0;
        boolean encontrado = false;
        while (!false && count < arrayList.length){
            if (arrayList[count] == elemento){
                index = count;
                encontrado = true;
            }
            count++;
        }          
        if (!encontrado){
            index = -1;
        }
        return index;
    }

    /**
     * devuelve true si la lista esta vacia.
     */
    public boolean isEmpty(){
        return arrayList.length == 0;
    }

    /**
     * elimina un elemento en una posicion dada.
     */
    public int remove(int index)
    {
        int eliminado = -1;
        if (index <= arrayList.length && index >= 0)
        {
            int[] local = arrayList;
            arrayList = new int[local.length - 1];
            for (int cont = 0; cont < arrayList.length;cont++)
            {
                if (cont < index)
                {
                    arrayList[cont] = local[cont];
                }
                else
                {
                    arrayList[cont] = local[cont+1];
                }
            }
            eliminado = local[index];
        }
        return eliminado;
    }

    /**
     * devuelve el tamaño de la lista.
     */
    public int size(){
        return arrayList.length;
    }
}
