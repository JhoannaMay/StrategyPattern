public class Knight extends GameCharacter {
    public Knight() {
        this.attackStrategy = new SwingSword();
        this.defenseStrategy = new Shield();
    }
}