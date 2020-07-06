package Controlador;

import Modelo.*;
import Vista.Vista;
import Vista.Vista_Admin_C_E;
import Vista.Vista_Admin_E;
import estructuras.Lista_Enlazada;
import estructuras.arbol;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Scanner;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

public class Controlador_Adm_C_E {

    arbol cuentas;
    Vista_Admin_C_E vista;
    private boolean flag, error;
    Hashtable<String, Vista_Admin_C_E> tabladatos;
    public Controlador_Adm_C_E() {
        this.vista = new Vista_Admin_C_E();
        this.vista.getBtValidar().setOnAction(new EventoValidar());
        this.vista.getBtRegresar().setOnAction(new EventoRegresar());
        flag = true;
        error = false;
    }

    public Vista_Admin_C_E getVista() {
        return vista;
    }

    private class EventoValidar implements EventHandler<ActionEvent> {

        @Override
        public void handle(ActionEvent event) {
            Listas lista = new Listas(1);
            cuentas = lista.getCuentas();
            eliminarCurso(tabladatos);
        }
        private void eliminarCurso(Hashtable<String, Vista_Admin_C_E> tabladatos) {
            String id = vista.getTfGrupo().getText();
            if(tabladatos.containsKey(id)){
                tabladatos.remove(id);
                JOptionPane.showMessageDialog(null, "Se ha elimincado correctamente");
            }else
            {
                JOptionPane.showMessageDialog(null,"El documentono existe!! ","Error",JOptionPane.ERROR_MESSAGE);
            }
            
        }
    }

    private class EventoRegresar implements EventHandler<ActionEvent> {

        @Override
        public void handle(ActionEvent event) {
            Controlador_Admin_Cursos controlador;
            controlador = new Controlador_Admin_Cursos();
            Vista vista = controlador.getVista();
            Singleton singleton = Singleton.getSingleton();
            Stage stage = singleton.getStage();
            stage.setScene(vista.getScena());
            stage.setTitle("ADMINISTRADOR");
            stage.show();

        }

    }
}