
package Controlador;

import java.io.FileNotFoundException;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import Vista.Vista;
import Vista.Vista_Admin_Inicio;
import Vista.Vista_Est_Inicio;
import Vista.Vista_Profe_Inicio;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Controlador_Est_Inicio {
    Vista_Est_Inicio vista;

    public Controlador_Est_Inicio() {
        vista = new Vista_Est_Inicio();
        //vista.getListaCursos().setOnAction(new EventoListaCursos());
        vista.getCerrar().setOnAction(new EventoCerrar());
    }

    public Vista_Est_Inicio getVista() {
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

    private class EventoListaCursos implements EventHandler<ActionEvent> {

        @Override
        public void handle(ActionEvent t) {
            
        }
    }
}
