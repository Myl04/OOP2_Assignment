class GameStats {
    private int exp = 0;

    public void gainXP(int amount) {
        exp += amount;
        System.out.println("Gained " + amount + " XP! Total XP: " + exp);
    }

    public int getLevel() {
        return exp / 100; 
    }

    public int getXP() {
        return exp;
    }

}
