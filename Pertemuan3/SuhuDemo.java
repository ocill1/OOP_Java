public class SuhuDemo {
    public static void main(String[] args) {
        Suhu suhuku=new Suhu();
        suhuku.cToF(25);suhuku.cToK(25);suhuku.cToRa(25);
        System.out.println("C to F : "+suhuku.cTF(25));
        System.out.println("C to K : "+suhuku.cTK(25));
        System.out.println("C to Ra : "+suhuku.cTRa(25));
        Suhu suhumu=new Suhu(20);
        suhumu.cToF(suhumu.c);suhumu.cToK(suhumu.c);suhumu.cToRa(suhumu.c);
        System.out.println("C to F : "+suhumu.cTF(suhumu.c));
        System.out.println("C to K : "+suhumu.cTK(suhumu.c));
        System.out.println("C to Ra : "+suhumu.cTRa(suhumu.c));
        Suhu suhunya=new Suhu();
        suhunya.inputC();
        suhunya.cToF(suhunya.c);suhunya.cToK(suhunya.c);suhunya.cToRa(suhunya.c);
    }
}
