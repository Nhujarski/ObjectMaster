
public class WizardTest {
    public static void main(String[] args) {
        Wizard max  = new Wizard();
        Wizard darsh = new Wizard();
        darsh.fireball(max);
        darsh.heal(max);
        max.displayHealth();

    }
}