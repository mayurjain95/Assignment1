package edu.fsu.cs.cen5035;

/**
 *
 * @author Javier
 */
public class RoleGame {

    public static void main(String[] args) {

    	int armor = 29;  // I couldn't understand the line to add test cases. I did checked the code using different armor values.

        Weapon weapon = WeaponFactory.getWeapon("sword");
        System.out.println("Sword has " + weapon.hit() + " of damage.");        
        System.out.println("Swords was able to do " + weapon.hit(armor) + " of damage due to an armor with "+armor+ " points.");

        weapon = WeaponFactory.getWeapon("spear");
        System.out.println("Spear has " + weapon.hit() + " of damage.");        
        System.out.println("Spear was able to do " + weapon.hit(armor) + " of damage due to an armor with "+armor+ " points.");
        
        weapon = WeaponFactory.getWeapon("simplehammer");
        System.out.println("Simple Hammer has " + weapon.hit() + " of damage.");        
        System.out.println("Simple Hammer was able to do " + weapon.hit(armor) + " of damage due to an armor with "+armor+ " points.");
		
		weapon = WeaponFactory.getWeapon("crazyrandomsword");
        System.out.println("Crazy Random Sword has " + weapon.hit() + " of damage.");        
        System.out.println("Crazy Random Sword was able to do " + weapon.hit(armor) + " of damage due to an armor with "+armor+ " points.");
		
		weapon = WeaponFactory.getWeapon("shuriken");
        System.out.println("Shuriken has " + weapon.hit() + " of damage.");        
        System.out.println("Shuriken was able to do " + weapon.hit(armor) + " of damage due to an armor with "+armor+ " points.");

    }
}
