import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        AttackStrategy Sword = new SwordAttackStrategy();
        AttackStrategy Weapon = new WeaponAttackStrategy();
        AttackStrategy AirForce = new AirForceAttackStrategy();

        while(true)
        {
            Scanner s = new Scanner(System.in);
            System.out.println("For AIRFORCE: 1, WEAPON: 2, and SWORD: 3.");
            int choice = s.nextInt();
            if(choice == 1)
            {
                System.out.println(AirForce.attack());
            }
            if(choice == 2)
            {
                System.out.println(Weapon.attack());
            }
            if(choice == 3)
            {
                System.out.println(Sword.attack());
            }
        }
    }
}