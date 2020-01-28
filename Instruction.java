import java.util.Scanner;
/*
Instruction object containing states, values, and directions
*/
public class Instruction {
   private Scanner scnr;
   private Tape tape;
   private int curState, curVal, newState, newVal, dir;
   
   public Instruction(String instructions) {
      scnr = new Scanner(instructions);
      curState = scnr.nextInt();
      curVal = scnr.nextInt();
      newState = scnr.nextInt();
      newVal = scnr.nextInt();
      dir = scnr.nextInt();
   }
   public boolean equals(int state,int val) {
      if(state==(curState)&&val==(curVal))
         return true;
      else
         return false;
   }
   public int getState() {
      return curState;
   }
   public int getVal() {
      return curVal;
   }
   public int getNewState() {
      return newState;
   }
   public int getNewVal() {
      return newVal;
   }
   public int getDir() {
      return dir;
   }
   public String toString() {
      return(""+getState()+getVal()+newState+newVal+dir);
   }
}