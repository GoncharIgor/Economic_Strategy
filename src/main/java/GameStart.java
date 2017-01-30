import GUI.swing.MainWindow;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import timers.*;

public class GameStart extends Application {

    public static void main(String[] args) throws Exception {
        //launch(args);
        gameStart();
    }

    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Caravan Wars");
        FXMLLoader loader = new FXMLLoader();
        Parent root = loader.load(getClass().getResource("gui/WelcomePage.fxml"));

        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void gameStart() throws Exception {
        MainWindow gameWindow = new MainWindow();

        MinesTimer mineTime = new MinesTimer();
        ResourcesTimer goldTimer = new ResourcesTimer();
        FoodTimer foodTimer = new FoodTimer();
        FarmTimer farmTimer = new FarmTimer();
        EnemyTimer enemyTimer = new EnemyTimer();

        goldTimer.go();
        mineTime.go();
        foodTimer.go();
        farmTimer.go();
        enemyTimer.go();

    }
}
