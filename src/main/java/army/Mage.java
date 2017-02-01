package army;

import GUI.swing.MainWindow;

/**
 * Created by i.gonchar on 12/8/2015.
 */
public class Mage extends Unit {
    private static int mageCount = 0;

    public Mage(){
        int allUnits = getAllUnits();
        setAllUnits(allUnits + 1);
        mageCount++;
        MainWindow.setMageToGui();
    }

    public static int getMageCount() {
        return mageCount;
    }

    public static void setMageCount(int mageCount) {
        Mage.mageCount = mageCount;
    }
}
