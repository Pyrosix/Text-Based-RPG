package fantasy;


import Overworld.Overworld;
import Underworld.Underworld;
import java.util.Scanner;


public class fantasy {
    public static String y;
    public static void main(String[] args){
      String Underworld = "down";
      String Overworld = "up";
      Scanner x = new Scanner(System.in);
      System.out.println("You are a lost soul....");
      System.out.println("With no memory of your past....");
      System.out.println("All you remember is your name....");
      System.out.println("What bis your name?....");
      System.out.print("Enter your name :: ");
      y = x.nextLine();
      System.out.println("~~~~~~~~");
      System.out.println(y+"..... ah yes that's what it was....");
      System.out.println("You find yourself at a set of black and white stairs....");
      System.out.println("You can only choose one way or the other....");
      System.out.println("Which way would you like to go?");
      System.out.println("DOWN the black stairs, filled with dispair, which lead to the Underworld?");
      System.out.println("Or UP the white stairs, radiating hope, that lead to the Overworld?");
      System.out.print("Enter choice :: ");
      String w = x.nextLine();
      System.out.println("~~~~~~~~");
      System.out.println();
      System.out.println();
      System.out.println();
      if(w.equals(Underworld)){
          Underworld u = new Underworld();
          u.Underworld();
      }
      else if(w.equals(Overworld)){
          Overworld o = new Overworld();
          o.Overworld();
      }
      else{
          System.out.println("You were too confused to choose either way and missed your chance to go either way");
          System.out.println("You watch in horror as both sets of stairs disappear, leaving you in complete nothingness with nowhere to go....");
          System.out.println("GAME OVER");
      }
      
      
      
    }
    
    
}
