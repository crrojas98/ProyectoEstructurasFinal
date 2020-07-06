package Vista;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;

public class Vista_Inicio implements Vista {

    private Scene escena;
    private TextField tfUser;
    private TextField tfContra;
    private Button btIngresar;
    private Button btSalir;
    
    public Vista_Inicio() throws FileNotFoundException {
        GridPane gp = new GridPane();
        gp.setGridLinesVisible(false);
        gp.setHgap(25);
        gp.setVgap(10);
        Label lbUser = new Label("Usuario: ");
        Label lbCotnra = new Label("Contraseña: ");
        Label lbImagen = new Label(" ");
        tfUser = new TextField();
        tfContra = new PasswordField();
        btIngresar = new Button("Ingresar");
        btSalir = new Button("Salir");
        gp.add(lbUser, 0, 0);
        gp.add(tfUser, 2, 0);
        gp.add(lbCotnra, 0, 1);
        gp.add(tfContra, 2, 1);
        gp.add(btIngresar, 0, 3);       
        BorderPane bp = new BorderPane();
        bp.setTop(lbImagen);
        bp.setMargin(lbImagen, new Insets(8));
        bp.setAlignment(lbImagen, Pos.CENTER);
        bp.setCenter(gp);
        bp.setMargin(gp, new Insets(8));
        bp.setBottom(btSalir);
        bp.setAlignment(btSalir, Pos.TOP_RIGHT);
        bp.setMargin(btSalir, new Insets(8));
        
        this.escena = new Scene(bp, 310, 320);
    }

    @Override
    public Scene getScena() {
        return this.escena;
    }

    public TextField getTfUser() {
        return tfUser;
    }

    public TextField getTfContra() {
        return tfContra;
    }
            
    public Button getBtIngresar() {
        return btIngresar;
    }

    public Button getBtSalir() {
        return btSalir;
    }

}