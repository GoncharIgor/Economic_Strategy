package war;

import army.Mage;
import army.Warrior;

public class FightVsEnemy {
    private static int enemyWarriors = 50;
    private static int enemyMages = 50;

    private static int yourWarriors;
    private static int yourMages;

    public static boolean fight() {
        boolean victory = false;
        yourWarriors = Warrior.warriorCount;
        yourMages = Mage.mageCount;

        if (yourWarriors >= enemyWarriors && yourMages >= enemyMages) {
            victory = true;
        } else if (yourWarriors < enemyWarriors && yourMages < enemyMages) {
            victory = false;
        }

        return victory;
    }

    private int warriorsFight(int yourWarriors, int enemyWarriors) {
        return yourWarriors - enemyWarriors;
    }

    private int magesFight(int yourMages, int enemyMages) {
        return yourMages - enemyMages;
    }

}
