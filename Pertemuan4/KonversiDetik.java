import java.util.Scanner;
public class KonversiDetik {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String jawab;
    do { 
      System.out.print("Masukkan jumlah detik: ");
      int totalDetik = input.nextInt();
      int detikAsli = totalDetik;
      int hari = totalDetik / 86400;
      totalDetik %= 86400;
      int jam = totalDetik / 3600;
      totalDetik %= 3600;
      int menit = totalDetik / 60;
      int detik = totalDetik % 60;
      System.out.println("\nHasil konversi:");  
      System.out.println("Detik : " + detikAsli);
      System.out.println("Hari : " + hari);
      System.out.println("Jam : " + jam);
      System.out.println("Menit : " + menit);
      System.out.println("Detik : " + detik);
      System.out.println("\nInput data lagi?[Y/T]");
      jawab = input.next();
    } while (jawab.equalsIgnoreCase("Y"));
    System.out.println("Terima kasih");
  }
}
