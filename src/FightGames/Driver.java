package FightGames;
import java.util.Scanner;
import java.util.Random;


public class Driver {
    static int choice1, choice2, hero1Level, hero2Level, hero1, hero2;
    static Tank tank1, tank2;
    static Assassin assassin1, assassin2;
    static Mage mage1, mage2;
    static boolean hero1Alive, hero2Alive;
    static double trueDmg1, trueDmg2, dmg1, dmg2, def1, def2, hp1, hp2;
    //Selecting hero system
    public static void Menu(){
        int a = 1;
        //int b = 1;
        Scanner scan = new Scanner(System.in);
        System.out.println("=====================================");
        System.out.println("Player 1 choose your Hero");
        System.out.print("1.Tank \n2.Assassin \n3.Mage\n");
        while(a == 1){
            choice1 = scan.nextInt();
            switch (choice1) {
                case 1 -> {
                    System.out.println("Player 1 Choose Tank");
                    System.out.println("=====================================");
                    a++;
                }
                case 2 -> {
                    System.out.println("Player 1 Choose Assassin");
                    System.out.println("=====================================");
                    a++;
                }
                case 3 -> {
                    System.out.println("Player 1 Choose a Mage");
                    System.out.println("=====================================");
                    a++;
                }
                default -> {
                    System.out.println("=====================================");
                    System.out.println("Choose between 1 - 3");
                }
            }
        }
        //Level selecting player 1
        System.out.println("Player 1, what's your hero level?");
        System.out.println(" ");
        System.out.println("Input 1 - 10");
        while(hero1Level>=10 || hero1Level<=1){
            hero1Level = scan.nextInt();
            if(hero1Level<=10 && hero1Level>=1){
                System.out.println("Player 1's Hero level is " + hero1Level);
                System.out.println("=====================================");
                break;
            }
            System.out.println("=====================================");
            System.out.println("Your level must be between 1 - 10");
        }
        a = 1;
        System.out.println("Player 2 choose your Hero");
        System.out.print("1.Tank \n2.Assassin \n3.Mage\n");
        while(a == 1){
            choice2 = scan.nextInt();
            switch (choice2) {
                case 1 -> {
                    System.out.println("Player 2 Choose Tank");
                    System.out.println("=====================================");
                    a++;
                }
                case 2 -> {
                    System.out.println("Player 2 Choose Assassin");
                    System.out.println("=====================================");
                    a++;
                }
                case 3 -> {
                    System.out.println("Player 2 Choose Mage");
                    System.out.println("=====================================");
                    a++;
                }
                default -> {
                    System.out.println("=====================================");
                    System.out.println("Choose between 1 - 3");
                }
            }
        }
        //Level selecting player 2
        System.out.println("Player 2, what's your hero level?");
        System.out.println("Input 1 - 10");
        while(hero2Level>=10 || hero2Level<=1){
            hero2Level = scan.nextInt();
            if(hero2Level<=10 && hero2Level>=1){
                System.out.println("Player 2's Hero level is " + hero2Level);
                break;
            }
            System.out.println("=====================================");
            System.out.println("Your level must be between 1 - 10");
        }
    }
    static void Intro() {
        System.out.println("=====================================");
        System.out.println("");
        //Player 1 Hero
        hero1 = choice1;
        if(hero1 == 1){
            tank1 = new Tank();
            tank1.spawnIntro();
            System.out.println("=====================================");
        }
        else if(hero1 == 2){
            assassin1 = new Assassin();
            assassin1.spawnIntro();
            System.out.println("=====================================");
        }
        else if(hero1 == 3){
            mage1 = new Mage();
            mage1.spawnIntro();
            System.out.println("=====================================");
        }
        //Player2 Hero
        hero2 = choice2;
        if(hero2 == 1){
            tank2 = new Tank();
            tank2.spawnIntro();
            System.out.println("=====================================");
        }
        else if(hero2 == 2){
            assassin2 = new Assassin();
            assassin2.spawnIntro();
            System.out.println("=====================================");
        }
        else if(hero2 == 3){
            mage2 = new Mage();
            mage2.spawnIntro();
            System.out.println("=====================================");
        }
    }
    static void Battle()
    {
        System.out.println("=====================================");
        //Player 1 Hero stat adjusment
        hero1 = choice1;
        int a = 1;
        if(hero1 == 1){
            tank1 = new Tank();
            tank1.StatInc(hero1Level);
            hero1Alive = tank1.getAlive();
            tank1.checkStats(a);
            dmg1 = tank1.getAtkPoint();
            def1 = tank1.getDefPoint();
            hp1 = tank1.getHealthPoint();
        }
        else if(hero1 == 2){
            assassin1 = new Assassin();
            assassin1.StatInc(hero1Level);
            hero1Alive = assassin1.getAlive();
            assassin1.checkStats(a);
            dmg1 = assassin1.getAtkPoint();
            def1 = assassin1.getDefPoint();
            hp1 = assassin1.getHealthPoint();
        }
        else if(hero1 == 3){
            mage1 = new Mage();
            mage1.StatInc(hero1Level);
            hero1Alive = mage1.getAlive();
            mage1.checkStats(a);
            dmg1 = mage1.getAtkPoint();
            def1 = mage1.getDefPoint();
            hp1 = mage1.getHealthPoint();
        }
        //Player2 Hero stat adjusment
        int b = 2;
        hero2 = choice2;
        if(hero2 == 1){
            tank2 = new Tank();
            tank2.StatInc(hero2Level);
            hero2Alive = tank2.getAlive();
            tank2.checkStats(b);
            dmg2 = tank2.getAtkPoint();
            def2 = tank2.getDefPoint();
            hp2 = tank2.getHealthPoint();
        }
        else if(hero2 == 2){
            assassin2 = new Assassin();
            assassin2.StatInc(hero2Level);
            hero2Alive = assassin2.getAlive();
            assassin2.checkStats(b);
            dmg2 = assassin2.getAtkPoint();
            def2 = assassin2.getDefPoint();
            hp2 = assassin2.getHealthPoint();
        }
        else if(hero2 == 3){
            mage2 = new Mage();
            mage2.StatInc(hero2Level);
            hero2Alive = mage2.getAlive();
            mage2.checkStats(b);
            dmg2 = mage2.getAtkPoint();
            def2 = mage2.getDefPoint();
            hp2 = mage2.getHealthPoint();
        }
        trueDmg1 = dmg1 - def2;
        trueDmg2 = dmg2 - def1;
        int round = 1;
        while(hp1 > 0 && hp2 > 0)
        {
            System.out.println("=====================================");
            System.out.println("ROUND " + round);
            System.out.println("=====================================");
            System.out.println("PLAYER 1 TURN");
            System.out.println("=====================================");
            switch (hero1){
                case 1 ->{
                    tank1.battleText();
                    tank1.checkStats(a);
                    System.out.println("=====================================");
                    System.out.println("Player 1 Attack");
                }
                case 2 ->{
                    assassin1.battleText();
                    assassin1.checkStats(a);
                    System.out.println("=====================================");
                    System.out.println("Player 1 Attack");
                }
                case 3 ->{
                    mage1.battleText();
                    mage1.checkStats(a);
                    System.out.println("=====================================");
                    System.out.println("Player 1 Attack");
                }
            }
            System.out.println("=====================================");
            System.out.println("Player 2 got hit for " + trueDmg1);
            System.out.println("=====================================");
            switch (hero2){
                case 1 ->{
                    tank2.setHealthPoint(hp2 - trueDmg1);
                    hp2 = tank2.getHealthPoint();
                }
                case 2 ->{
                    assassin2.setHealthPoint(hp2 - trueDmg1);
                    hp2 = assassin2.getHealthPoint();
                }
                case 3 ->{
                    mage2.setHealthPoint(hp2 - trueDmg1);
                    hp2 = mage2.getHealthPoint();
                }
            }
            System.out.println("=====================================");
            System.out.println("PLAYER 2 TURN");
            System.out.println("=====================================");
            switch (hero2){
                case 1 ->{
                    tank2.battleText();
                    tank2.checkStats(b);
                    System.out.println("=====================================");
                    System.out.println("Player 2 Attack");
                }
                case 2 ->{
                    assassin2.battleText();
                    assassin2.checkStats(b);
                    System.out.println("=====================================");
                    System.out.println("Player 2 Attack");
                }
                case 3 ->{
                    mage2.battleText();
                    mage2.checkStats(b);
                    System.out.println("=====================================");
                    System.out.println("Player 2 Attack");
                }
            }
            System.out.println("=====================================");
            System.out.println("Player 1 got hit for " + trueDmg2);
            System.out.println("=====================================");
            switch (hero1){
                case 1 ->{
                    tank1.setHealthPoint(hp1 - trueDmg2);
                    hp1 = tank1.getHealthPoint();
                }
                case 2 ->{
                    assassin1.setHealthPoint(hp1 - trueDmg2);
                    hp1 = assassin1.getHealthPoint();
                }
                case 3 ->{
                    mage1.setHealthPoint(hp1 - trueDmg1);
                    hp1 = mage1.getHealthPoint();
                }
            }
            if(hp1 <= 0){
                switch (hero1){
                    case 1 ->{
                        tank1.checkStats(a);
                        tank1.setAlive();
                        System.out.println("Player 1 Down, The Winner is Player 2");
                    }
                    case 2 ->{
                        assassin1.checkStats(a);
                        assassin1.setAlive();
                        System.out.println("Player 1 Down, The Winner is Player 2");
                    }
                    case 3 ->{
                        mage1.checkStats(a);
                        mage1.setAlive();
                        System.out.println("Player 1 Down, The Winner is Player 2");
                    }
                }
            }
            else if(hp2 <= 0){
                switch (hero2){
                    case 1 ->{
                        tank2.checkStats(b);
                        tank2.setAlive();
                        System.out.println("Player 2 Down, The Winner is Player 1");
                    }
                    case 2 ->{
                        assassin2.checkStats(b);
                        assassin2.setAlive();
                        System.out.println("Player 2 Down, The Winner is Player 1");
                    }
                    case 3 ->{
                        mage2.checkStats(b);
                        mage2.setAlive();
                        System.out.println("Player 2 Down, The Winner is Player 1");
                    }
                }
            }
            round++;
            Scanner scanner = new Scanner(System.in);
            scanner.nextLine();
        }
    }

    public static void main(String[] args) {
        Menu();
        Intro();
        Battle();
    }
}

