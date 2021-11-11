package com.pshilos2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Controlador {
    @FXML private Label lbHilo1;
    @FXML private Label lbHilo2;
    @FXML private Label lbSubprograma2;

    @FXML private void clckAccionBtn1 (ActionEvent ae) {
        System.out.println("Working1");
    }

    @FXML private void clckAccionBtn2 (ActionEvent ae) {
        System.out.println("Working2");
    }
}
