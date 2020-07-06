
package estructuras;

public class Nodo_arbol <T>{
    private Nodo_arbol h_right;
    private Nodo_arbol h_left;
    private T item;
    private int altura;
    
    Nodo_arbol (T item){
        this.item = item;
        this.h_right = null;
        this.h_left = null;
    }
    
    private int calculo(Nodo_arbol nodo){//creo
        int r = 0;
        int l = 0;
        if (nodo.hasRight() && nodo.hasLeft()){
            r = 1 + calculo(nodo.h_right);
            l = 1 + calculo(nodo.h_left);
            
        }else{
            if (nodo.hasRight()){
            r = 1 + calculo(nodo.h_right);
            }else{
            if (nodo.hasLeft()){
            l = 1 + calculo(nodo.h_left);
            }else{
                return 0;
            }
            }
        }
        if(r>l){
            return r;
        }else{
            return l;
        }
    }
    //calculo(nodo.h_right)
    //calculo(nodo.h_left)
    
    public Nodo_arbol getH_right(){
        return this.h_right;
    }
    
    public Nodo_arbol getH_left(){
        return this.h_left;
    }
    
    public T getItem(){
        return this.item;
    }
    
    public int geth(){
        return this.altura;
    }
    public void seth(int height){
        this.altura=height;
    }
    
    public void setH_right(Nodo_arbol siguiente){
        this.h_right = siguiente;
    }
    
    public void setH_left(Nodo_arbol siguiente){
        this.h_left = siguiente;
    }
    
    public void setItem(T item){
        this.item = item;
    }
    
    public Boolean hasRight(){
        if(h_right==null){
            return false;
        }else{
            return true;
        }
    }
    
    public Boolean hasLeft(){
        if(h_left==null){
            return false;
        }else{
            return true;
        }
    }
}
