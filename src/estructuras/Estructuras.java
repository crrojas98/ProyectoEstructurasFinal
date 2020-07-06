
package estructuras;


import Controlador.Controlador_Inicio;
import Controlador.Singleton;
import java.io.FileNotFoundException;
import Vista.Vista;
import javafx.application.Application;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Estructuras extends Application {

    @Override
    public void start(Stage primaryStage) throws FileNotFoundException {
        Singleton singleton = Singleton.getSingleton();
        singleton.setStage(primaryStage);
        Controlador_Inicio controlador = new Controlador_Inicio();
        Vista vista = (Vista) controlador.getVista();
        primaryStage.setScene(vista.getScena());
        primaryStage.setTitle("Nombre_Aplicacion");
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }

}