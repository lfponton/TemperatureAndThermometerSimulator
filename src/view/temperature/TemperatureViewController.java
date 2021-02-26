package view.temperature;

import core.ViewHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class TemperatureViewController
{
  @FXML private Label outputLabel;
  @FXML private TextField filterField;
  @FXML private Label filterLabel;

  private String thermometerId;
  private ViewHandler viewHandler;
  private TemperatureViewModel temperatureViewModel;

  public void init(ViewHandler viewHandler,
      TemperatureViewModel temperatureViewModel) {
    this.viewHandler = viewHandler;
    this.temperatureViewModel = temperatureViewModel;
  }

  @FXML private void onUpdateButton() {

  }

  @FXML private void onFilter() {

  }
}
