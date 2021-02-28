package view.temperature;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import mediator.TemperatureModel;

public class TemperatureViewModel
{
  private StringProperty temperature;
  private StringProperty id;
  private TemperatureModel temperatureModel;

  public TemperatureViewModel(TemperatureModel temperatureModel) {
    this.temperatureModel = temperatureModel;
    this.temperature = new SimpleStringProperty();
  }

  public void getLastTemp() {
    if (temperatureModel.getLastInsertedTemperature() != null)
    {
      String output = temperatureModel.getLastInsertedTemperature().toString();
      temperature.setValue(output);
    }
    else
    {
      temperature.setValue("No data");
    }
  }

  public StringProperty getTemperatureProperty() { return temperature; }

}
