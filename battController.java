public class battController {
    public void conductBattle(Hero player, Hero enemy, Dungeon level) {
        System.out.println("Entering the " + level.theme + " dungeon...");
        System.out.println(player.name + " encounters " + enemy.name + "!");
        
        while (player.health > 0 && enemy.health > 0) {
            player.attack();
            enemy.health -= 20; 
            if (enemy.health <= 0) {
                System.out.println(enemy.name + " has been defeated!");
                break;
            }

            enemy.attack();
            player.health -= 15; 
            if (player.health <= 0) {
                System.out.println(player.name + " has been defeated!");
                break;
            }
        }
    }
}
