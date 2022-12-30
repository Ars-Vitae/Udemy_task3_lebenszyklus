module de.udemy.task3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens de.udemy.task3 to javafx.fxml;
    exports de.udemy.task3;
}