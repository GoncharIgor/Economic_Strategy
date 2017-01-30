package economy.buildings.mines;

/**
 * Created by i.gonchar on 12/8/2015.
 */
public abstract class Mine {
    private static int allMines = GoldMine.getGoldMines() + GoldMine.getUpdatedGoldMines() + IronMine.getIronMines();

    public static int getAllMines(){
        return Mine.allMines;
    }
 }
