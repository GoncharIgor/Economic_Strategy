package economy;

import economy.resources.Gold;
import economy.resources.Iron;

/**
 * Created by i.gonchar on 12/8/2015.
 */
public class AllResources {
    private static int gold = Gold.getGoldAmount();
    private static int iron = Iron.getIronAmount();

    private static int allResources = gold + iron;
}
