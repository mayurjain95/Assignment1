package edu.fsu.cs.cen5035;
import java.util.Random;
/**
 * @author Javier
 */
public class CrazyRandomSword extends BasicWeapon implements Weapon {

    public CrazyRandomSword() {
		Random rand = new Random();	
        int hitpoints = rand.nextInt(99) + 4;
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
