package army;

import baseTests.BaseTest;
import economy.resources.Gold;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MageTest extends BaseTest {
    private Mage mage;

    @BeforeMethod
    public void setUp() {
        setUpGameWindow();
        Mage.setMageCount(0);
    }

    @AfterMethod
    public void tearDown() {
        closeGameWindow();
    }

    @Test
    public void testMageCountAfterAddingMage() {
        mage = new Mage();
        int actualCount = Mage.getMageCount();
        Assert.assertEquals(actualCount, 1, "Incorrect mages count");
    }

    @Test
    public void testCannotAddMageWithoutGold() {
        Gold.setGoldAmount(9);
        UnitAdd.addMageUnit();
        int actualCount = Mage.getMageCount();
        Assert.assertEquals(actualCount, 0, "Incorrect mages count");
    }

    @Test
    public void testcanAddMageWithGold10() {
        Gold.setGoldAmount(10);
        UnitAdd.addMageUnit();
        int actualCount = Mage.getMageCount();
        Assert.assertEquals(actualCount, 1, "Incorrect mages count");
    }

}
