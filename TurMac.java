import java.util.Scanner;
import java.io.IOException;
/*
In charge of setting tape and instructions
*/
public class TurMac {
   private Scanner scnr;
   private Instructions instructions;
   private Instruction curInstr;
   private Tape tape;
   private int state;
   private String fileName;
   private String myTape;
   private IOInterface myIO;
   
   public TurMac(String[] args) throws IOException {
      myIO = new IOHandler(args);
      myTape = (String)myIO.nextLine();
      tape = new Tape(myTape);
      
      instructions = new Instructions();
      while(myIO.hasNext()) {
         instructions.addInstruction(myIO.nextLine());
      }
      state = 0;
   }
   public String run() {
            
      while(state>=0) {
         curInstr = instructions.find(state,tape.getVal());
         state = curInstr.getNewState();
         tape.setVal(curInstr.getNewVal());
         tape.setPos(curInstr.getDir());
      }
   return ("Tape: "+tape.toString()+"\nState: "+state);
   }
}