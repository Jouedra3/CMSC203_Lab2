

import java.io.IOException;

public class FXDriver extends Application {
	/**
	 * The main method for the GUI example program JavaFX version
	 * @param args not used
	 * @throws IOException
	 */
public static void main(String[] args) {}



@Override
public void start(Stage stage) throws Exception {
//call the main scene which is a BorderPane
FXMainPane root = new FXMainPane();
stage.setScene(new Scene(root, 500, 350));
// Set stage title and show the stage.
stage.setTitle("Hello World GUI");
stage.show();

}
}