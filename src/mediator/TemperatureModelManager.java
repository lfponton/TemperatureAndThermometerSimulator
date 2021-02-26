package mediator;

import model.Temperature;

import java.beans.PropertyChangeListener;

public class TemperatureModelManager implements TemperatureModel
{
  @Override public void addTemperature(String id, double temperature)
  {

  }

  @Override public Temperature getLastInsertedTemperature()
  {
    return null;
  }

  @Override public Temperature getLastInsertedTemperature(String id)
  {
    return null;
  }

  @Override public void addListener(PropertyChangeListener listener)
  {

  }
}
