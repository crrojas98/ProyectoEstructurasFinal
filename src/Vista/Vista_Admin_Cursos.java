package Vista;

import java.io.FileInputStream;
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

public class Vista_Admin_Cursos implements Vista {

    private Scene escena;
    private Label inicio;
    private Button añadirCursos;
    private Button eliminarCursos;
    private Button actualizarCursos;
    private Label administrador;
    private Label mensaje;
    private Button cerrar;

    public Vista_Admin_Cursos() {
        inicio = new Label("Cursos");
        inicio.setFont(new Font("Arial", 40));
        inicio = new Label("  Cursos");
        inicio.setFont(new Font("Arial", 35));
        añadirCursos = new Button("Añadir Cursos");
        eliminarCursos = new Button("Eliminar Cursos");
        actualizarCursos = new Button("Actualizar Cursos");
        administrador = new Label("Administrador");
        mensaje = new Label("Bienvenido a Cursos, ¿Que desea hacer?");

        try {
            FileInputStream imagen = new FileInputStream("src/Images/imagenadmin.png");
            Image input2 = new Image(imagen);
            ImageView image45 = new ImageView(input2);
            image45.setFitHeight(30);
            image45.setFitWidth(30);
            administrador = new Label("Administrador",image45);
            administrador.setFont(new Font("Arial", 15));
        } catch (Exception e) {

        }
        cerrar = new Button("Volver");

        
        
        HBox linea2 = new HBox();
        linea2.setSpacing(70);
        linea2.getChildren().add(inicio);
        linea2.getChildren().add(administrador);
        VBox layout = new VBox();
        layout.setSpacing(15);
        layout.getChildren().add(linea2);
        layout.getChildren().add(mensaje);
        layout.getChildren().add(añadirCursos);
        layout.getChildren().add(eliminarCursos);
        layout.getChildren().add(actualizarCursos);
        layout.setSpacing(15);
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

    public Button getAñadirCursos() {
        return añadirCursos;
    }

    public Button getEliminarCursos() {
        return eliminarCursos;
    }

    public Button getActualizarCursos() {
        return actualizarCursos;
    }

    public Label getAdministrador() {
        return administrador;
    }


    public Button getCerrar() {
        return cerrar;
    }


}