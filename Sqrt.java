import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Alert;
import javafx.scene.control.TextInputDialog;
import java.util.Optional;

/**
 * the Sqrt class prompts users to enter a double, takes the square root of it, and prints the result.
 * @author Sapper
 * @version 1.0
 * email: email
 * 27JAN2018
 */

public class Sqrt extends Application {
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
		TextInputDialog userEntry = new TextInputDialog();
		userEntry.setContentText("Please enter an double and I will square it: ");
		Optional<String> entry = userEntry.showAndWait();
		double entered = Double.parseDouble(entry.get());
		double ans = Math.sqrt(entered);

		Alert result = new Alert(Alert.AlertType.INFORMATION);
		result.setContentText("the square root of your number is: " + ans);
		result.showAndWait();




	}
}
