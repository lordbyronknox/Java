/*
App that displays the number of clicks, using a type of control called
a label.
 */
package Page578.TheClickCounterProgram;

import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;

public class ClickCounter extends Application {     //extends java.application.Application - thus
                                                    // specifying that this is a javafx application.
    public static void main(String[] args) 
    {
        launch(args);
    }
    
    Button btn;           //class variable of type Button declared
    Label lbl;            //class variable of type Label declared
    int iClickCount = 0;  //int variavle declared - to keep count of number of clicks.

    @Override
    public void start(Stage primaryStage) {             //start() with Stage obj as paramater.
// Create the button
        btn = new Button();
        btn.setText("Click me please!");
        btn.setOnAction(e -> buttonClick());            //.setOnAction() calls buttonClick() when btn is clicked.
// Create the Label
        lbl = new Label();                              //Label constructor called + assigned to lbl
        lbl.setText("You have not clicked the button.");//text set to lbl
// Add the label and the button to a layout pane
        BorderPane pane = new BorderPane();
        pane.setTop(lbl);                               //label set to top of pane
        pane.setCenter(btn);                            //button set to center of pane
// Add the layout pane to a scene
        Scene scene = new Scene(pane, 250, 150);        //Scene object created, pane passed as root node
// Add the scene to the stage, set the title            
// and show the stage
        primaryStage.setScene(scene);
        primaryStage.setTitle("Click Counter");
        primaryStage.show();
    }

    public void buttonClick() {
        iClickCount++;
        if (iClickCount == 1) {
            lbl.setText("You have clicked once.");
        } else {
            lbl.setText("You have clicked "
                    + iClickCount + " times.");
        }
    }
}
