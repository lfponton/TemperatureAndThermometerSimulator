package view.temperature;

import core.ViewHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Region;
import mediator.TemperatureModel;
import model.Temperature;

public class TemperatureViewController
{
  @FXML private Label outputLabel;
  @FXML private TextField filterField;
  @FXML private Label filterLabel;

  private String thermometerId;
  private ViewHandler viewHandler;
  private TemperatureViewModel temperatureViewModel;
  private Region root;

  public void init(ViewHandler viewHandler,
      TemperatureViewModel temperatureViewModel)
  {
    this.viewHandler = viewHandler;
    this.temperatureViewModel = temperatureViewModel;
    
    outputLabel.textProperty().bind(temperatureViewModel.getTemperatureProperty());

  }

  @FXML private void onUpdateButton()
  {

  }

  @FXML private void onFilter()
  {

  }
}
