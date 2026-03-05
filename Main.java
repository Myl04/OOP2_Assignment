public class Main {
    public static void main(String[] args) {
      
        Hero player = new Warrior("Arthur");
        Hero enemy = new Archer("Robin");

       
        GameStats sessionStats = new GameStats();
        Inventory backpack = new Inventory();

       
        Dungeon level1 = new Dungeon();
        BattleController engine = new BattleController();

       
        engine.conductBattle(player, enemy, level1);
        backpack.useItem(player, "Health Potion");
        sessionStats.gainXP(150);
        
        System.out.println(player.name + " is now Level: " + sessionStats.getLevel());
    }
}
