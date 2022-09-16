/*
JavaFX
A Package for creating User Interfaces.
Works with CSS for styling.
Visual effects: reflections, blurs, shadows etc.
Animation: eg. gradual transitions.
3d Objects: draw spheres, cubes, cylinders...
Touch screens: Can handle touchscreen devices, smart phones, tablets etc.



 */
package Page566.SimpleJavaFXprogram;

import javafx.application.*;    //the core class for all javaFx applications.
import javafx.stage.*;          //The top level container (canvas) that all user interface elements are displayed.
import javafx.scene.*;          //
import javafx.scene.layout.*;   //defines the layout manager, which determines the position of each
                                // control displayed in the user interface.
import javafx.scene.control.*;  //Buttons, text boxes, labels.

public class ClickMe extends Application {

    public static void main(String[] args) 
    {
        launch(args);           //launch() creates an object of Application class,
    }                           //and then calls start() to begin the JavaFX life cycle, 
                                //init->start->waiting->stop.
    
    Button btn;

    @Override
    public void start(Stage primaryStage) {     //Every javaFX app must have a start method.
// Create the button                            //It creates the user interface elements the user
        btn = new Button();                     //will interact with.
        btn.setText("Click me please!");
        btn.setOnAction(e -> buttonClick());    //buttonClick() called when button clicked.
// Add the button to a layout pane
        BorderPane pane = new BorderPane();
        pane.setCenter(btn);
// Add the layout pane to a scene
        Scene scene = new Scene(pane, 300, 250);
// Finalize and show the stage
        primaryStage.setScene(scene);
        primaryStage.setTitle("The Click Me App");  //app title
        primaryStage.show();
    }

    public void buttonClick() {
        if (btn.getText() == "Click me please!") {
            btn.setText("You clicked me!");
        } else {
            btn.setText("Click me please!");
        }
    }
}
