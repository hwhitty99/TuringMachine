/*
Array of Instruction objectsj
*/
public class Instructions {
   private Instruction[] instrs;
   private int n;
   
   public Instructions() {
      instrs = new Instruction[100];
      n = 0;
   }
   public void addInstruction(String instr) {
      Instruction addInstr;
      addInstr = new Instruction(instr);
      instrs[n] = addInstr;
      n++;
   }
   public Instruction find(int state, int value) {
      for(int i = 0;n <= 99;i++) {
         if(instrs[i].equals(state,value)) {
            return instrs[i];            
         }
      }
   return new Instruction("-1");
   }
   public boolean endOf(int c) {
      if(instrs[c]==null)
        return true;
      else
        return false;
   }
}