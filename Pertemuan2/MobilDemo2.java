public class MobilDemo2 {
    public static void main(String[] args) {
        Mobil2 avanza=new Mobil2();
        Mobil2 xenia=new Mobil2();
        avanza.hidupkanMobil("Avanza Silver");
        avanza.ubahGigi("Avanza Silver");
        avanza.maju();avanza.mundur();avanza.belok();
        System.out.println("Roda avanza  :  "+avanza.roda);
        System.out.println("Roda xenia  :  "+xenia.roda);
        System.out.println("Mesin avanza  :  "+avanza.mesin);
        System.out.println("Mesin xenia  :  "+xenia.mesin);
        avanza.roda=5;avanza.mesin=9;
        System.out.println("Roda avanza  :  "+avanza.roda);
        System.out.println("Roda xenia  :  "+xenia.roda);
        System.out.println("Mesin avanza  :  "+avanza.mesin);
        System.out.println("Mesin xenia  :  "+xenia.mesin);
        xenia.mesin=10;
        System.out.println("Mesin avanza  :  "+avanza.mesin);
        System.out.println("Mesin xenia  :  "+xenia.mesin);
    }
}