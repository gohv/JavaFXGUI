package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import javax.swing.*;

public class Main extends Application {
    TextField nameField = new TextField("Type here:");
    Button btn = new Button("Click");
    GridPane grid = new GridPane();
    Group root = new Group();
    Text text = new Text("Sup?");
    Label label = new Label("Name: ");

    @Override
    public void start(Stage primaryStage) throws Exception {
        //getClass() - get what class created this instamce
        //getResource() - works like a file system
        // start of the absolute path of /fxml we dont need a name because its the root
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/sample.fxml"));



 /*       grid.add(label, 0, 0);
        grid.add(nameField, 1, 0);
     //   grid.setGridLinesVisible(true);
        text.setFont(new Font("DejaVu Serif Bold", 30));
        grid.add(btn, 1, 1);
        grid.setHgap(10);
        btn.setOnAction(evt -> message());
        VBox box = new VBox();

        box.getChildren().addAll(text, grid);
        root.getChildren().add(box);*/
        primaryStage.setTitle("Sup");
        primaryStage.setScene(new Scene(root, 370, 275));
        primaryStage.show();
    }
        private void message(){

            JOptionPane.showMessageDialog(null, "SUP " + nameField.getText(), "Whats up?" , JOptionPane.INFORMATION_MESSAGE);

        }

    public static void main(String[] args) {

        launch(args);

    }
}
