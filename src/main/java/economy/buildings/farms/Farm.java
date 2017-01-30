package economy.buildings.farms;

/**
 * Created by i.gonchar on 12/11/2015.
 */
public abstract class Farm {
    private static int allFarms = MilkFarm.getMilkFarms();

    public static int getAllFarms(){
        return allFarms;
    }
}
