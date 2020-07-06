
package estructuras;

import Modelo.Cuenta;
import estructuras.Nodo_arbol;
import java.util.HashSet;

public class arbol<T> {
    Nodo_arbol root;
    
    public arbol(){
        root = null;
    }
    
    public static int height(Nodo_arbol root) {
     	if( root == null )
            return -1;
        else
            return 1 + Math.max(height(root.getH_left()),height(root.getH_right()));
            
    }
    public Nodo_arbol insert(Nodo_arbol root,T data){
        Nodo_arbol nodo = new Nodo_arbol(data);
        
        if (root==null){
            root=nodo;
        }else{
            root=avl(nodo,root);
        }
        return root;
    }
    public Nodo_arbol RR(Nodo_arbol root){
        Nodo_arbol temp = root.getH_right();
        root.setH_right(temp.getH_left());
        temp.setH_left(root);
        
        root.seth(height(root));
        temp.seth(height(temp));
        return temp;
    }
    public Nodo_arbol RL(Nodo_arbol root){
        Nodo_arbol temp = root.getH_left();
        root.setH_left(temp.getH_right());
        temp.setH_right(root);
        
        root.seth(height(root));
        temp.seth(height(temp));
        return temp;
    }    
    public Nodo_arbol DRRL(Nodo_arbol root){
        root.setH_left(RR(root.getH_left()));
        Nodo_arbol temp = RL(root);
        return temp;
    }
    public Nodo_arbol DRLR(Nodo_arbol root){
        root.setH_right(RL(root.getH_right()));
        Nodo_arbol temp = RR(root);
        return temp;
    }
    public Nodo_arbol avl(Nodo_arbol nodo, Nodo_arbol root){
        Nodo_arbol Temp = root;
        Cuenta c1 = (Cuenta) nodo.getItem();
        Cuenta c2 = (Cuenta) root.getItem();
        if (c1.getId() < c2.getId())  {
            if (root.getH_left() == null) {
                root.setH_left(nodo);  
            }else {
                root.setH_left(avl(nodo,root.getH_left()));   
                if ((height(root.getH_left())-height(root.getH_right())) == 2) {
                    Cuenta c3 = (Cuenta) root.getH_left().getItem();
                    if (c1.getId() < c3.getId()) {
                       Temp=RL(root);
                   } else {
                       Temp=DRRL(root);
                   }
                }
            }
        }else if (c1.getId() > c2.getId()) { 
            if (root.getH_right() == null) {
                root.setH_right(nodo);   
            } else {
                root.setH_right(avl(nodo, root.getH_right()));  // branch right
                if ((height(root.getH_right()) - height(root.getH_left())) == 2) {
                    Cuenta c4 = (Cuenta) root.getH_right().getItem();
                    if (c1.getId() > c4.getId()) {
                        Temp=RR(root);
                    }else {
                        Temp=DRLR(root);
                    } 
                } 
            } 
        }
        Temp.seth(Math.max(height(Temp.getH_left()),height(Temp.getH_right()))+1);
        return Temp; 
    }
    public Nodo_arbol Contains(int id, Nodo_arbol root){
        if(root==null){
            return null;
        }
        Cuenta temp = (Cuenta) root.getItem();
        if (id < temp.getId()){
            return Contains(id,root.getH_left());
        }
        else if (id > temp.getId()){
            return Contains(id,root.getH_right());
        }
        else {
            return root;
        }
    }
    public void ImprimirO(Nodo_arbol root){
        if (root == null){
                return;
            }
        
        Cuenta c1 = (Cuenta) root.getItem();
        ImprimirO(root.getH_left());
        System.out.println(c1.getId());  
        ImprimirO(root.getH_right());
    }
    
    
    
}
