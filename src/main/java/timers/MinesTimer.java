package timers;

import GUI.swing.MainWindow;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by i.gonchar on 12/8/2015.
 */
public class MinesTimer {

    Timer timerIron = new Timer();
    TimerTask timeTaskIron = new TimerTask() {

        public void run() {
            MainWindow.setGMTGui();
            MainWindow.setIMToGui();
            MainWindow.setUpgradedGMT0Gui();
        }
    };

    public void go() {
        timerIron.scheduleAtFixedRate(timeTaskIron, 200, 1000);
    }
}
