public class Main {
    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);
        GameStats stats = new GameStats();
        Inventory backpack = new Inventory();
        BattleController engine = new BattleController();
        Dungeon level1 = new Dungeon();

        System.out.println("=== HERO BATTLE ENGINE ===");
        
        System.out.print("Enter your Hero's name: ");
        String userName = scanner.nextLine();

        System.out.println("Choose Class: [1] Warrior | [2] Archer | [3] Paladin");
        int choice = scanner.nextInt();
        
        Hero player;
        if (choice == 2) {
            player = new Archer(userName);
        } else if (choice == 3) {
            player = new Paladin(userName);
        } else {
            player = new Warrior(userName); 
        }

        Hero enemy = new Archer("Vex the Rogue");

        engine.conductBattle(player, enemy, level1);

        backpack.useItem(player, "Health Potion");
        backpack.useItem(player, 50); 
        stats.gainXP(150);

        System.out.println("\n--- SESSION RECAP ---");
        System.out.println("Hero: " + player.name);
        System.out.println("Level: " + stats.getLevel());
        
        scanner.close();
    }
    }

