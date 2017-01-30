package economy.food;

import army.Unit;
import economy.buildings.farms.Farm;
import economy.buildings.farms.MilkFarm;

/**
 * Created by i.gonchar on 12/10/2015.
 */
public class Food {
    private static int generalFoodAmount = 100;

    public static int foodIncrease (){
        int food = Food.getFoodAccount();
        int units = Unit.allUnits;
        int farms = MilkFarm.getMilkFarms();
        generalFoodAmount  = (food - units) + farms;
        return generalFoodAmount;
    }

    public static int getFoodAccount (){
        return  Food.generalFoodAmount;
    }

}
