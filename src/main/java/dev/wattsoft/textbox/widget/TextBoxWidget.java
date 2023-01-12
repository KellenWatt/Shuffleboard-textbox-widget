package dev.wattsoft.textbox.widget;

import edu.wpi.first.shuffleboard.api.widget.Description;

import edu.wpi.first.shuffleboard.api.widget.ParametrizedController;
import edu.wpi.first.shuffleboard.api.widget.SimpleAnnotatedWidget;


import javafx.fxml.FXML;
import javafx.scene.layout.Pane;
import javafx.scene.control.TextArea;

@Description(name = "TextBox", dataTypes = String.class)
@ParametrizedController("TextBoxWidget.fxml")
public final class TextBoxWidget extends SimpleAnnotatedWidget<String> {

    @FXML
    private Pane root;

    @FXML
    private TextArea textbox;

    @FXML
    private void initialize() {
        // textbox.setText("Hello, world!");
        // textbox.textProperty().bind(dataOrDefault.map(str -> str));
        textbox.textProperty().addListener((__, old, newx) -> setData(newx));
    }

    @Override
    public Pane getView() {
        return root;
    }

}
