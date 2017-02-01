package timers;

import GUI.swing.MainWindow;
import war.FightVsEnemy;

import java.util.Timer;
import java.util.TimerTask;

public class EnemyTimer {
    private Timer timerEnemy = new Timer();
    private static int secondsBeforeEnemyStartsInvasion = 5;

    private TimerTask tt = new TimerTask() {

        public void run() {
            if (secondsBeforeEnemyStartsInvasion > 0) {
                MainWindow.setEnemyTimerToGui(secondsBeforeEnemyStartsInvasion);
                secondsBeforeEnemyStartsInvasion--;
            } else {
                MainWindow.setEnemyTimerToGui(secondsBeforeEnemyStartsInvasion);
                System.out.println("The result of your fight is: " + FightVsEnemy.fight());
                timerEnemy.cancel();
                timerEnemy.purge();
            }

        }
    };


    public void go() {
        timerEnemy.scheduleAtFixedRate(tt, 200, 1000);
    }

    public static int getSecondsBeforeEnemyStartsInvasion() {
        return secondsBeforeEnemyStartsInvasion;
    }

}
