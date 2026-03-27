import java.util.Scanner;
public class Nilai {
    String nama,nim;
    float nilaiUts, nilaiUas, nilaiTugas, pNilaiUts, pNilaiTugas, pNilaiUas, nilaiAkhir;
    Scanner in=new Scanner(System.in);
    public Nilai(){}
    public Nilai(String nama, String nim, float nilaiUts, float nilaiTugas, float nilaiUas){
        this.nama=nama;this.nim=nim;this.nilaiUts=nilaiUts;this.nilaiTugas=nilaiTugas;this.nilaiUas=nilaiUas;
    }
    public void isiData() {
        System.out.print("Nim : ");nim=in.nextLine();
        System.out.print("Nama : ");nama=in.nextLine();
        System.out.print("N.Tugas : ");nilaiTugas=in.nextFloat();
        System.out.print("N.Uts : ");nilaiUts=in.nextFloat();
        System.out.print("N.Uas : ");nilaiUas=in.nextFloat();

    }
    void setNim(String nim){this.nim=nim;}
    String getNim(){return nim;}
    void setUts(float nilaiUts){this.nilaiUts=nilaiUts;}
    float getUts(){return nilaiUts;}
    void hitungNilai(){
        pNilaiUts=0.2f*nilaiUts;
        pNilaiTugas=0.35f*nilaiTugas;
        pNilaiUas=0.45f*nilaiUas;
        nilaiAkhir=pNilaiUts+pNilaiTugas+pNilaiUas;
    }
    void cetakNilai(){
        System.out.println("Nama : "+nama);
        System.out.println("NIM : "+nim);
        System.out.println("Nilai UTS : "+nilaiUts+" 20% : "+pNilaiUts);
        System.out.println("Nilai Tugas : "+nilaiTugas+" 35% : "+pNilaiTugas);
        System.out.println("Nilai UAS : "+nilaiUas+" 45% : "+pNilaiUas);
        System.out.println("Nilai Akhir : "+nilaiAkhir);
    }
}
