package view.temperature;

import javafx.application.Platform;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import mediator.TemperatureModel;
import util.Subject;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class TemperatureViewModel implements PropertyChangeListener
{
  private StringProperty temperature;
  private StringProperty id;
  private TemperatureModel temperatureModel;

  public TemperatureViewModel(TemperatureModel temperatureModel) {
    this.temperatureModel = temperatureModel;
    this.temperature = new SimpleStringProperty();
    ((Subject) temperatureModel).addListener((PropertyChangeEvent evt) -> this.propertyChange(evt));
  }

  public StringProperty getTemperatureProperty() { return temperature; }

  @Override public void propertyChange(PropertyChangeEvent evt)
  {
    Platform.runLater(() -> {
      String output = temperatureModel.getLastInsertedTemperature().toString();
      temperature.setValue(output);
    });
  }
}
