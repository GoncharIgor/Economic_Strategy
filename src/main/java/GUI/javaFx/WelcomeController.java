package GUI.javaFx;

import GUI.swing.GameStart;
import GUI.swing.MainWindow;
import javafx.scene.control.*;
import javafx.scene.control.TextField;

import java.awt.*;
import java.awt.Button;

/**
 * Created by Home on 06.01.2016.
 */
public class WelcomeController {

    public void startGameClicked() throws Exception {
        System.out.println("Game started");
        GameStart.gameStart();
    }
}
