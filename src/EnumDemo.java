import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Dialog;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.*;
import javafx.util.Pair;
import javafx.geometry.Insets;
import java.util.Optional;

/**
 * Created by Dominic Massimo on 3/27/2017.
 */
public class EnumDemo extends Application {
    public enum Months  {January, February, March, April, May, June, July, August, September, October,November, December}

    public void start(Stage primaryStage){
        primaryStage.setTitle("Months");
        primaryStage.setWidth(450);
        ComboBox<Months> combo = new ComboBox<>();
        combo.getItems().addAll(Months.January, Months.February, Months.March,Months.April,Months.May,Months.June,Months.July,Months.August,Months.September,Months.October,Months.November,Months.December,Months.January);

        Label label = new Label("Please select a month");
        Button button = new Button("Exit");
        VBox pane = new VBox();
        combo.setOnAction(e-> {
            switch (combo.getValue()) {
                case December:
                case January:
                case February:
                    label.setText("Do you want to build a snowman?");
                    break;
                case March:
                case April:
                case May:
                    label.setText("Happy Spring days!");
                    break;
                case June:
                case July:
                case August:
                    label.setText("it summer time");
                    break;
                case September:
                case October:
                case November:
                    label.setText("Welcome to the foliage season");
                    break;
            }
        });

        button.setOnAction(e->System.exit(0));
        pane.getChildren().add(label);
        pane.getChildren().add(combo);
        pane.getChildren().add(button);
        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.show();




            }
        }

