module org.calma.labo.labo_202330093 {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.calma.labo.labo_202330093 to javafx.fxml;
    exports org.calma.labo.labo_202330093;
    exports org.calma.labo.labo_202330093.sem6;
}