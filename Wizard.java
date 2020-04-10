
public class Wizard extends Human{
    protected int intelligence = 8;
    protected int health = 50; 

    public int heal(Human hero) {
        return hero.health = hero.health + this.intelligence;
    }
    public int fireball(Human hero) {
        return hero.health =  hero.health - (this.intelligence * 3);
    }
    
}