
public class Samurai extends Human{
    protected int health = 200;
    
    public static int numOfSamurai = 0;
    
    public Samurai() {
        numOfSamurai ++;
    }
    public void deathBlow(Human hero) {
        hero.health = 0;
        this.health = this.health / 2;
    }
    public void meditate(){
        this.health = this.health + this.health / 2;
    }
    public int howMany() {
        return numOfSamurai; 
    }
}