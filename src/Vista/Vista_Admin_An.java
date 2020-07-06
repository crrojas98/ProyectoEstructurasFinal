package Vista;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;

public class Vista_Admin_An implements Vista {

    private Scene escena;
    private TextField tfContra;
    private TextField tfConfContra;
    private TextField tfNombres;
    private TextField tfID;
    private TextField tfApellidos;
    private TextField tfCorreo;
    private Button btRegresar;
    private Button btValidar;
    private Label registro;

    public Vista_Admin_An() {
        GridPane gp = new GridPane();
        gp.setGridLinesVisible(false);
        gp.setHgap(50);
        gp.setVgap(15);
        Label lbNombres = new Label("Nombre: ");
        Label lbContra = new Label("Contraseña: ");
        Label lbConfContra = new Label("Confirmar contraseña: ");
        Label lbApellidos = new Label("Apellidos: ");
        Label lbCorreo = new Label("Correo: ");
        Label lbID = new Label("Numero de Identificacion: ");
        tfNombres = new TextField();
        tfContra = new TextField();
        tfConfContra = new TextField();
        tfID = new TextField();
        tfCorreo = new TextField();
        tfApellidos = new TextField();
        btValidar = new Button("Validar");
        btRegresar = new Button("Regresar");
        registro = new Label("Crea una cuenta");
        registro.setFont(new Font("Arial", 17));
        gp.add(lbNombres, 0, 0);
        gp.add(tfNombres, 1, 0);
        gp.add(lbApellidos, 0, 1);
        gp.add(tfApellidos, 1, 1);
        gp.add(lbID, 0, 2);
        gp.add(tfID, 1, 2);
        gp.add(lbCorreo, 0, 3);
        gp.add(tfCorreo, 1, 3);
        gp.add(lbContra, 0, 4);
        gp.add(tfContra, 1, 4);
        gp.add(lbConfContra, 0, 5);
        gp.add(tfConfContra, 1, 5);
        gp.add(btValidar, 1, 6);
        gp.add(btRegresar, 0, 6);
        BorderPane bp = new BorderPane();
        bp.setTop(registro);
        bp.setAlignment(registro, Pos.TOP_CENTER);
        bp.setMargin(registro, new Insets(8));
        bp.setCenter(gp);
        bp.setAlignment(gp, Pos.CENTER);
        bp.setMargin(gp, new Insets(12));
        this.escena = new Scene(bp, 415, 345);
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