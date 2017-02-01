package army;

/**
 * Created by i.gonchar on 12/8/2015.
 */
public abstract class Unit {
    private static int allUnits = 0;

    public static int getAllUnits() {
        return allUnits;
    }

    public static void setAllUnits(int allUnits) {
        Unit.allUnits = allUnits;
    }
}
