module com.example.basamak_degerlerini_toplama {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.basamak_degerlerini_toplama to javafx.fxml;
    exports com.example.basamak_degerlerini_toplama;
}