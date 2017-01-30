package timers;

import GUI.swing.MainWindow;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by Home on 12.12.2015.
 */
public class FarmTimer {

    Timer timerFarm = new Timer();
    TimerTask tt = new TimerTask() {

        public void run() {
            MainWindow.setMFGui();
        }
    };

    public void go (){
        timerFarm.scheduleAtFixedRate(tt, 200, 1000);
    }

}
