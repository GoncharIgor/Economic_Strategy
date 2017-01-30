package cityLife;

import GUI.swing.MainWindow;
import economy.food.Food;

public abstract class CityMethods {

    public static void cityFoodCheck() {
        if (Food.getFoodAccount() <= -100) {
            MainWindow.endNotification ();
            System.exit(0);
        } else if (Food.getFoodAccount() <= -50) {
            MainWindow.setErrorTextToLabel("-100: and programm ends!!");
        } else if (Food.getFoodAccount() <= 0) {
            MainWindow.setErrorTextToLabel("NO FOOD!!!!!");
        }
    }
}
