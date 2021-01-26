package sample;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.util.Duration;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Controller {

    @FXML
    private Label Label1;

    @FXML
    private TextField txta;

public String strs="fgh";


    private Sample sample; // объект нашего класса

    public Controller(){
        this.sample = new Sample(this);
    }

    public TextField getLabel(){
        return txta;
    }

    @FXML
    void initialize() {
        //sample.print();
        Timeline tml = new Timeline();
        tml.setCycleCount(Timeline.INDEFINITE);
        KeyFrame ballMove = new KeyFrame(Duration.millis(1000),
                new EventHandler<ActionEvent>() {

                    public void handle(ActionEvent event) {


                        txta.appendText( sample.str);
                    }
                });
        tml.getKeyFrames().add(ballMove);
        tml.play();


    }







}
