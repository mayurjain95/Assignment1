package edu.fsu.cs.cen5035;
import java.util.Random;
/**
 * @author Javier
 */
public class CrazyRandomSword extends BasicWeapon implements Weapon {

    public CrazyRandomSword(int hitpoints) {
		super(hitpoints);
    }

    @Override
    public int hit() {
        return DAMAGE;
    }

    @Override
    public int hit(int armor) {
        int damage = DAMAGE;
		Random rand = new Random();	
		int ignore = rand.nextInt(armor/3) + 3;
		armor -= ignore;
		damage -= armor;
        if (damage < 0) {
            return 0;
        }
		
        return damage;
    }

}
