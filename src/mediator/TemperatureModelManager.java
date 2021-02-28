package mediator;

import model.Temperature;
import model.TemperatureList;
import util.Subject;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class TemperatureModelManager implements TemperatureModel, Subject
{
  private TemperatureList temperatureList;
  private PropertyChangeSupport propertyChangeSupport;

  public TemperatureModelManager()
  {
    temperatureList = new TemperatureList();
    propertyChangeSupport = new PropertyChangeSupport(this);
  }

  @Override public void addTemperature(String id, double temperature)
  {
    Temperature t = new Temperature(id, temperature);
    Temperature old = getLastInsertedTemperature();
    this.temperatureList.addTemperature(t);
    propertyChangeSupport
        .firePropertyChange("Update", old, t.toString());
  }

  @Override public Temperature getLastInsertedTemperature()
  {
    return temperatureList.getLastTemperature(null);
  }

  @Override public Temperature getLastInsertedTemperature(String id)
  {
    return temperatureList.getLastTemperature(id);
  }

  @Override public void addListener(PropertyChangeListener listener)
  {
    propertyChangeSupport.addPropertyChangeListener(listener);
  }
}
