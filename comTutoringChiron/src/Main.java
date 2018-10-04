import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.util.Scanner;

public class Main extends Application {

  Button button;

  public static void main(String[] args) {
    launch(args);
  }

  @Override
  public void start(Stage primaryStage) throws Exception {
    primaryStage.setTitle("Title of the Window");
    button = new Button();
    button.setText("Click Me");

    StackPane layout = new StackPane();
    layout.getChildren().add(button);

    Scene scene = new Scene(layout, 300, 250);
    primaryStage.setScene(scene);
    primaryStage.show();
  }
//    Scanner input = new Scanner(System.in);
//
//    String studentid = " ";
//    String firstname = " ";
//    String lastname = " ";
//
//    char decision = ' ';
//
//    System.out.println("Welcome to the College of Marin Tutoring Center!");
//
//    System.out.print("Please enter your M00#: ");
//    studentid = input.next();
//
//    System.out.print("Please enter your first name: ");
//    firstname = input.next();
//
//    System.out.print("Please enter your last name: ");
//    lastname = input.next();
//
//
//    System.out.print("\nAre you signing in or out? [Y/N]: ");
//    decision = input.next().charAt(0);
//
//    switch(decision) {
//      case 'Y':
//        System.out.println("Yes statement initiated");
//        // 1. Check data structure to see if current session for user
//        // 2. For now, refer to logic flowchart...
//        break;
//
//      case 'N':
//        System.out.println("No statement initiated");
//        // 1. Check data structure to see if current session for user
//        // 2. For now, refer to logic flowchart...
//        break;
//      default: break;
//    }
//
//    System.exit(0);

}


class CourseSubject {
  private String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}