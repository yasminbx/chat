module org.example.mediator_ {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.mediator_ to javafx.fxml;
    exports org.example.mediator_;
}