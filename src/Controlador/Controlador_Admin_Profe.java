
package Controlador;

import java.io.FileNotFoundException;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import Vista.Vista;
import Vista.Vista_Admin_Est;
import Vista.Vista_Admin_Inicio;
import Vista.Vista_Admin_Profe;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Controlador_Admin_Profe {

    Vista_Admin_Profe vista;

    public Controlador_Admin_Profe() {
        vista = new Vista_Admin_Profe();
        vista.getAñadirProfe().setOnAction(new EventoAñadirProfe());
        vista.getEliminarProfe().setOnAction(new EventoEliminarProfe());
        vista.getActualizarProfe().setOnAction(new EventoActualizarProfe());
        vista.getCerrar().setOnAction(new EventoCerrar());
    }

    public Vista_Admin_Profe getVista() {
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

    private class EventoAñadirProfe implements EventHandler<ActionEvent> {

        @Override
        public void handle(ActionEvent t) {
             Controlador_Adm_Profe_An controlador = null;
            
            controlador = new Controlador_Adm_Profe_An();
                Vista vista = controlador.getVista();
                Singleton singleton
                        = Singleton.getSingleton();
                Stage stage = singleton.getStage();
                stage.setScene(vista.getScena());
                stage.setTitle("Nombre_Aplicacion");
                stage.show();
        }
    }
    
    private class EventoEliminarProfe implements EventHandler<ActionEvent> {

        @Override
        public void handle(ActionEvent t) {
            Controlador_Adm_Profe_E controlador = null;
            
            controlador = new Controlador_Adm_Profe_E();
                Vista vista = controlador.getVista();
                Singleton singleton
                        = Singleton.getSingleton();
                Stage stage = singleton.getStage();
                stage.setScene(vista.getScena());
                stage.setTitle("Nombre_Aplicacion");
                stage.show();

        }
    }

    private class EventoActualizarProfe implements EventHandler<ActionEvent> {

        @Override
        public void handle(ActionEvent t) {
            Controlador_Adm_Profe_Ac controlador = null;
            
            controlador = new Controlador_Adm_Profe_Ac();
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