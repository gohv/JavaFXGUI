package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import javax.swing.*;

public class Controller {

    @FXML private TextField nameField;

    public void saySup(ActionEvent actionEvent) {

        JOptionPane.showMessageDialog(null, "SUP " + nameField.getText(), "Whats up?" , JOptionPane.INFORMATION_MESSAGE);

    }
}
