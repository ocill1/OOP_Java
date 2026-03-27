public class TesMobil {
    public static void main(String[] args) {
        Mobil1 avanza=new Mobil1();
        Mobil1 pajero=new Mobil1();
        avanza.maju();
        avanza.mundur();
        avanza.belok();
        System.out.println("Roda : "+avanza.roda);
        System.out.println("Mesin : "+avanza.mesin);
        pajero.belok();
        pajero.maju();
        System.out.println("Roda : "+pajero.roda);
        System.out.println("Mesin : "+pajero.mesin);
    }
}
