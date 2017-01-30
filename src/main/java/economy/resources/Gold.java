package economy.resources;

        import economy.buildings.mines.GoldMine;

/**
 * Created by i.gonchar on 12/8/2015.
 */
public class Gold {
    private static int goldAmount = 0;

    public static void decreaseGoldAmount(int goldAmount){
        Gold.goldAmount -= goldAmount;
    }

    public static void increaseGoldAmount(int goldAmount){
        Gold.goldAmount += goldAmount;
    }
    public static int getGoldAmount(){
        return goldAmount;
    }

    public static int goldIncrease (){
        int goldMines = GoldMine.getGoldMines();
        int updatedGoldMines = GoldMine.getUpdatedGoldMines();
        goldAmount += goldMines + updatedGoldMines;
        return goldAmount;
    }
}
