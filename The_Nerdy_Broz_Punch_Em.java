package ThenerdyBros;

import java.util.Random;
import java.util.Scanner;
import java.beans.Statement;
import java.util.InputMismatchException;

class Main {
  public static int damage;
  public static int defense;
  public static int health;

  private static final String name = null;
  public static Random generator = new Random();

  public class Character {

    public static int Speed1;
    public static int Speed;
    public static String name;
    public static String name1;
    public static int strength;
    public static int health;
    public static String Yes;

    public static int strength1;
    public static int defense1;
    public static int health1;
    public static int dodge;
    public static int dodge1;
    static boolean player1Turn = true;

    public static int choice;
    public static boolean choice0;
    public static boolean OneT;
    public static boolean Onet;
    public static boolean One;
    public static boolean One1;
    public static boolean One2;
    public static boolean One3;
    public static boolean player2Turn;

    public static void main(String[] args) {

      Scanner input = new Scanner(System.in);
      System.out.println("test Soon");
      name = input.nextLine();
      System.out.println("Nice it Wored !");
      System.out.println("Nivce Hello " + name);
      System.out.println("Now Tiem For player Two");
      name1 = input.nextLine();
      System.out.println("Nivce Hello" + name1);
      System.out.println("Very Cool Hello ton the both of you: " + name + " And " + name1);
      int Speed;
      int Speed1;
      int dodge;
      int dodge1;
      int strength1;
      int strength;// declares the strength value as a Int/Jay
      strength = generator.nextInt(250);// Sets theMaximum Random Num Gen to "250"/Jay
      strength1 = generator.nextInt(250);
      int health = 500;// These are the Default values for Health
      int health1 = 500;// These are the Default values for Health
      Speed = generator.nextInt(250);// all these values are for both player one and player two, these are random and
                                     // WILL Effect your battle
      Speed1 = generator.nextInt(250);// all these values are for both player one and player two, these are random and
                                      // WILL Effect your battle
      dodge = generator.nextInt(250);
      dodge1 = generator.nextInt(250);
      defense = generator.nextInt(250);
      defense1 = generator.nextInt(250);
      System.out.println("Lets Review the Player stats before the match Starts! Fist we will Go with:" + name
          + "Your Stats look Liek This !:");

      if (Speed < 200) {
        System.out.println("Oof Looks like: " + name + "'s Speed Stat Is Lacking Under 200 at is at:" + Speed);

      } else if (Speed > 200) {
        System.out.println("ooh Looks like: " + name + "'s Speed Stat Is Greatly above 200 and is At:" + Speed);
      }
      ;

      if (dodge < 200) {
        System.out.println("Oof Looks like: " + name + "'s Dodge Stat Is Lacking Under 200 at is at:" + dodge);

      } else if (dodge > 200) {
        System.out.println("ooh Looks like: " + name + "'s Dodge Stat Is Greatly above 200 and is At:" + dodge);
      }
      ;

      if (defense < 200) {
        System.out.println("Oof Looks like:" + name + "'s Defense Stat Is Lacking Under 200 at is at:" + defense);

      } else if (defense > 200) {
        System.out.println("ooh Looks like: " + name + "'s Defense Stat Is Greatly above 200 and is At:" + defense);
      }
      ;

      System.out.println("Nice! \n You see Your Stats But lucky  for me you cant Change them");
      System.out.println("So Without a further do, We will display" + name1 + "s, Stats:");
      // ignorate Coder is above it/Jay

      if (dodge1 < 200) {
        System.out.println("Oof Looks like: " + name1 + "s, Dodge Stat Is Lacking Under 200 at is at:" + dodge1);

      } else if (dodge1 > 200) {
        System.out.println("ooh Looks like: " + name1 + "s, Dodge Stat Is Greatly above 200 and is At:" + dodge1);
      }
      ;

      if (Speed1 > 200) {
        System.out.println("ooh Looks like: " + name1 + "s, Speed Stat Is Greatly above 200 and is At:" + Speed1);

      } else if (Speed1 < 200) {
        System.out.println("Oof Looks like: " + name1 + "s, Speed Stat Is Lacking Under 200 at is at:" + Speed1);
      }
      ;

      if (defense1 < 200) {
        System.out.println("Oof Looks like: " + name1 + "'s Defense Stat Is Lacking Under 200 at is at:" + defense1);

      } else if (defense1 > 200) {
        System.out.println("ooh Looks like:" + name1 + "'s Defense Stat Is Greatly above 200 and is At:" + defense1);
      }
      ;

      System.out.println("In Plain Text The Stats For:" + name + "s, Are as follows:" + Speed + ": Speed Stat" + dodge
          + ": Dodge Stat" + defense + ": Damage Stats" + health + ": The Health Stat Is Standerd For All Playerz"
          + strength + ": Strength Stats" + ": These are all the Current Stats For:" + name);
      // These Display the Stats listed above and without a updated Value/Jay
      System.out.println("Cool, Now here are your Stats:" + name1 + Speed1 + ": Speed Stat" + dodge1 + ": Dodge Stat"
          + defense1 + ": Damage Stats" + health1 + ": The Health Stat Is Standerd For All Playerz" + strength1
          + ": Strength Stats" + ": These are all the Current Stats For:" + name1);
      // Same Code Just for Player 2/Jay

      // UPDATE, Now It will run if it is less then or equal to Zero in case of that
      // senario/Jay
while(health>0 || health1>0){
       System.out.println("Player One:"+name+"s, Turn to choose a Move:");
       System.out.println("Would You Rather!:");
        switch(choice){
        case 1:
        System.out.println("Pick The [Attack] Move");
        System.out.println("Player:"+name+", Choose Your Next Move");
        break;
         case 2:
         System.out.println("Pick The [Defend] Move");
          System.out.println("Player:"+name+", Choose Your Next Move");
         break;
          case 3:
          System.out.println("Pick The [Run] Move"); 
           System.out.println("Player:"+name+", Choose Your Next Move");
           break;
        }while(choice==1){
          continue;
        String choicew;
          System.out.println("These Are the Attack Options:");
           System.out.println("Love To Beat Them Down"); 
            System.out.println("1--MegaBlast"); 
             System.out.println("2--Jays Special"); 
             System.out.println("3--What Do You Choose?:"); 
             choicew=input.nextline();
        }while(choicew==1){
            System.out.println("Player One:"+name+"s, Turn to choose a Move:");
            System.out.println("Would You Rather!:");
             switch(choice){
             case 1:
             System.out.println("Pick The [Attack] Move");
             System.out.println("Player:"+name+", Choose Your Next Move");
             break;
              case 2:
              System.out.println("Pick The [Defend] Move");
               System.out.println("Player:"+name+", Choose Your Next Move");
              break;
               case 3:
               System.out.println("Pick The [Run] Move"); 
                System.out.println("Player:"+name+", Choose Your Next Move");
                break;
           };
        }while(choice==2){
          String choice8;
          System.out.println("These Are the Defence Options:");
          System.out.println("Love To Beat Them Down"); 
           System.out.println("1--MegaBlast"); 
            System.out.println("1--Jays Special"); 
            System.out.println("1--What Do You Choose?:"); 
            choice8=input.nextline();
            while(choice8==1){
              continue;
              System.out.println("Player One:"+name1+"s, Turn to choose a Move:");
              System.out.println("Would You Rather!:");
               switch(choice){
               case 1:
               System.out.println("Pick The [Attack] Move");
               System.out.println("Player:"+name1+", Choose Your Next Move");
               break;
                case 2:
                System.out.println("Pick The [Defend] Move");
                 System.out.println("Player:"+name1+", Choose Your Next Move");
                break;
                 case 3:
                 System.out.println("Pick The [Run] Move"); 
                  System.out.println("Player:"+name1+", Choose Your Next Move");
                  break;
             };
        }while(choice==3){
          continue;
          String choice7;
          System.out.println("These Are the Run Options:");
           System.out.println("Love To Beat Them Down"); 
            System.out.println("1--MegaBlast"); 
             System.out.println("1--Jays Special"); 
             System.out.println("1--What Do You Choose?:"); 
             choice7=input.nextline();
             while(choice7==1){
              System.out.println("Player One:"+name1+"s, Turn to choose a Move:");
              System.out.println("Would You Rather!:");
               switch(choice){
               case 1:
               System.out.println("Pick The [Attack] Move");
               System.out.println("Player:"+name1+", Choose Your Next Move");
               break;
                case 2:
                System.out.println("Pick The [Defend] Move");
                 System.out.println("Player:"+name1+", Choose Your Next Move");
                break;
                 case 3:
                 System.out.println("Pick The [Run] Move"); 
                  System.out.println("Player:"+name1+", Choose Your Next Move");
                  break;
             };
        }

      }
      
        }
      }

}
    }
  }

//THE [NERDY BROZ POSSE CREDITS FOR: THE NERDY BROZ PUNCH EM' GAME]
// LEAD DESIGNERS AND OTHER THINGS WORTH MENTIONING;
// JAY, JAWUAN/ JACOB/HENRY/ KAYLEE
//LEAD FOR MAKING STORY MODE;
//HENRY/KAYLEE/
//WOOOOOOOOOOOOOO!!!!!