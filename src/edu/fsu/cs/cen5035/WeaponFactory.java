package edu.fsu.cs.cen5035;
import java.util.Random;
/**
 *
 * @author Javier
 */
public class WeaponFactory {

    public static Weapon getWeapon(String type) {
        switch (type) {
            case "sword":
                return new Sword();
            case "spear":
            	return new Spear();
			case "simplehammer":
                return new SimpleHammer();
            case "crazyrandomsword":
				Random rand = new Random();	
				int hitpoints = rand.nextInt(99) + 4;
            	return new CrazyRandomSword(hitpoints);
			case "shuriken":
                return new Shuriken();
            default:
                throw new IllegalArgumentException("Invalid type");
        }
    }

}
