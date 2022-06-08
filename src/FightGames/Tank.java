package FightGames;

public class Tank extends Hero{
    String className =  "Tank";

    @Override
    void spawnIntro() {
        System.out.println("You won't take me down");
    }
    @Override
    void battleText() {
        System.out.println("Feel my sword!");
    }
    public void Tank()
    {
        setHealthPoint(7000);
        setMaxHealthPoint(7000);
        setAtkPoint(500);
        setDefPoint(500);
    }
    public void StatInc(int level) {
        double hpIncrease = 200 * level - 1;
        double defIncrease = 15 * level - 1;
        double atkIncrease = 20 * level - 1;
        setHealthPoint(7000 + hpIncrease);
        setMaxHealthPoint(7000 + hpIncrease);
        setAtkPoint(500 + atkIncrease);
        setDefPoint(500 + defIncrease);
    }
}
