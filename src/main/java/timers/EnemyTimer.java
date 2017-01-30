package timers;

import GUI.swing.MainWindow;

import java.util.Timer;
import java.util.TimerTask;

public class EnemyTimer {
    private Timer timerFarm = new Timer();
    private static int secondsBeforeEnemyStartsInvasion = 300;

    private TimerTask tt = new TimerTask() {

        public void run() {
            MainWindow.setEnemyTimerToGui();
            secondsBeforeEnemyStartsInvasion--;
        }
    };

    public void go() {
        timerFarm.scheduleAtFixedRate(tt, 200, 1000);
    }

    public static int getSecondsBeforeEnemyStartsInvasion() {
        return secondsBeforeEnemyStartsInvasion;
    }
}
