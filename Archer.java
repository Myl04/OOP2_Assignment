class Archer extends Hero {
    public Archer(String name) {
        super(name, 80); 
    }

    @Override
    public void attack() {
        System.out.println(name + " fires a Longbow arrow!");
    }
}