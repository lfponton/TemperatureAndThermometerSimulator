import core.ModelFactory;
import core.ViewHandler;
import core.ViewModelFactory;
import external.Thermometer;
import javafx.application.Application;
import javafx.stage.Stage;

public class TemperatureApp extends Application
{
  @Override public void start(Stage stage) throws Exception
  {
    ModelFactory modelFactory = new ModelFactory();
    ViewModelFactory viewModelFactory = new ViewModelFactory(modelFactory);
    ViewHandler viewHandler = new ViewHandler(viewModelFactory);

    viewHandler.start();

    Thread t1 = new Thread(new Thermometer("t1", 15, 1,
        modelFactory.getTemperatureModel()));

    t1.start();
  }
}
