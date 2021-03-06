public class EvilOrc implements IEnemy {
    
    private int health;
    private int damageToPlayer;
    
    public EvilOrc(){
        this.health = 10;
        this.damageToPlayer = 5;
    }

    public int attackPlayer() {
        return this.damageToPlayer;
    }

    public int getHealth() {
        return this.health;
    }

    public void reduceHealth(int damage){
        this.health -= damage;
    }
}
