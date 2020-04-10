public class Human {
    protected int strength = 3;
    protected int stealth = 3;
    protected int intelligence = 3;
    protected int health = 100;

    public int attack(Human hero) {
        return hero.health = hero.health - this.strength;
    }
    public void displayHealth(){
        System.out.print(health);
    }
}