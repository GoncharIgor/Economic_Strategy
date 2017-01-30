package economy.buildings.farms;

import GUI.swing.MainWindow;
import army.Unit;
import army.Worker;
import economy.resources.Gold;

import java.awt.*;
import java.util.ArrayList;

/**
 * Created by i.gonchar on 12/10/2015.
 */
public class MilkFarm extends Farm{
    private static int milkFarms = 0;
    private static ArrayList<MilkFarm> farmsList = new ArrayList<MilkFarm>();
    public static int runBar = 0;


    public MilkFarm(){
        MilkFarm.milkFarms++;
        MilkFarm.runBar += 10;
        MainWindow.progressBarMF.setValue( MilkFarm.runBar);
        if (runBar == 100){
            MainWindow.progressBarMF.setForeground(Color.GREEN);
        }
    }

    public static int getMilkFarms (){
        return MilkFarm.milkFarms;
    }

    public static void createMilkFarm() {
        MilkFarm milkFarm = new MilkFarm();
        farmsList.add(milkFarm);
    }

    public static void deleteMilkFarm(){
        int farmAmount = farmsList.size();
        if (farmAmount > 0){
            MilkFarm.milkFarms--;
            MilkFarm.runBar -= 10;
            MainWindow.progressBarMF.setValue( MilkFarm.runBar);
            farmsList.remove(farmAmount -1);
            Gold.increaseGoldAmount(5);
            new Worker();
            MainWindow.setTextToLabel("Milk Farm was deleted");
        }
        else {
            MainWindow.setTextToLabel("There are no milk farms");
        }
    }

}
