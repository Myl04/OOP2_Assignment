
abstract class Hero {
    public String name;
    public int health;

    public Hero(String name, int health) {
        this.name = name;
        this.health = health;
    }

  
    public abstract void attack();
}


class Warrior extends Hero {
    public Warrior(String name) {
        super(name, 120); 
    }

    @Override
    public void attack() {
        System.out.println(name + " swings a heavy Iron Sword!");
    }
}


class Archer extends Hero {
    public Archer(String name) {
        super(name, 80); 
    }

    @Override
    public void attack() {
        System.out.println(name + " fires a Longbow arrow!");
    }
}