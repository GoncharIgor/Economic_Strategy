package timers;

import GUI.swing.MainWindow;
import economy.food.Food;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by i.gonchar on 12/10/2015.
 */
public class FoodTimer {

    Timer timerFood = new Timer();
    TimerTask ttFood = new TimerTask() {

        public void run() {
            Food.foodIncrease();
            MainWindow.setFoodToGui();
        }
    };

    public void go (){
        timerFood.scheduleAtFixedRate(ttFood, 200, 1000);
    }
}
