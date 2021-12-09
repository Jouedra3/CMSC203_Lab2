


/**
 * @author Josue Ouedraogo
 *
 */
//make the main panel's layout be a VBox [Done]
public class FXMainPane extends VBox {

Button hello, howdy, chinese, clear, exit;
Label feedback; // label
TextField textField;
  
//declare two HBoxes [done]
HBox hbox1;
HBox hbox2;
VBox vbox;
//student Task #4:

DataManager dataManager;
  
public FXMainPane() {
  
hbox1= new HBox();
hbox2= new HBox();
  
hello= new Button("Hello");
howdy = new Button("Howdy");
chinese = new Button("Chinese");
clear = new Button("Clear");
exit = new Button("Exit");
  
feedback = new Label("Feedback");
textField = new TextField();
//student Task #4:
  
dataManager = new DataManager();
// set margins and set alignment of the components
HBox.setMargin(hello, new Insets(10));
HBox.setMargin(howdy, new Insets(10));
HBox.setMargin(chinese, new Insets(10));
HBox.setMargin(clear, new Insets(10));
HBox.setMargin(exit, new Insets(10));
hbox1.setAlignment(Pos.CENTER);
hbox2.setAlignment(Pos.CENTER);
  

  
hello.setOnAction(new ButtonHandler());
howdy.setOnAction(new ButtonHandler());
chinese.setOnAction(new ButtonHandler());
clear.setOnAction(new ButtonHandler());
exit.setOnAction(new ButtonHandler());
}
  
  
  
  

class ButtonHandler implements EventHandler<ActionEvent>{
  

  
public void handle(ActionEvent e) {
if (e.getTarget()==hello) {
textField.setText(dataManager.getHello());
}
else if (e.getTarget()==howdy) {
textField.setText(dataManager.getHowdy());
}
else if (e.getTarget()==chinese) {
textField.setText(dataManager.getChinese());
}
else if (e.getTarget()==clear) {
textField.setText("");
}
else if (e.getTarget()==exit) {
Platform.exit();
System.exit(0);
}
}
}
}