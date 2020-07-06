
package Vista;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.geometry.Insets;

public class Vista_Profe_Inicio implements Vista{
    private Scene escena;
    private Label inicio;
    private Button ListaCursos;
    private Label Profesor;
    private Button cerrar;

    public Vista_Profe_Inicio() {
        inicio = new Label("Inicio");
        inicio.setFont(new Font("Arial", 40));
        inicio = new Label("  Inicio");
        inicio.setFont(new Font("Arial", 35));
        ListaCursos = new Button("mis Cursos");
        Profesor = new Label("Profesor");

        try {
            FileInputStream imagen = new FileInputStream("src/Images/imagenadmin.png");
            Image input2 = new Image(imagen);
            ImageView image45 = new ImageView(input2);
            image45.setFitHeight(30);
            image45.setFitWidth(30);
            Profesor = new Label("Profesor",image45);
            Profesor.setFont(new Font("Arial", 15));
        } catch (Exception e) {

        }
        cerrar = new Button("Cerrar Sesion");

        HBox linea1 = new HBox();
        linea1.setSpacing(8);
        linea1.getChildren().add(ListaCursos);
        HBox linea2 = new HBox();
        linea2.setSpacing(70);
        linea2.getChildren().add(inicio);
        linea2.getChildren().add(Profesor);
        VBox layout = new VBox();
        layout.setSpacing(150);
        layout.getChildren().add(linea2);
        layout.getChildren().add(linea1);
        layout.getChildren().add(cerrar);
        BorderPane panel = new BorderPane();
        panel.setTop(linea2);
        panel.setAlignment(inicio, Pos.TOP_CENTER);
        panel.setMargin(inicio, new Insets(5));
        panel.setCenter(layout);
        panel.setAlignment(layout, Pos.TOP_CENTER);
        panel.setMargin(layout, new Insets(8));
        panel.setBottom(cerrar);
        panel.setAlignment(cerrar, Pos.TOP_CENTER);
        panel.setMargin(cerrar, new Insets(5));
        panel.setMargin(panel, new Insets(40, 40, 40, 40));
        this.escena = new Scene(panel, 430, 300);

    }

    @Override
    public Scene getScena() {
        return escena;
    }

    public Label getInicio() {
        return inicio;
    }


    public Button getListaCursos() {
        return ListaCursos;
    }

    public Label getProfesor() {
        return Profesor;
    }


    public Button getCerrar() {
        return cerrar;
    }
}
