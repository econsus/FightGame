package FightGames;

public class Mage extends Hero implements MagicDamage{
    String className =  "Mage";

    @Override
    void spawnIntro() {
        System.out.println("Lorem ipsum");
    }
    @Override
    void battleText() {
        System.out.println("EXPLOSIOOOOOOOON");
    }
    public void Mage()
    {
        setHealthPoint(2500);
        setMaxHealthPoint(2500);
        setAtkPoint(700 + (700 * magicDamageMod));
        setDefPoint(200);
    }
    public void StatInc(int level) {
        double hpIncrease = 85 * level - 1;
        double defIncrease = 10 * level - 1;
        double atkIncrease = 35 * level - 1;
        setHealthPoint(2500 + hpIncrease);
        setMaxHealthPoint(2500 + hpIncrease);
        setAtkPoint(700 + (700 * magicDamageMod) + atkIncrease);
        setDefPoint(200 + defIncrease);
    }
}
