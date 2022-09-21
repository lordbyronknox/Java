/*
EXITING A PROGRAM
Exiting a program by clicking the 'x' in the top right of the window is not recommended
as this prevents the program from saving changes, shutting down databases and resources etc.
The proper way is to present an 'EXIT/CLOSE' button and have an event handler take care of the 
house cleaning and shut down.
When a user clicks the window 'x' to close a program a 'CloseRequest' event is generated,
and sent to the stage. You can provide an event handler for this event by calling the 'setOnClose()'
method of Stage class. This way the event handler is called whenever the user tries to close
the window.

 */
package Page622.TheClickCounterExitProgram;

import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;
import java.util.*;

public class ClickCounterExit extends Application {

    public static void main(String[] args) 
    {
        launch(args);
    }
    
    Stage stage;
    int iClickCount = 0;

    @Override
    public void start(Stage primaryStage) {
        stage = primaryStage;
// Create the Click Me button
        Button btnClickMe = new Button();
        btnClickMe.setText("Click me please!");
        btnClickMe.setOnAction(e -> btnClickMe_Click());
// Create the Close button
        Button btnClose = new Button();
        btnClose.setText("Close");
        btnClose.setOnAction(e -> btnClose_Click());
// Add the buttons to a layout pane
        VBox pane = new VBox(10);
        pane.getChildren().addAll(btnClickMe, btnClose);
        pane.setAlignment(Pos.CENTER);
// Add the layout pane to a scene
        Scene scene = new Scene(pane, 250, 150);
// Finish and show the stage
        primaryStage.setScene(scene);
        primaryStage.setTitle("Click Counter");
        
//When the x (close window) is clicked a 'CloseRequest' event is generated. If the event handler 
//does not 'consume' that request JavaFX will close the stage automatically.  
        primaryStage.setOnCloseRequest(e ->     
        {                                        
            e.consume();        //closeRequest event consumed (i.e cancelled)
            btnClose_Click();   //method called to handle the close request.
        });
        primaryStage.show();
    }

    public void btnClickMe_Click() 
    {
        iClickCount++;
        if (iClickCount == 1) {
            Alert a = new Alert(Alert.AlertType.INFORMATION, "You have clicked once." );
            a.showAndWait();
        } else {
            Alert a = new Alert(Alert.AlertType.INFORMATION, "You have clicked "
                                + iClickCount + " times."
            );
            a.showAndWait();
        }
    }

//method that creates an Alert, giving the user an option to quit or not, and calls stage.close()
//if the YES button is clicked.    
    public void btnClose_Click() 
    {
        Alert a = new Alert(Alert.AlertType.CONFIRMATION, "Are you sure you want to quit?",
                            ButtonType.YES, ButtonType.NO);
        Optional<ButtonType> confirm = a.showAndWait();
        if (confirm.isPresent() && confirm.get() == ButtonType.YES) 
        {
            stage.close();
        }
    }
    
}
