package Vista;

import Vista.Vista;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;

public class Vista_Admin_C_Ac implements Vista {

    private Scene escena;
    private TextField tfAsignatura;
    private TextField tfGrupo;
    private Button btRegresar;
    private Button btValidar;
    private Label registro;

    public Vista_Admin_C_Ac() {
        GridPane gp = new GridPane();
        gp.setGridLinesVisible(false);
        gp.setHgap(50);
        gp.setVgap(15);
        Label lbAsignatura = new Label("Codigo de la asignatura: ");
        Label lbGrupo = new Label("Numero del grupo: ");
        tfAsignatura = new TextField();
        tfGrupo = new TextField();
        btValidar = new Button("Validar");
        btRegresar = new Button("Regresar");
        registro = new Label("Actualizar");
        registro.setFont(new Font("Arial", 17));
        gp.add(lbAsignatura, 0, 2);
        gp.add(tfAsignatura, 1, 2);
        gp.add(lbGrupo, 0, 3);
        gp.add(tfGrupo, 1, 3);
        gp.add(btValidar, 1, 7);
        gp.add(btRegresar, 0, 7);
        BorderPane bp = new BorderPane();
        bp.setTop(registro);
        bp.setAlignment(registro, Pos.TOP_CENTER);
        bp.setMargin(registro, new Insets(8));
        bp.setCenter(gp);
        bp.setAlignment(gp, Pos.CENTER);
        bp.setMargin(gp, new Insets(12));
        this.escena = new Scene(bp, 400, 345);
    }

    public TextField getTfID() {
        return tfAsignatura;
    }

    public TextField getTfGrupo() {
        return tfGrupo;
    }


    public Button getBtRegresar() {
        return btRegresar;
    }

    public Button getBtValidar() {
        return btValidar;
    }

    @Override
    public Scene getScena() {
        return escena;
    }

}