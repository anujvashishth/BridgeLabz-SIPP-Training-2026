import java.util.Scanner;
class GameCharacter {
    String characterName;

    GameCharacter(String characterName) {
        this.characterName = characterName;
    }

    void performAttack() {
        System.out.println(characterName + " attacks!");
    }
}
class Warrior extends GameCharacter {

    Warrior(String characterName) {
        super(characterName);
    }

    @Override
    void performAttack() {
        System.out.println("Warrior " + characterName + " attacks with a Sword!");
    }
}
class Mage extends GameCharacter {

    Mage(String characterName) {
        super(characterName);
    }

    @Override
    void performAttack() {
        System.out.println("Mage " + characterName + " casts a Fireball!");
    }
}

class Archer extends GameCharacter {

    Archer(String characterName) {
        super(characterName);
    }

    @Override
    void performAttack() {
        System.out.println("Archer " + characterName + " shoots an Arrow!");
    }
}

public class AdventureGame {
    public static void startBattle(GameCharacter[] characters) {

        int warriorCount = 0;
        int mageCount = 0;
        int archerCount = 0;

        System.out.println("\n----- Battle Started -----");

        for (GameCharacter ch : characters) {
            ch.performAttack();   

            if (ch instanceof Warrior)
                warriorCount++;
            else if (ch instanceof Mage)
                mageCount++;
            else if (ch instanceof Archer)
                archerCount++;
        }

        System.out.println("\n----- Participants -----");
        System.out.println("Warriors : " + warriorCount);
        System.out.println("Mages    : " + mageCount);
        System.out.println("Archers  : " + archerCount);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        GameCharacter[] characters = new GameCharacter[3];

        System.out.print("Enter Warrior Name: ");
        String warriorName = sc.nextLine();

        System.out.print("Enter Mage Name: ");
        String mageName = sc.nextLine();

        System.out.print("Enter Archer Name: ");
        String archerName = sc.nextLine();

        characters[0] = new Warrior(warriorName);
        characters[1] = new Mage(mageName);
        characters[2] = new Archer(archerName);

        startBattle(characters);

        sc.close();
    }
}
