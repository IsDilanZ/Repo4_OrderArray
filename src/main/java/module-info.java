module com.example.repo4_orderarray {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.repo4_orderarray to javafx.fxml;
    exports com.example.repo4_orderarray;
}