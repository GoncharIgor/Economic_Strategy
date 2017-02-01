package food;

import economy.food.Food;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by i.gonchar on 2/1/2017.
 */
public class FoodTest {

    @Test
    public void testInitialFoodCount() {
        int actualCount = Food.getFoodAccount();
        Assert.assertEquals(actualCount, 100, "Incorrect initial food count");
    }

}
