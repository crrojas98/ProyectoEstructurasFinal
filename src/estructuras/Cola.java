
package estructuras;

import java.lang.reflect.Array;


public class Cola <T> {
    private Class<T> clazz;
    private T[] item;
    private int capacity;
    private int cola;
    private int cabeza;

    public Cola(Class<T> clazz){
        item = (T[]) Array.newInstance(clazz, 10);
        this.clazz = clazz;
        capacity = 10;
        cola = 0;
        cabeza = 0;
    }

    public Cola(Class<T> clazz, int capacity){
        this.capacity = capacity;
        item = (T[]) Array.newInstance(clazz, capacity);
        this.clazz = clazz;
        cola =0;
        cabeza = 0;
    }

    public int getCount(){
        return cola-cabeza;
    }


    public T front(){
        return item[cabeza];
    }


    public T pop(){
        if(cabeza<=cola){
            T aux = item[cabeza];
            item[cabeza] = null;
            cabeza++;
            return aux;
        }else{
            return null;
        }
    }

    public void push(T itemRef){
        cola++;
        if(cola > capacity){
            capacity = capacity * 2;
            T[] listaAux = item;
            item = (T[]) Array.newInstance(clazz, capacity);
            int n=0;
            for (int i = cabeza; i < listaAux.length; i++) {
                item[n] = listaAux[i];
                n++;
            }
            cola = n;
        }
        item[cola] = itemRef;
    }
    
    public boolean empty(){
        if(cabeza>cola){
            return true;
        }else{
            return false;
        }
    }
    
}
