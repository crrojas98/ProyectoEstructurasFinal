package estructuras;

import Modelo.Cuenta;


public class Lista_Enlazada <T> {
    private Nodo head;
    private Nodo tail;
    private int tamano;
    
    public Lista_Enlazada(){
        head = null;
        tail = null;
        tamano = 0;
    }
    
    public void setUltimo(T item){
        if (head==null){
            head = new Nodo(item);
            tail = head;
        }
        else{
            if (tail==head){
                Nodo aux = new Nodo(item);
                head.setSiguiente(aux);
                tail = aux;
            }
            else{
                Nodo aux = new Nodo(item);
                tail.setSiguiente(aux);
                tail = aux;
            }
        }
        tamano++;
    }
    
    public void setUnir(Lista_Enlazada item){
        tail.setSiguiente(item.head);
        tail = item.getTail();
    }
    
    public int size(){
        return tamano;
    }
    
    public Nodo getHead(){
        return head;
    }
    
    public Nodo getTail(){
        return tail;
    }
    
    public void eliminarNodo(int id){
        Nodo aux = head;
        Cuenta cuentaTemp = (Cuenta) aux.getItem();
            if(id==cuentaTemp.getId()){
                head = aux.getSiguiente();
            }
        for (int i = 1; i < tamano; i++) {
            Nodo temp = aux.getSiguiente();
            Cuenta cuenta = (Cuenta) temp.getItem();
            if(id==cuenta.getId()){
                aux.setSiguiente(temp.getSiguiente());
            }
            aux = aux.getSiguiente();
        }
    }
    
    public Nodo search(int id){
        Nodo aux = head;
        for (int i = 0; i < tamano; i++) {
            Cuenta cuenta = (Cuenta) aux.getItem();
            if(id==cuenta.getId()){
                return aux;
            }
            aux = aux.getSiguiente();
        }
        return null;
    }
}
