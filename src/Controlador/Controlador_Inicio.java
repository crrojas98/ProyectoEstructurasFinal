
package Controlador;


import Modelo.Cuenta;
import Vista.Vista;
import Controlador.*;
import Vista.Vista_Inicio;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javax.swing.JOptionPane;
import estructuras.Lista_Enlazada;
import estructuras.Nodo;
import estructuras.arbol;
import estructuras.Nodo_arbol;
import Modelo.*;
import estructuras.NodoHash;
import estructuras.TableHash;
import static java.lang.Integer.parseInt;

public class Controlador_Inicio {

    Vista_Inicio vista;
    TableHash <Cuenta> cuentas = new TableHash();

    public Controlador_Inicio() throws FileNotFoundException {
        this.vista = new Vista_Inicio();
        this.vista.getBtSalir().setOnAction(new EventoSalir());
        this.vista.getBtIngresar().setOnAction(new EventoIngresar());
    }

    public Vista_Inicio getVista() {
        return vista;
    }

    

    private class EventoSalir implements EventHandler<ActionEvent> {

        @Override
        public void handle(ActionEvent event) {
            Controlador.Singleton singleton = Controlador.Singleton.getSingleton();
            Stage stage = singleton.getStage();
            Controlador_Inicio controlador;
            try {
                controlador = new Controlador_Inicio();
                Vista vista = (Vista) controlador.getVista();
                stage.setScene(vista.getScena());
                stage.setTitle("Registro");
                stage.close();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Controlador_Inicio.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }

    private class EventoIngresar implements EventHandler<ActionEvent> {
        
        
        @Override
        public void handle(ActionEvent event) {
            
            try{
                
                Listas lista = new Listas(1);
                cuentas = lista.getCuentas1();
                String id = vista.getTfUser().getText();
                NodoHash cuenta = cuentas.ExtraerNodo(id);
                if (cuenta!=null) {
                    Cuenta aux = (Cuenta) cuenta.cuenta;
                    if(aux.getContraseña().equals(vista.getTfContra().getText())){
                        String rol = aux.getRol();
                        Controlador.Singleton singleton = Controlador.Singleton.getSingleton();
                        Stage stage = singleton.getStage();
                    if (rol.equals("Administrador")){
                        
                            Controlador_Admin_Inicio controlador = new Controlador_Admin_Inicio();
                            Vista vista1 = controlador.getVista();
                            stage.setTitle("Administrador");
                            stage.setScene(vista1.getScena());
                            stage.show();
                    }else{
                        if (rol.equals("Profesor")){
                            
                            Controlador_Profe_Inicio controlador = new Controlador_Profe_Inicio();
                            Vista vista1 = controlador.getVista();
                            stage.setTitle("Profesor");
                            stage.setScene(vista1.getScena());
                            stage.show();
                        }else{
                            
                            Controlador_Est_Inicio controlador = new Controlador_Est_Inicio();
                            Vista vista1 = controlador.getVista();
                            stage.setTitle("Estudiante");
                            stage.setScene(vista1.getScena());
                            stage.show();
                        }
                    }
                    }else{
                    JOptionPane.showMessageDialog(null, "Datos incorrectos, verifique por favor");
                }
                }else{
                    JOptionPane.showMessageDialog(null, "Datos incorrectos, verifique por favor");
                }

                }catch(NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Datos incorrectos, por favor ingrese un numero");
                }catch(Exception e) {
                    System.out.println(e);
                }
            
        }

    }
}