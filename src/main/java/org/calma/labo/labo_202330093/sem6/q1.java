package org.calma.labo.labo_202330093.sem6;
import javafx.animation.ScaleTransition;
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class q1 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Rectangle rec = new Rectangle(60,50,Color.GOLD);

        HBox hbox = new HBox(rec);
        hbox.setStyle("-fx-padding: 50 0 0 0;");
        hbox.setSpacing(10);

        Scene scene = new Scene(hbox,400,200);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Q1");
        primaryStage.show();

        TranslateTransition anim = new TranslateTransition(Duration.seconds(1),rec);
        anim.setFromX(0);
        anim.setToX(scene.getWidth()-rec.getWidth());

        anim.setCycleCount(ScaleTransition.INDEFINITE);
        anim.setAutoReverse(true);
        anim.play();

    }
}
