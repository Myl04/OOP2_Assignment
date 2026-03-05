public class battController {
    public void conductBattle(Hero h1, Hero h2, Map location){
        System.out.println("Location: " + location.theme);
        System.out.println("--FIGHT!--");
        h1.attack();
        h2.attack();
        System.out.println("--BATTLE ENDED--");
    }
}
