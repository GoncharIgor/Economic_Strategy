package army;

import GUI.swing.MainWindow;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by i.gonchar on 2/1/2017.
 */
public class MageTest {
    private Mage module;
    private MainWindow gameWindow;

    @BeforeMethod
    public void setUp() {
        try {
            gameWindow = new MainWindow();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Test
    public void testMageCounstructor() {
        module = new Mage();
        int actualCount = Mage.getMageCount();
        Assert.assertEquals(actualCount, 1, "Incorrect mages count");
    }

}
