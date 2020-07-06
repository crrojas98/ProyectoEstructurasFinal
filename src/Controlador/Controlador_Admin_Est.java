
package Controlador;

import java.io.FileNotFoundException;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import Vista.Vista;
import Vista.Vista_Admin_Est;
import Vista.Vista_Admin_Inicio;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Controlador_Admin_Est {

    Vista_Admin_Est vista;

    public Controlador_Admin_Est() {
        vista = new Vista_Admin_Est();
        vista.getAñadirEstudiantes().setOnAction(new EventoAñadirEstudiantes());
        vista.getEliminarEstudiantes().setOnAction(new EventoEliminarEstudiantes());
        vista.getActualizarEstudiantes().setOnAction(new EventoActualizarEstudiantes());
        vista.getCerrar().setOnAction(new EventoCerrar());
    }

    public Vista_Admin_Est getVista() {
        return vista;
    }

    private class EventoCerrar implements EventHandler<ActionEvent> {

        @Override
        public void handle(ActionEvent t) {

            Controlador_Admin_Inicio controlador = null;
            
            controlador = new Controlador_Admin_Inicio();
                Vista vista = controlador.getVista();
                Singleton singleton
                        = Singleton.getSingleton();
                Stage stage = singleton.getStage();
                stage.setScene(vista.getScena());
                stage.setTitle("Nombre_Aplicacion");
                stage.show();
            
        }
    }

    private class EventoAñadirEstudiantes implements EventHandler<ActionEvent> {

        @Override
        public void handle(ActionEvent t) {
            Controlador_Adm_Est_An controlador = null;
            
            controlador = new Controlador_Adm_Est_An();
                Vista vista = controlador.getVista();
                Singleton singleton
                        = Singleton.getSingleton();
                Stage stage = singleton.getStage();
                stage.setScene(vista.getScena());
                stage.setTitle("Nombre_Aplicacion");
                stage.show();
        }
    }
    
    private class EventoEliminarEstudiantes implements EventHandler<ActionEvent> {

        @Override
        public void handle(ActionEvent t) {
            Controlador_Adm_Est_E controlador = null;
            
            controlador = new Controlador_Adm_Est_E();
                Vista vista = controlador.getVista();
                Singleton singleton
                        = Singleton.getSingleton();
                Stage stage = singleton.getStage();
                stage.setScene(vista.getScena());
                stage.setTitle("Nombre_Aplicacion");
                stage.show();

        }
    }

    private class EventoActualizarEstudiantes implements EventHandler<ActionEvent> {

        @Override
        public void handle(ActionEvent t) {
            Controlador_Adm_Est_Ac controlador = null;
            
            controlador = new Controlador_Adm_Est_Ac();
                Vista vista = controlador.getVista();
                Singleton singleton
                        = Singleton.getSingleton();
                Stage stage = singleton.getStage();
                stage.setScene(vista.getScena());
                stage.setTitle("Nombre_Aplicacion");
                stage.show();
        }
    }

}