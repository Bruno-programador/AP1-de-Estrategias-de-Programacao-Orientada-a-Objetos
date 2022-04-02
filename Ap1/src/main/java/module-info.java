module ap1 {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.base;
    requires javafx.graphics;

    opens ap1 to javafx.fxml;
    exports ap1;
    exports ap1.Classes;
    exports ap1.Controller;

}
