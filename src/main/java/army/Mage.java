package army;

import GUI.swing.MainWindow;

/**
 * Created by i.gonchar on 12/8/2015.
 */
public class Mage extends Unit {
    public static int mageCount = 0;

    public Mage(){
        allUnits++;
        mageCount++;
        MainWindow.setMageToGui();
    }
}
