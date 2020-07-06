
package Controlador;

import java.io.FileNotFoundException;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import Vista.Vista;
import Vista.Vista_Admin_Inicio;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Controlador_Admin_Inicio {

    Vista_Admin_Inicio vista;

    public Controlador_Admin_Inicio() {
        vista = new Vista_Admin_Inicio();
        vista.getListaEstudiantes().setOnAction(new EventoListaEstudiantes());
        vista.getListaProfesores().setOnAction(new EventoListaProfesores());
        vista.getListaCursos().setOnAction(new EventoListaCursos());
        vista.getCerrar().setOnAction(new EventoCerrar());
    }

    public Vista_Admin_Inicio getVista() {
        return vista;
    }

    private class EventoCerrar implements EventHandler<ActionEvent> {

        @Override
        public void handle(ActionEvent t) {

            Controlador_Inicio controlador = null;
            
            try {
                controlador = new Controlador_Inicio();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Controlador_Admin_Inicio.class.getName()).log(Level.SEVERE, null, ex);
            }
                Vista vista = controlador.getVista();
                Singleton singleton
                        = Singleton.getSingleton();
                Stage stage = singleton.getStage();
                stage.setScene(vista.getScena());
                stage.setTitle("Nombre_Aplicacion");
                stage.show();
            
        }
    }

    private class EventoListaEstudiantes implements EventHandler<ActionEvent> {

        Controlador_Admin_Est controlador = null;
        @Override
        public void handle(ActionEvent t) {
            controlador = new Controlador_Admin_Est();
                Vista vista = controlador.getVista();
                Singleton singleton
                        = Singleton.getSingleton();
                Stage stage = singleton.getStage();
                stage.setScene(vista.getScena());
                stage.setTitle("Nombre_Aplicacion");
                stage.show();
        }
    }
    
    private class EventoListaProfesores implements EventHandler<ActionEvent> {

        Controlador_Admin_Profe controlador = null;
        @Override
        public void handle(ActionEvent t) {
            controlador = new Controlador_Admin_Profe();
                Vista vista = controlador.getVista();
                Singleton singleton
                        = Singleton.getSingleton();
                Stage stage = singleton.getStage();
                stage.setScene(vista.getScena());
                stage.setTitle("Nombre_Aplicacion");
                stage.show();
        }
    }

    private class EventoListaCursos implements EventHandler<ActionEvent> {

        Controlador_Admin_Cursos controlador = null;
        @Override
        public void handle(ActionEvent t) {
            controlador = new Controlador_Admin_Cursos();
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