package army;

import GUI.swing.MainWindow;
import economy.resources.Gold;
import economy.resources.Iron;

/**
 * Created by i.gonchar on 12/8/2015.
 */
public class UnitAdd {

    public static void addWarriorUnit() {
        if (Gold.getGoldAmount() >= 10 && Iron.getIronAmount() >= 10) {
            new Warrior();
            Gold.decreaseGoldAmount(10);
            Iron.setIronAmount(10);
            MainWindow.setTextToLabel("Warrior was added");
        } else if (Gold.getGoldAmount() >= 10 && Iron.getIronAmount() < 10) {
            MainWindow.setTextToLabel("Not enough iron");
        } else if (Gold.getGoldAmount() < 10 && Iron.getIronAmount() >= 10) {
            MainWindow.setTextToLabel("Not enough gold");
        } else {
            MainWindow.setTextToLabel("Not enough gold and iron");
        }
    }

    public static void addMageUnit() {
        if (Gold.getGoldAmount() >= 10) {
            new Mage();
            Gold.decreaseGoldAmount(10);
            MainWindow.setTextToLabel("Mage was added");
        } else {
            MainWindow.setTextToLabel("Not enough gold");
        }
    }

    public static void addWorkerUnit() {
        if (Gold.getGoldAmount() >= 10) {
            new Worker();
            Gold.decreaseGoldAmount(10);
            MainWindow.setTextToLabel("Worker was added");
        } else {
            MainWindow.setTextToLabel("Not enough gold");
        }
    }
}
