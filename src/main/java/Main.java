import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    public void start(Stage stage) {
        // Create UI elements
        Label label = new Label("Hello, JavaFX!");
        Button button = new Button("Click Me");

        // Add interaction
        button.setOnAction(e -> label.setText("Button clicked!"));

        // Layout
        VBox root = new VBox(10, label, button); // 10px spacing
        root.setStyle("-fx-padding: 20; -fx-alignment: center;");

        // Scene & Stage
        Scene scene = new Scene(root, 400, 300);
        stage.setTitle("My First JavaFX App");
        stage.setScene(scene);
        stage.show();
    }


}
