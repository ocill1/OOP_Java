import java.util.Scanner;

public class DeterminanDemo {
  public static void main(String[] agrs) {
    Scanner input=new Scanner(System.in);
    String jawab;
    Determinan abc=new Determinan(1f,2f,3f);
    abc.cetakDeterminan();
    do { 
       Determinan d=new Determinan();
       d.inputABC();
       d.cetakDeterminan();
       System.out.print("\nInput data lagi (y/n)? ");
        jawab=input.nextLine();
    } while (jawab.equalsIgnoreCase("Y"));
  }
}
