package dev.wattsoft.textbox;

import edu.wpi.first.shuffleboard.api.data.DataType;
import edu.wpi.first.shuffleboard.api.plugin.Description;
import edu.wpi.first.shuffleboard.api.plugin.Plugin;
import edu.wpi.first.shuffleboard.api.widget.ComponentType;
import edu.wpi.first.shuffleboard.api.widget.WidgetType;

import dev.wattsoft.textbox.widget.TextBoxWidget;

import java.util.List;

@Description(group = "dev.wattsoft", name = "TextBoxWidget", version = "0.0.1", summary = "It's a multiline textbox, because that doesn't exist, for some reason")
public final class TextBoxWidgetPlugin extends Plugin {

    @Override
    public List<ComponentType> getComponents() {
        return List.of(WidgetType.forAnnotatedWidget(TextBoxWidget.class));
    }        
}
