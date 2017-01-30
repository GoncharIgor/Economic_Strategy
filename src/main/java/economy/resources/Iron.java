package economy.resources;

import economy.buildings.mines.IronMine;

/**
 * Created by i.gonchar on 12/8/2015.
 */
public class Iron {
    private static int ironAmount = 0;

    public static void setIronAmount(int ironAmount) {
        Iron.ironAmount -= ironAmount;
    }

    public static int getIronAmount() {
        return ironAmount;
    }

    public static int ironIncrease() {
        int ironMines = IronMine.getIronMines();
        int updatedIronMines = IronMine.getUpdatedIronMines();
        ironAmount += ironMines + updatedIronMines;
        return ironAmount;
    }
}
