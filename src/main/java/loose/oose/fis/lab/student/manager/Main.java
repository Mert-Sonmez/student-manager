package loose.oose.fis.lab.student.manager;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/loose/oose/fis/lab/student/manager/fxml/login.fxml"));

        if (root == null) {
            System.out.println("Error: FXML file could not find!");
        }

        primaryStage.setTitle("SEF - Student Manager");
        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.show();
    }
}