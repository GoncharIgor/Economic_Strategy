package timers;

import GUI.swing.MainWindow;
import cityLife.CityMethods;
import economy.resources.Gold;
import economy.resources.Iron;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by i.gonchar on 12/9/2015.
 */
public class GoldTimer extends  Timer {
    Timer timerGold = new Timer();
    TimerTask timeTask = new TimerTask() {

        public void run() {
            Gold.goldIncrease();
            MainWindow.setGoldToGui();

            Iron.ironIncrease();
            MainWindow.setIronToGui();
            MainWindow.allButtonsCheck();
            CityMethods.cityFoodCheck();
        }
    };

    public void go() {
        timerGold.scheduleAtFixedRate(timeTask, 200, 1000);
    }


}
