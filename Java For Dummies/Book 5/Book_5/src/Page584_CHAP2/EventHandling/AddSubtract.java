/*
EVENT HANDLING
EVENT: 
is an object that is generated when a user does something noteworthy with
one of the user interface elements (clicks a button, etc.)
This 'event object' is passed to a method you created, called an EVENT HANDLER.
EVENT SOURCE:
The object the event occurs on.
EVENT TARGET:
The node the event is directed at. (usually the event source and event target are the same)
EVENT HANDLER:
The object that listens for events and handles them. (Implements EventHandler interface,
which defines a single method named 'handle'.

Commonly used Event classes:
- ActionEvent:  Created when the user performs an action (like clicking, or tabbing to a button+ENTER).
- InputEvent:   Created when an event, that results from user input, occurs (eg. mouse or key click)
- KeyEvent:     Created when a keyboard key is pressed.
- MouseEvent:   ...mouse event, like click and drag, moving cursor over an object.
- TouchEvent:   ...touch event (touchscreens)
- WindowEvent:  ...when status of the window changes.

THREE STEPS TO HANDLING AN EVENT IN JAVAFX:
1. Create an event source. (usually a button etc.)
   Usually declared as private, outside the start method, (private Button btn;) 
   and then created in the start method:
   eg.
    btn = new Button();
    btn.setText("Click me")
2. Create an event handler. This is done by creating an object that implements an
   interface called 'EventHandler'. This object must provide an implementaion of
   the handle() method.
   4 WAYS TO CREATE AN EVENT HANDLER:
        1. Add 'implements EventHandler' to the Application class, and provide an implementation
           of the handle() method.
        2. Create an inner class that implements EventHandler, within Application class.
        3. Create an anonymous class that implements EventHandler.
        4. Use a lambda expression to implement the handle() method.
3. Register the event handler with the event source, so that the handle method is called
   whenever the event occurs. (Every component that is an event source provides a method
   that lets you register event handlers. eg. A Button has '.setOnAction(<eventHandler object>)'.
   



 */
package Page584_CHAP2.EventHandling;

import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.event.*;

//All javaFx apps must extend Application
//implements EventHandler interface, so it can define a handle() method to handle ActionEvent events
// that are generated by the buttons. Because EventHandler interface is generic you must specify
// the specific event type i.e. <ActionEvent>
public class AddSubtract extends Application implements EventHandler<ActionEvent> {

    public static void main(String[] args) 
    {
        launch(args);       //launch() creates an instance of AddAubtract class, & calls start()
    }

    Button btnAdd;
    Button btnSubtract;
    Label lbl;
    int iCounter = 0;

    @Override
    public void start(Stage primaryStage) {
// Create the Add button
        btnAdd = new Button();
        btnAdd.setText("Add");
        btnAdd.setOnAction(this);               //'this' sets the current object as the event handler (AddSubract object). 
// Create the Subtract button                   //'this' is used because 'AddSubtract' class implements EventHandler,
        btnSubtract = new Button();             //so the AddSubtract class handles any events created by its controls.
        btnSubtract.setText("Subtract");
        btnSubtract.setOnAction(this);
// Create the Label
        lbl = new Label();                      //create the label, and set its text to iCounter's value.
        lbl.setText(Integer.toString(iCounter));
// Create a pane and add the buttons and label to an HBox pane
//HBox pane arranges any controls horizontally. (10) indicates the controls should have a space
// of 10 pixels between them.
        HBox pane = new HBox(100);               
        pane.getChildren().addAll(lbl, btnAdd, btnSubtract);    //.getChildren() returns list of all child nodes.
                                                                //.addAll() adds controls to the pane.
// Add the layout pane to a scene
        Scene scene = new Scene(pane, 200, 75);                 //create scene, set HBox pane as root node.
// Add the scene to the stage, set the title and show the stage
        primaryStage.setScene(scene);                           //sets 'scene' as primary scene for stage
        primaryStage.setTitle("Add/Sub");
        primaryStage.show();
    }

    @Override                                   //Overriden/coded because AddSubtract implements EventHandler.
    public void handle(ActionEvent e) {         //method called when either button is clicked. 'e' is the
        if (e.getSource() == btnAdd) {          // event generated by the click.
            iCounter++;
        } else {
            if (e.getSource() == btnSubtract) { //getSource() determines the event source (btnAdd or btnSubratct)
                iCounter--;
            }
        }
        lbl.setText(Integer.toString(iCounter));  //sets the label to the string equivavant or iCounter.
    }
}
