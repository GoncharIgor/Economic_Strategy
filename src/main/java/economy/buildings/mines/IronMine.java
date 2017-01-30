package economy.buildings.mines;

import GUI.swing.MainWindow;

import java.awt.*;

/**
 * Created by i.gonchar on 12/8/2015.
 */
public class IronMine extends Mine{

    private static int ironMinesCount = 0;
    private static int updatedIronMinesCount = 0;
    public static int runBar = 0;


    public IronMine(){
        ironMinesCount++;
        IronMine.runBar += 20;
        MainWindow.progressBarIM.setValue(IronMine.runBar);
        if (runBar == 100){
            MainWindow.progressBarIM.setForeground(Color.GREEN);
        }
    }

    public static int getIronMines (){
        return ironMinesCount;
    }
    public static int getUpdatedIronMines (){
        return updatedIronMinesCount;
    }

}
