package army;

import baseTests.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MageTest extends BaseTest {
    private Mage module;

    @Test
    public void testMageCounstructor() {
        setUpGameWindow();
        module = new Mage();
        int actualCount = Mage.getMageCount();
        Assert.assertEquals(actualCount, 1, "Incorrect mages count");
        closeGameWindow();
    }

}
