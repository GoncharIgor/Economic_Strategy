package army;

import GUI.swing.MainWindow;

/**
 * Created by i.gonchar on 12/8/2015.
 */
public class Warrior extends Unit {
    public static int warriorCount = 0;
    private static int freeWarriorsCount = 0;

    public Warrior() {
        int allUnits = getAllUnits();
        setAllUnits(allUnits + 1);
        warriorCount++;
        freeWarriorsCount++;
        // For GUI
        MainWindow.setWarrToGui();
    }

    public static int getWarriorCount() {
        return warriorCount;
    }

    public static void setWarriorCount(int warriorCount) {
        Warrior.warriorCount = warriorCount;
    }

    public static int getFreeWarriorsCount() {
        return freeWarriorsCount;
    }

    public static void setFreeWarriorsCount(int freeWarriorsCount) {
        Warrior.freeWarriorsCount = freeWarriorsCount;
    }
}
