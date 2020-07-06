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

public class Vista_Admin_Ac implements Vista {

    private Scene escena;
    private TextField tfContra;
    private TextField tfConfContra;
    private TextField tfNombres;
    private TextField tfUser;
    private TextField tfID;
    private TextField tfApellidos;
    private TextField tfCorreo;
    private Button btRegresar;
    private Button btValidar;
    private Label registro;

    public Vista_Admin_Ac() {
        GridPane gp = new GridPane();
        gp.setGridLinesVisible(false);
        gp.setHgap(50);
        gp.setVgap(15);
        Label lbID = new Label("Numero de Identificacion: ");
        tfNombres = new TextField();
        tfContra = new TextField();
        tfConfContra = new TextField();
        tfUser = new TextField();
        tfID = new TextField();
        tfCorreo = new TextField();
        tfApellidos = new TextField();
        btValidar = new Button("Validar");
        btRegresar = new Button("Regresar");
        registro = new Label("Actualizar");
        registro.setFont(new Font("Arial", 17));
        gp.add(lbID, 0, 2);
        gp.add(tfID, 1, 2);
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

    public TextField getTfUser() {
        return tfUser;
    }

    public TextField getTfContra() {
        return tfContra;
    }

    public TextField getTfConfContra() {
        return tfConfContra;
    }

    public TextField getTfNombres() {
        return tfNombres;
    }

    public TextField getTfID() {
        return tfID;
    }

    public TextField getTfApellidos() {
        return tfApellidos;
    }

    public TextField getTfCorreo() {
        return tfCorreo;
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