package core;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import view.temperature.TemperatureViewController;

import java.io.IOException;

public class ViewHandler
{
  private Scene currentScene;
  private Stage currentStage;
  private ViewModelFactory viewModelFactory;

  public ViewHandler(ViewModelFactory viewModelFactory) {
    this.viewModelFactory = viewModelFactory;
  }

  public void start() throws Exception {
    openTemperatureView();
  }

  public void openTemperatureView() throws IOException
  {
    FXMLLoader loader = new FXMLLoader();
    loader.setLocation(getClass().getResource("../view/temperature/"
        + "TemperatureView.fxml"));
    Parent root = loader.load();
    TemperatureViewController view = loader.getController();
    view.init(this, viewModelFactory.getTemperatureViewModel());
    currentStage = new Stage();
    currentScene = new Scene(root);
    currentStage.setTitle("Temperature Simulator");
    currentStage.setScene(currentScene);
    currentStage.show();
  }
}
