package view.temperature;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.StringProperty;
import mediator.TemperatureModel;

public class TemperatureViewModel
{
  private DoubleProperty temperature;
  private StringProperty id;
  private TemperatureModel temperatureModel;

  public TemperatureViewModel(TemperatureModel temperatureModel) {
    this.temperatureModel = temperatureModel;
  }

  public void getLastTemp() {
    if (temperatureModel.getLastInsertedTemperature() != null)
    {
      temperature.setValue(temperatureModel.getLastInsertedTemperature()
          .getValue());
      id.setValue(temperatureModel.getLastInsertedTemperature().getId());
    }
  }

  public DoubleProperty getTemperatureProperty() { return temperature; }
  public StringProperty getIdProperty() { return id; }

}
