import java.util.Scanner;
/*
Controls tape values and position
*/
public class Tape {
   private int[] tapeArray;
   private int pos;
   private int n,holder;
   private String myTape;
   private final int MAXARRAY = 32767;
   
   
   public Tape(String tape){
      pos = 16000;
      tapeArray = new int[MAXARRAY];
      for(int i = 0;i<MAXARRAY;i++) {
         tapeArray[i] = -1;
      }
      holder = pos;
      for(n = 0;n<tape.length();n++) {
         try {
            char curChar = tape.charAt(n);
            tapeArray[holder] = Integer.parseInt(Character.toString(curChar));
            holder++;
         } catch (NumberFormatException e) {
            System.out.println("Cannot have negative integer in tape.");
         }
            
      }
      //pad ends with  lots of -1's
      //set starting point
   }
   public void setVal(int val) {
      tapeArray[pos] = val;
   }
   public int getVal() {
      return tapeArray[pos];
   }
   public void setPos(int nudge) {
      pos = pos + nudge;
   }
   public String toString() {
      String tapeString = "";
      for(int c = 0;c<MAXARRAY;c++) {
         if(tapeArray[c]>-1&&tapeArray[c]<=2) {
            tapeString = tapeString + Integer.toString(tapeArray[c]);
         }
      }
      //returns two -1's on the ends of the string
      //unless current pos is further into the -1's
      return tapeString;
   }
   //Testing Tape Class
/*   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("enter tape");
      String myTape = sc.nextLine();
      Tape tape = new Tape(myTape);
      System.out.println(tape.toString());
      tape.setVal(1);
      tape.setPos(1);
      tape.setVal(0);
      tape.setPos(-1);
      tape.setVal(2);
      System.out.println(tape.toString());
   }
*/
}