module com.example.prtinterfaz1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.prtinterfaz1 to javafx.fxml;
    exports com.example.prtinterfaz1;
}