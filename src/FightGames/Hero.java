package FightGames;

public abstract class Hero
{
    private double maxHealthPoint, healthPoint, atkPoint, defPoint, trueDmg;
    private int level;
    private boolean isAlive = true;

    abstract void spawnIntro();

    abstract void battleText();

    public void Attack(double attackeratk, double targetdef,
                double targerdef, String attacker,
                String target){
        double trueDmg = attackeratk - targerdef;
        battleText();
    }

    void reviewDamage(double damage, String attacker, String target){
        System.out.println(attacker + " hit " + target + " for " + damage + "damage");
    }

    void checkStats(int player){
        System.out.println("=====================================");
        System.out.println("PLAYER " + player);
        System.out.println("HP      : " + healthPoint + "/" + maxHealthPoint);
        System.out.println("ATK     : " + atkPoint);
        System.out.println("DEF     : " + defPoint);
        System.out.println("=====================================");
    }

    public void setMaxHealthPoint(double maxHealthPoint) {
        this.maxHealthPoint = maxHealthPoint;
    }

    public double getMaxHealthPoint() {
        return maxHealthPoint;
    }

    public void setHealthPoint(double healthPoint) {
        this.healthPoint = healthPoint;
    }

    public double getHealthPoint() {
        return healthPoint;
    }

    public void setAtkPoint(double atkPoint) {
        this.atkPoint = atkPoint;
    }

    public double getAtkPoint() {
        return atkPoint;
    }

    public void setDefPoint(double defPoint) {
        this.defPoint = defPoint;
    }

    public double getDefPoint() {
        return defPoint;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    public void setAlive() {
        if(this.healthPoint == 0){
            this.isAlive = false;
        }

    }

    public boolean getAlive() {
        return isAlive;
    }

    public void setTrueDmg(double defPoint, double atkPoint) {
        this.trueDmg = atkPoint-defPoint;
    }

    public double getTrueDmg() {
        return trueDmg;
    }
}
