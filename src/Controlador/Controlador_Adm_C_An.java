package Controlador;

import Modelo.*;
import Vista.Vista;
import Vista.Vista_Admin_An;
import Vista.Vista_Admin_C_An;
import Vista.Vista_Admin_E;
import estructuras.Lista_Enlazada;
import estructuras.TableHash;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

public class Controlador_Adm_C_An {

    
    Vista_Admin_C_An vista;
    private boolean flag, error;
    TableHash tabladatCurso;
    public Controlador_Adm_C_An() {
        this.vista = new Vista_Admin_C_An();
        this.vista.getBtValidar().setOnAction(new EventoValidar());
        this.vista.getBtRegresar().setOnAction(new EventoRegresar());
        flag = true;
        error = false;
    }

    public Vista_Admin_C_An getVista() {
        return vista;
    }

    private class EventoValidar implements EventHandler<ActionEvent> {

        @Override
        public void handle(ActionEvent event) {
            registrar(tabladatCurso);
        }
        private void registrar(TableHash tabladatest) {
            String Asignatura=vista.getTfAsignatura().getText();
            String Profesor=vista.getTfProfesor().getText();
            String grupo=vista.getTfGrupo().getText();
                 
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