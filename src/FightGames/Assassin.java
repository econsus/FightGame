package FightGames;

public class Assassin extends Hero implements CriticalDamage{
    String className =  "Assassin";

    @Override
    void spawnIntro() {
        System.out.println("Now you see me, now you don't");
    }
    @Override
    void battleText() {
        System.out.println("Omae wa mou, shindeiru!");
    }
    public void Assassin() {
        setHealthPoint(3000);
        setMaxHealthPoint(3000);
        setAtkPoint(800 + (800*criticalDamageMod));
        setDefPoint(300);
    }
    public void StatInc(int level) {
        double hpIncrease = 90 * level - 1;
        double defIncrease = 15 * level - 1;
        double atkIncrease = 30 * level - 1;
        System.out.println(getAtkPoint());
        setHealthPoint(3000 + hpIncrease);
        setMaxHealthPoint(3000 + hpIncrease);
        setAtkPoint(800 + (800*criticalDamageMod) + atkIncrease);
        setDefPoint(300 + defIncrease);
    }
}
