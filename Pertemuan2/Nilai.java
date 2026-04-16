import java.util.Scanner;
public class Nilai {
    String nama,nim,NHuruf,Predikat;
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
    String getNHuruf(float nilai){
        if(nilai>=85)
            return "A";
        else if(nilai>=70)
            return "B";
        else if(nilai>=65)
            return "BC";
        else if(nilai>=60)
            return "C";
        else if(nilai>=40)
            return "D";
        else
            NHuruf="E";
            return NHuruf;
    }
    String getPredikat(String huruf){
        switch(huruf){
            case "A": Predikat= "Apik";break;
            case "AB": Predikat= "Apik Baik";break;
            case "B": Predikat= "Baik";break;
            case "BC": Predikat= "Cukup Baik";break;
            case "C": Predikat= "Cukup";break;
            case "D": Predikat= "Kurang";break;
            default:Predikat="Elek";
        }
        return NHuruf;
    }
    void cetakNilai(){
        System.out.println("Nama : "+nama);
        System.out.println("NIM : "+nim);
        System.out.println("Nilai UTS : "+nilaiUts+" 20% : "+pNilaiUts);
        System.out.println("Nilai Tugas : "+nilaiTugas+" 35% : "+pNilaiTugas);
        System.out.println("Nilai UAS : "+nilaiUas+" 45% : "+pNilaiUas);
        System.out.println("Nilai Akhir : "+nilaiAkhir);
        System.out.println("Nilai Huruf : "+getNHuruf(nilaiAkhir));
        System.out.println("Predikat : "+getPredikat(getNHuruf(nilaiAkhir)));
    }
    void judul(){
        System.out.println("DAFTAR NILAI PBO");
        System.out.println("=================");
        System.out.println("nim\tNama\tNilai UTS\tNilai Tugas\tNilai UAS\tNilai Akhir\tNHuruf\tPredikat");
    }
    void daftarNilai(){
        System.out.println(nim+"\t"+nama+"\t"+nilaiUts+"\t"+nilaiTugas+"\t"+nilaiUas+"\t"+nilaiAkhir+"\t"+NHuruf+"\t"+Predikat);
    }
}
