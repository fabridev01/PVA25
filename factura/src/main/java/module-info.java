module com.teclemas.facturador {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.teclemas.facturador to javafx.fxml;
    exports com.teclemas.facturador;
}
