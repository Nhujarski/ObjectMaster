
public class NinjaTest {
    public static void main(String[] args) {
        Ninja nick  = new Ninja();
        Ninja mike = new Ninja();
        mike.steal(nick);
        mike.runAway();
        mike.displayHealth();
    }
}