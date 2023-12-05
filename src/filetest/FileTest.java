
package filetest;
import java.io.*;
import java.util.Scanner;
public class FileTest {
    static void copyfile(){
        Scanner filein;
        PrintWriter write;
        try{
      filein=new Scanner(new File("lal.txt"));
      write=new PrintWriter(new FileOutputStream("copy.txt"));
      String line;
      while(filein.hasNextLine()){
      line=filein.nextLine();
      write.println(line);
      }
         filein.close(); 
         write.close();
      } 
 catch (IOException e) {
    System.out.println("Error copying files");
  }
    
    }
    public static void main(String[] args){
    copyfile();
}}
