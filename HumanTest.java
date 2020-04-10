
public class HumanTest {
    public static void main(String[] args) {
        Human nick = new Human();
        Human mike = new Human();
        nick.attack(mike);
        mike.displayHealth();
        
    }
}