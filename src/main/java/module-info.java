module com.example.agenda {
    requires javafx.controls;
    requires javafx.fxml;
            
        requires org.controlsfx.controls;
            requires com.dlsc.formsfx;
    requires java.xml.bind;
    requires javaee.web.api;
    requires java.persistence;

    opens com.example.agenda to javafx.fxml;
    exports com.example.agenda;
}