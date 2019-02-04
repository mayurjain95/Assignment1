package edu.fsu.cs.cen5035;

/**
 * @author Javier
 */
public class SimpleHammer extends BasicWeapon implements Weapon {

    public SimpleHammer() {
        super(35);
    }

    @Override
    public int hit() {
        return DAMAGE;
    }

    @Override
    public int hit(int armor) {
        int damage = DAMAGE;
		if(armor > 30){
			damage -= armor;
		}
		
        if (damage < 0) {
            return 0;
        }
		
        return damage;
    }

}
