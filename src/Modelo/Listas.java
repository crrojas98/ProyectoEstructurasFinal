
package Modelo;

import estructuras.Cola;
import estructuras.Lista_Enlazada;
import estructuras.Nodo;
import estructuras.Nodo_arbol;
import estructuras.TableHash;
import estructuras.arbol;
import java.io.File;
import java.util.Scanner;

public class Listas {
    
    private arbol cuenta2;
    private Lista_Enlazada cursos;
    private Nodo_arbol raiz;
    private TableHash cuenta;
    
    public Listas(int tipo){
        if (tipo==1){
            TableHash <Cuenta> cuentas = new TableHash();
        try {
            File archivo = new File("Registro.txt");
            Scanner entrada = new Scanner(archivo);
                while (entrada.hasNext()) {
                    String linea = entrada.nextLine();
                    String[] palabras = linea.split(" ");
                    //Formato archivo:tipo nombre apellido correo id contraseña
                    String rol = palabras[0];
                    String nombre = palabras[1];
                    String apellido = palabras[2];
                    String correo = palabras[3];
                    String id = palabras[4];
                    String cont = palabras[5];
                    Cuenta cuenta = new Cuenta(rol,nombre,apellido,correo,Integer.parseInt(id),cont);
                    cuentas.insertar(id,cuenta);
                }
        cuenta=cuentas;
        } catch (Exception e) {
                System.out.println(e);
        }  
        }
    }
    
    public Listas(String rol){
        Nodo_arbol root = null;
        if (rol.equals("Administrador")){
            arbol <administrador> cuentas = new arbol();   
            try {
                File archivo = new File("Registro.txt");
                Scanner entrada = new Scanner(archivo);
                
                
                    while (entrada.hasNext()) {
                        String linea = entrada.nextLine();
                        String[] palabras = linea.split(" ");
                        //Formato archivo:tipo nombre apellido correo id usuario contraseña
                        administrador cuenta = new administrador(palabras[0], palabras[1],
                                palabras[2],palabras[3], Integer.parseInt(palabras[4]), palabras[5]);
                        
                        if(cuenta.getRol().equals(rol)){
                            root=cuentas.insert(root, cuenta);
                            cuenta2=cuentas;
                            raiz=root;
                        }
                    }
            cuenta2=cuentas;
            } catch (Exception e) {
                    System.out.println(e);
                }
                }else{
                    if (rol.equals("Profesor")){
                        arbol <profesor> cuentas = new arbol();
                        try {
                            File archivo = new File("Registro.txt");
                            Scanner entrada = new Scanner(archivo);
                                while (entrada.hasNext()) {
                                    String linea = entrada.nextLine();
                                    String[] palabras = linea.split(" ");
                                    //Formato archivo:tipo nombre apellido correo id contraseña
                                    profesor cuenta = new profesor(palabras[0], palabras[1],
                                            palabras[2],palabras[3], Integer.parseInt(palabras[4]), palabras[5]);
                                    if(cuenta.getRol().equals(rol)){
                                        root=cuentas.insert(root, cuenta);
                                        cuenta2=cuentas;
                                        raiz=root;
                                    }
                                }
                        cuenta2=cuentas;
                        } catch (Exception e) {
                                System.out.println(e);
                            }
                    }else{
                        arbol <estudiante> cuentas = new arbol();
                        try {
                        File archivo = new File("Registro.txt");
                        Scanner entrada = new Scanner(archivo);
                            while (entrada.hasNext()) {
                                String linea = entrada.nextLine();
                                String[] palabras = linea.split(" ");
                                //Formato archivo:tipo nombre apellido correo id usuario contraseña
                                estudiante cuenta = new estudiante(palabras[0], palabras[1],
                                        palabras[2],palabras[3], Integer.parseInt(palabras[4]), palabras[5]);
                                if(cuenta.getRol().equals(rol)){
                                    root=cuentas.insert(root, cuenta);
                                    cuenta2=cuentas;
                                    raiz=root;
                                }
                            }
                    cuenta2=cuentas;
                    } catch (Exception e) {
                            System.out.println(e);
                        }
                    }
                }
        
                
    }
    
    public Nodo_arbol getrootCuentas2(){
        return raiz;
    }
    
    public arbol getCuentas(){
        return cuenta2;
    }
    
    public TableHash getCuentas1(){
        return cuenta;
    }
}
