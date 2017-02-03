package army;

import GUI.swing.MainWindow;


public class HeavyWarrior extends Warrior {
    private static int heavyWarriorCount = 0;

    public HeavyWarrior() {
        int allFreeWarriors = getFreeWarriorsCount();
        setFreeWarriorsCount(allFreeWarriors - 1);
        heavyWarriorCount++;

        // For GUI
        MainWindow.setWarrToGui();
    }

    public static int getHeavyWarriorCount() {
        return heavyWarriorCount;
    }

    public static void setHeavyWarriorCount(int heavyWarriorCount) {
        HeavyWarrior.heavyWarriorCount = heavyWarriorCount;
    }
}
