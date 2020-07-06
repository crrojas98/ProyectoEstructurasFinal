
package estructuras;


public class Nodo <T>{
    private Nodo siguiente;
    private T item;
    
    Nodo (T item){
        this.item = item;
        this.siguiente = null;
    }
    
    
    public Nodo getSiguiente(){
        return this.siguiente;
    }
    
    public T getItem(){
        return this.item;
    }
    
    public void setSiguiente(Nodo siguiente){
        this.siguiente = siguiente;
    }
    
    public void setItem(T item){
        this.item = item;
    }
    
    public Boolean hasSiguiente (){
        if (siguiente==null){
            return false;
        }else{
            return true;
        }
    }
}
