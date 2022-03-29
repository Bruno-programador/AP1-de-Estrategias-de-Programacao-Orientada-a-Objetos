module com.mycompany.ap1_2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.mycompany.ap1_2 to javafx.fxml;
    exports ap1;
}
