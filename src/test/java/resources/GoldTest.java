package resources;

import economy.resources.Gold;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by i.gonchar on 2/1/2017.
 */
public class GoldTest {

    @BeforeMethod
    public void setUp(){
        Gold.setGoldAmount(0);
    }

    @Test
    public void testInitialGoldCount() {
        int actualCount = Gold.getGoldAmount();
        Assert.assertEquals(actualCount, 0, "Incorrect initial gold count");
    }

    @Test
    public void testIncreaseGoldAmountBy12(){
        Gold.increaseGoldAmount(12);
        int actualCount = Gold.getGoldAmount();
        Assert.assertEquals(actualCount, 12, "Incorrect increase of gold count");
    }

    @Test
    public void testIncreaseGoldAmountBy0(){
        Gold.increaseGoldAmount(0);
        int actualCount = Gold.getGoldAmount();
        Assert.assertEquals(actualCount, 0, "Incorrect increase of gold count");
    }

    @Test
    public void testDecreaseGoldAmountBy12(){
        Gold.decreaseGoldAmount(12);
        int actualCount = Gold.getGoldAmount();
        Assert.assertEquals(actualCount, -12, "Incorrect decrease gold of count");
    }

    @Test
    public void testDecreaseGoldAmountBy0(){
        Gold.decreaseGoldAmount(0);
        int actualCount = Gold.getGoldAmount();
        Assert.assertEquals(actualCount, 0, "Incorrect decrease of gold count");
    }
}
