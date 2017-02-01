package army;

import GUI.swing.MainWindow;

/**
 * Created by i.gonchar on 12/8/2015.
 */
public class Worker extends Unit {

    public static int workerCount = 0;

    public Worker(){
        int allUnits = getAllUnits();
        setAllUnits(allUnits + 1);
        workerCount++;
        MainWindow.setWorkerToGui();
    }

    public static void decreaseWorkersAmount(int workersAmount){
        workerCount -= workersAmount;
        int allUnits = getAllUnits();
        setAllUnits(allUnits - 1);
        MainWindow.setWorkerToGui();
    }

    public static int getWorkerCount() {
        return workerCount;
    }

    public static void setWorkerCount(int workerCount) {
        Worker.workerCount = workerCount;
    }
}
