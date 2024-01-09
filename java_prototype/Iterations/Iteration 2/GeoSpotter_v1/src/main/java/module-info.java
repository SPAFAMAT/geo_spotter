module com.example.geospotter_v1 {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.geospotter_v1 to javafx.fxml;
    exports com.example.geospotter_v1;
}