package es.um.tds.app;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * Aplicación principal de Gestión de Gastos
 * Patrón Singleton
 */
public class AppGestionGastos extends Application {

    private static AppGestionGastos instancia;

    public static AppGestionGastos getInstancia() {
        return instancia;
    }

    @Override
    public void init() {
        instancia = this;
        System.out.println("Inicializando aplicación...");
        //Iniciador
    }

    @Override
    public void start(Stage primaryStage) {
        Label label = new Label("Gestión de Gastos - Aplicación en desarrollo");
        label.setStyle("-fx-font-size: 18px;");

        StackPane root = new StackPane(label);
        Scene scene = new Scene(root, 600, 400); //dimensiones ventana

        primaryStage.setTitle("Gestión de Gastos");  //titulo	
        primaryStage.setScene(scene);				
        primaryStage.show();

        System.out.println("Aplicación iniciada correctamente");
    }

    @Override
    public void stop() {
        System.out.println("Cerrando aplicación...");
        //close
    }

    public static void main(String[] args) {
        launch(args);
    }
}
