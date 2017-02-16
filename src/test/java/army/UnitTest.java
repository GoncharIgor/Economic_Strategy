package army;

import baseTests.BaseTest;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by i.gonchar on 2/3/2017.
 */
public class UnitTest extends BaseTest {
    private Unit module;
    private Mage mage;
    private Warrior warrior;
    private Worker worker;

    @BeforeMethod
    public void setUp() {
        setUpGameWindow();
        Unit.setAllUnits(0);
    }

    @AfterMethod
    public void tearDown() {
       closeGameWindow();
    }

    @Test
    public void testUnitCountAfterAddingWarrior() {
        warrior = new Warrior();
        int actualCount = Unit.getAllUnits();
        Assert.assertEquals(actualCount, 1, "Incorrect units count");
    }

    @Test
    public void testUnitCountAfterAddingMage() {
        mage = new Mage();
        int actualCount = Unit.getAllUnits();
        Assert.assertEquals(actualCount, 1, "Incorrect units count");
    }

    @Test
    public void testUnitCountAfterAddingWorker() {
        worker = new Worker();
        int actualCount = Unit.getAllUnits();
        Assert.assertEquals(actualCount, 1, "Incorrect units count");
    }

    @Test
    public void testUnitCountAfterAddingWarriorAndMage() {
        warrior = new Warrior();
        mage = new Mage();
        int actualCount = Unit.getAllUnits();
        Assert.assertEquals(actualCount, 2, "Incorrect units count");

    }

}
