public class GameApp {
    public static void main(String[] args) {
        
        GameCharacter knight = new Knight();
        knight.performAttack();
        knight.performDefend();
        System.err.println();

        GameCharacter wizard = new Wizard();
        wizard.performAttack();
        wizard.performDefend();
        System.err.println();

        GameCharacter archer = new Archer();
        archer.performAttack();
        archer.performDefend();
    }
}