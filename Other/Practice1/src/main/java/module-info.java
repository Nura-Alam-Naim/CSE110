module com.example.practice1 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens com.example.practice1 to javafx.fxml;
    exports com.example.practice1;
}