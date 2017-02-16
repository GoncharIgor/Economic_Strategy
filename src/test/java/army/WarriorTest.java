package army;

import baseTests.BaseTest;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

/**
 * Created by i.gonchar on 2/16/2017.
 */
public class WarriorTest extends BaseTest{
    private Warrior warrior;
    private HeavyWarrior heavyWarrior;

    @BeforeMethod
    public void setUp() {
        setUpGameWindow();
        Unit.setAllUnits(0);
    }

    @AfterMethod
    public void tearDown() {
        closeGameWindow();
    }
}
