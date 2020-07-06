package estructuras;

public class NodoHash <T>{
    public char estado;
    public String id;
    public T cuenta;

    public NodoHash(String id, T cuenta) {
        this.id = id;
        this.cuenta = cuenta;
    }
}