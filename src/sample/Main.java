package sample;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import javax.swing.*;

public class Main extends Application {
    TextField nameField = new TextField("Whats your name? ");

    @Override
    public void start(Stage primaryStage) throws Exception {
        //   Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Group root = new Group();
        Text text = new Text("Sup?");

        Button btn = new Button("Click");
        btn.setOnAction(evt -> message());
        VBox box = new VBox();

        box.getChildren().addAll(text, nameField, btn);
        root.getChildren().add(box);
        primaryStage.setTitle("Sup");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }
        private void message(){

            JOptionPane.showMessageDialog(null, "SUP " + nameField.getText(), "Whats up?" , JOptionPane.INFORMATION_MESSAGE);

        }

    public static void main(String[] args) {

        launch(args);

    }
}
