import java.util.Scanner;
public class Determinan {
  float a,b,c;double D,x1,x2;
  Scanner input=new Scanner(System.in);
  public Determinan(float a, float b, float c){
    this.a=a;this.b=b;this.c=c;
  }
  public Determinan(){}
  void inputABC(){
    System.out.print("a: ");a=input.nextFloat();System.out.print("b: ");b=input.nextFloat();
    System.out.print("c: ");c=input.nextFloat();
  }
  void hitung(){D=b*b-(4*a*c);}
  void hitungX1X2(){
    if(D>0){
      x1=(-b+Math.sqrt(D))/(2*a); x2=(-b-Math.sqrt(D))/(2*a);
    }else if(D==0){
      x1=x2=-b/(2*a);
    }else{
      //x1=(-b/(2*a))+(Math.sqrt(-D)/(2*a));
      //x2=(-b/(2*a))+(Math.sqrt(-D)/(2*a));
      double real = -b/(2*a);
      double imag = Math.sqrt(-D)/(2*a);
      System.out.println("x1 = " + real + " +" + imag + "i");
      System.out.println("x2 = " + real + " -" + imag + "i");
    }
  }
  void cetakDeterminan(){
    hitung();
    System.out.println("a :"+a);
    System.out.println("b :"+b);
    System.out.println("c :"+c);
    System.out.println("D :"+D);
    hitungX1X2();
    if(D>=0){
      System.out.println("x1 :"+x1);
      System.out.println("x2 :"+x2);
    }
}
}