module com.example.agenda {
    requires javafx.controls;
    requires javafx.fxml;
            
        requires org.controlsfx.controls;
            requires com.dlsc.formsfx;
                        
    opens com.example.agenda to javafx.fxml;
    exports com.example.agenda;
}