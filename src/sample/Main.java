package sample;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Text text = new Text(100,100,"hi");
        Rectangle rect = new Rectangle(200,200);
        rect.setOpacity(0);
        final Label monitored = new Label("Mouse Location Monitor");
        Button button = new Button();

        rect.setOnMouseMoved(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent actionEvent) {
                text.setText(String.valueOf(actionEvent.getY()));
            }
        });
        System.out.println("Hi");

        //Text text = new Text(200, 200, "Hi");
        Pane pane = new Pane();
        pane.getChildren().add(text);
        pane.getChildren().add(rect);

        Scene scene = new Scene(pane, 200, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
