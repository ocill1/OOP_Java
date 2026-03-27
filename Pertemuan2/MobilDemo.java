class Mobil{
  String warna;
  int tahunProduksi;
  public Mobil(String warna, int tahunProduksi){
        this.warna=warna;this.tahunProduksi=tahunProduksi;
    }
  public Mobil(){}
    void info(){
        System.out.println("Warna   : "+warna);
        System.out.println("Tahun   : "+tahunProduksi);
    }
}
public class MobilDemo{
  public static void main(String[] args) {
      Mobil mobilku=new Mobil();
      Mobil mobilmu=new Mobil();
      Mobil mobilkita=new Mobil("Biru", 2003);
      mobilku.warna="Silver Metalic";
      mobilku.tahunProduksi=2013;
      mobilmu.warna="Pink";
      mobilmu.tahunProduksi=2025;
      System.out.println("Warna : "+mobilku.warna);
      System.out.println("Tahun Produksi : "+mobilku.tahunProduksi);
      System.out.println("Warna : "+mobilmu.warna);
      System.out.println("Tahun Produksi : "+mobilmu.tahunProduksi);
      mobilkita.info();
  }
}