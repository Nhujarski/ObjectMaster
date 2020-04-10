
public class SamuraiTest {
    public static void main(String[] args) {
        Samurai nick  = new Samurai();
        Samurai mike = new Samurai();
        nick.deathBlow(mike);
        nick.meditate();
        mike.displayHealth();
        nick.displayHealth();
        System.out.println(nick.howMany());
    }
}