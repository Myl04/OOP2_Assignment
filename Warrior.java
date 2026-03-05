class Warrior extends Hero {
    public Warrior(String name) {
        super(name, 120); 
    }

    @Override
    public void attack() {
        System.out.println(name + " swings a heavy Iron Sword!");
    }
}