package economy.buildings.mines;

import GUI.swing.MainWindow;
import economy.resources.Gold;

import java.awt.*;

/**
 * Created by i.gonchar on 12/8/2015.
 */
public class GoldMine extends Mine {

    private static int goldMinesCount = 1;
    private static int updatedGoldMines = 0;
    public static int runBar = 0;
    public static int runBarUpdatedGM = 0;


    private boolean updatedMine = false;

    public GoldMine() {
        goldMinesCount++;
        //  MainWindow.setTextToLabel("Gold mine added. Total GM: " + goldMinesCount);
        GoldMine.runBar += 25;
        MainWindow.progressBarGM.setValue(GoldMine.runBar);
        if (runBar == 100){
MainWindow.progressBarGM.setForeground(Color.GREEN);
        }
    }

    public static int getGoldMines() {
        return goldMinesCount;
    }

    public static int getUpdatedGoldMines() {
        return updatedGoldMines;
    }

    public static void updateGoldMine() {
        if (updatedGoldMines < goldMinesCount) {
            if (Gold.getGoldAmount() >= 10) {
                Gold.decreaseGoldAmount(10);
                updatedGoldMines++;
                //this.updatedMine = true;
                runBarUpdatedGM += 20;
                MainWindow.progressBarUGM.setValue(GoldMine.runBarUpdatedGM);
                if (runBarUpdatedGM == 100){
                    MainWindow.progressBarUGM.setForeground(Color.GREEN);
                }
                MainWindow.setTextToLabel("Gold mine was upgraded");
            } else {
                MainWindow.setTextToLabel("Not enough gold");
            }
        } else {
            MainWindow.setTextToLabel("No mines to upgrade");
        }
    }

}
