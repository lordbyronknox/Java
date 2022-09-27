/*
JavaFX
A Package for creating User Interfaces.
Works with CSS for styling.
Visual effects: reflections, blurs, shadows etc.
Animation: eg. gradual transitions.
3d Objects: draw spheres, cubes, cylinders...
Touch screens: Can handle touchscreen devices, smart phones, tablets etc.

NOTE: 
Scene: Represents the nodes that are displayed by the app.
       Nodes = layout panes and controls(eg buttons)
Stage: Represents the window in which the scene is displayed.


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
    
    Button btn;                 //btn is declared as a class variable so it can be accessed by
                                //the buttonClicked method (not just the start() method.
    
//Every javaFX app must have a start method. It creates the user interface elements the user
//will interact with. It takes one arg: the Stage class object that represents the app's primary stage.
    @Override
    public void start(Stage primaryStage) {     
// Create the button                            
        btn = new Button();                     //Button object created                
        btn.setText("Click me please!");        //setText() sets the default text to the button.
//.setOnAction() lets you specify the method to be called when the button is clicked.
//In this case buttonClick() method is called.
        btn.setOnAction(e -> buttonClick());    //e represents an object of ActionEvent class  
// Add the button to a layout pane
//Layout pane = container class that you can add user interface elements (like buttons) to, and
// determines how to arrange them. (next to each other... one on top of the other etc.)
//BorderPane is one of 8 types of layout panes in the javafx.scene,layout package.
        BorderPane pane = new BorderPane();
        pane.setCenter(btn);                    //.setCenter() positions the button in the ceter of the pane.
// Add the layout pane to a scene
//Layout pane/s are added to a Scene class object (like a canvas) that will display the pane/s.
//It takes 3 args: A root node object (usually a layout pane),
//                 The width of the scene (in pixles),
//                 The height of the scene (in pixles).
        Scene scene = new Scene(pane, 300, 250);
// Finalize and show the stage
//call the primary stage's setScene() to set the scene to be displayed
        primaryStage.setScene(scene);               
        primaryStage.setTitle("The Click Me App");  //app title
//call the primary stage's show() method to display the scene.
//After calling show() the app window (the Stage) becomes visible to the user.
        primaryStage.show();
    }

//.getText() returns the text displayed by the botton as a string
//.setText() sets the text to be displayed by the button.
    public void buttonClick() {
        if (btn.getText() == "Click me please!") {  
            btn.setText("You clicked me!");
        } else {
            btn.setText("Click me please!");
        }
    }
}
