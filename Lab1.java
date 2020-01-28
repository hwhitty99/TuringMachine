import java.util.Scanner;
import java.io.*;
/*
Excectes main turing machine
*/
public class Lab1 {
   
   public static void main(String[] args) throws IOException{
      Scanner scnr;
      System.out.print("Enter file name: ");
      scnr = new Scanner(System.in);
      String fileName = scnr.nextLine();

      TurMac turMac;
      turMac = new TurMac(new String[] {fileName});
      System.out.println(turMac.run());
   }
}