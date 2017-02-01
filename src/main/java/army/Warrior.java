package army;

import GUI.swing.MainWindow;

/**
 * Created by i.gonchar on 12/8/2015.
 */
public class Warrior extends Unit {
    public static int warriorCount = 0;

    public Warrior() {
        int allUnits = getAllUnits();
        setAllUnits(allUnits + 1);
        warriorCount++;
        // For GUI
        MainWindow.setWarrToGui();
    }
}
