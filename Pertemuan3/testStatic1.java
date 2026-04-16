public class testStatic1 { 
        public static void main(String[] args) { 
            testStatic obj = new testStatic(); 
            // Memanggil method  
            obj.satu(); // non static 
            testStatic.dua(); // static 
            //cetak atribut 
            System.err.println("\nAkses dari class lain: "); 
            System.out.println("a :"+obj.a); 
            System.out.println("b :"+testStatic.b); 
            System.out.println("c :"+obj.c); 
            System.out.println("d :"+obj.d);
            //System.out.println("e :"+obj.e); -->error karena e private 
        } 
    } 