/*

 */
package Page704.TheSpinoffProgram;

import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;

public class SpinOffs extends Application {

    public static void main(String[] args) 
    {
        launch(args);
    }
    
    
    TreeView<String> tree;              //declaring class variables
    Label lblShowName;

    @Override
    public void start(Stage primaryStage) 
    {
        TreeItem<String> root, andy, archie, happy, george, maude;  //create variables for NON-leaf nodes.
                                                                    //(i.e. root node & shows with spin-offs)
        root = new TreeItem<String>("Spin Offs");                   //root node created with text 'spin off'
        root.setExpanded(true);                                     //set to 'expanded' (children displayed)
        andy = makeShow("The Andy Griffith Show", root);            //create nodes for Andy Grif & 'root' as its parent.
        makeShow("Gomer Pyle, U.S.M.C.", andy);                     //...spin-off with 'andy' as parent
        makeShow("Mayberry R.F.D", andy);                           //...spin-off with 'andy' as parent
        archie = makeShow("All in the Family", root);               //create node for "all in..", root as parent.
        george = makeShow("The Jeffersons", archie);                //create george ('Jeffersons.."), archie as parent
        makeShow("Checking In", george);                            //create "check in), george as parent.
        maude = makeShow("Maude", archie);
        makeShow("Good Times", maude);
        makeShow("Gloria", archie);
        makeShow("Archie Bunker's Place", archie);
        happy = makeShow("Happy Days", root);
        makeShow("Mork and Mindy", happy);
        makeShow("Laverne and Shirley", happy);
        makeShow("Joanie Loves Chachi", happy);
        tree = new TreeView<String>(root);              //create TreeView control, tree
        tree.setShowRoot(false);                        //hides root node
        tree.getSelectionModel().selectedItemProperty() //create event listener for selected item property
                .addListener((v, oldValue, newValue)        //lambda: .tree_selectionChanged() called when 
                        -> tree_SelectionChanged(newValue));// selection status of treeView control changes
        lblShowName = new Label();                      //create label and vbox pane
        VBox pane = new VBox(10);                       
        pane.setPadding(new Insets(20, 20, 20, 20));
        pane.getChildren().addAll(tree, lblShowName);   //tree & label added to pane
        Scene scene = new Scene(pane);                  //scene created
        primaryStage.setScene(scene);                   //scene added to stage.
        primaryStage.setTitle("My Favorite Spin Offs"); //set stage's title
        primaryStage.show();                            //stage shown (displayed)
    }

    
//method to create nodes and add to specified parent node
    public TreeItem<String> makeShow(String title, TreeItem<String> parent) 
    {
        TreeItem<String> show = new TreeItem<String>(title); //node created with given title
        show.setExpanded(true);
        parent.getChildren().add(show);                      //node added to specified parent
        return show;
    }
//event listener called when selected node changes, and displays the title of selected node.
    public void tree_SelectionChanged(TreeItem<String> item) {
        if (item != null) {
            lblShowName.setText(item.getValue());
        }
    }
}
