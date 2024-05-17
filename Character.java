public class Character {
    private String name;
    private int health;
    private int strength;


    public Character(String name, int health, int strength) {
        this.name = name;
        this.health = health;
        this.strength = strength;
    }

    @Override
    public String toString() {
        return "Hi i'm " + name + '\'' +
                ", i have  " + health +
                ", hps and " + strength +
                " strength points";
    }
}
