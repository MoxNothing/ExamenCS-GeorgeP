package com.example.agenda;

import javafx.fxml.FXML;
import com.example.agenda.MainApp;
import com.example.agenda.BirthdayC;

public class RootLayout {
    private MainApp mainApp;

    public RootLayout() {

        this.mainApp = new MainApp();
    }
    public void setMainApp(MainApp mainApp) {
        this.mainApp = mainApp;
    }
    @FXML
    private void handleShowBirthdayStatistics() {
        mainApp.showBirthdayC();
    }

    @FXML
    private void handleExit() {
        System.exit(0);
    }
}