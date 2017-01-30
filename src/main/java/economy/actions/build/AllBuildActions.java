package economy.actions.build;

import GUI.swing.MainWindow;
import army.Worker;
import economy.buildings.mines.GoldMine;
import economy.buildings.mines.IronMine;
import economy.buildings.farms.MilkFarm;
import economy.resources.Gold;

/**
 * Created by i.gonchar on 12/8/2015.
 */
public class AllBuildActions {

    public static void buildGoldMine() {
        if (GoldMine.runBar == 100) {
            MainWindow.setTextToLabel("You have max Gold mines");
        } else {
            if (Gold.getGoldAmount() >= 10) {
                new GoldMine();
                Gold.decreaseGoldAmount(10);
                MainWindow.setTextToLabel("Gold mine added");
            } else {
                MainWindow.setTextToLabel("Not enough gold");
            }
        }
    }

    public static void buildIronMine() {
        if (IronMine.runBar == 100) {
            MainWindow.setTextToLabel("You have max Iron mines");
        } else {
            if (Gold.getGoldAmount() >= 10) {
                new IronMine();
                Gold.decreaseGoldAmount(10);
                MainWindow.setTextToLabel("Iron mine added");
            } else {
                MainWindow.setTextToLabel("Not enough gold");
            }
        }

    }

    public static void buildMilkFarm() {
        if (MilkFarm.runBar == 100){
            MainWindow.setTextToLabel("You have max Milk farms");
        } else {
            if (Gold.getGoldAmount() >= 10 && Worker.workerCount > 0) {
                MilkFarm.createMilkFarm();
                Gold.decreaseGoldAmount(10);
                Worker.decreaseWorkersAmount(1);
                MainWindow.setTextToLabel("Milk Farm added");
            } else {
                MainWindow.setTextToLabel("Not enough resources");
            }
        }

    }


    public static void showGoldMines() {

    }

    public static void showIronMines() {

    }
}
