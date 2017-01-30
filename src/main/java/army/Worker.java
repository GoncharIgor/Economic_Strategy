package army;

import GUI.swing.MainWindow;

/**
 * Created by i.gonchar on 12/8/2015.
 */
public class Worker extends Unit {

    public static int workerCount = 0;

    public Worker(){
        allUnits++;
        workerCount++;
        MainWindow.setWorkerToGui();
    }

    public static void decreaseWorkersAmount(int workersAmount){
        workerCount -= workersAmount;
        allUnits--;
        MainWindow.setWorkerToGui();
    }
}
