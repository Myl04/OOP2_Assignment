abstract class Hero {
    public String name;
    public int health;

    public Hero(String name, int health) {
        this.name = name;
        this.health = health;
    }

  
    public abstract void attack();
}

