package sample;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    private Sample sample; // объект нашего класса

    public Main(){
        this.sample = new Sample(this);

    }
String str="abrakadabra";
    public String getSTRING(){
        return str;
    }
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
       // new Main();
       sample.setStr("proba");

    }

    public static void main(String[] args) {
       //
        launch(args);
    }
}
