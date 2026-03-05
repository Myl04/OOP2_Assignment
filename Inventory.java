public class Inventory {
    
    public void useItem(Hero hero, String item) {
        if (item.equals("Health Potion")) {
            hero.health += 50;
            System.out.println(hero.name + " used a Health Potion! Health is now: " + hero.health);
        } else {
            System.out.println("Item not recognized.");
        }
    }

 


}
