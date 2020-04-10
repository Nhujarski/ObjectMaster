
public class Ninja extends Human{
    protected int stealth = 10;

    public  void  steal(Human hero) {
        hero.health = hero.health + this.stealth;
        this.health = this.health + this.stealth;
    }
    public void runAway() {
        this.health -= 10;
    }
    
}