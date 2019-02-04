package edu.fsu.cs.cen5035;
/**
 * @author Javier
 */
public class Shuriken extends BasicWeapon implements Weapon {

    public Shuriken() {
		super(25);
    }

    @Override
    public int hit() {
        return DAMAGE;
    }

    @Override
    public int hit(int armor) {
		int damage = DAMAGE;
       if (armor >= 0 && armor < 10 ) {
		   damage -= armor;					// Does complete damage on armor if less than 10.
	   } else if(armor >= 10 && armor < 20 ){
		   damage = (int)( 0.7 *(damage - armor));		// Does 70% damage on armor if in 10-20.
	} else { 
		damage =(int)( 0.5 * (damage - armor));		// Does 50% damage.
	}
        if (damage < 0) {
            return 0;
        }
		
        return damage;
    }

}
