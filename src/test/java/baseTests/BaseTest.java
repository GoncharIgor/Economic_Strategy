package baseTests;

import GUI.swing.MainWindow;

public abstract class BaseTest {
    private MainWindow gameWindow;

    public void setUpGameWindow() {
        try {
            gameWindow = new MainWindow();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void closeGameWindow() {
        gameWindow.closeFrame();
    }
}
