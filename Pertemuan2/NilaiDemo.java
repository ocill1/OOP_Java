public class NilaiDemo {
    public static void main(String[] args) {
        Nilai nilaiku = new Nilai();
        Nilai nilaimu = new Nilai("Bobi", "A11.2024.00001", 87, 95, 83);
        nilaiku.nim = "A11.2024.00002";
        nilaiku.nama = "Budi";
        nilaiku.nilaiUts = 80; nilaiku.nilaiTugas = 90; nilaiku.nilaiUas = 85;
        nilaiku.hitungNilai(); nilaiku.cetakNilai();
        nilaimu.hitungNilai(); nilaimu.cetakNilai();
        Nilai nilainya=new Nilai();
        nilainya.setNim("A11.2024.00003");
        nilainya.setUts(90);
        nilainya.hitungNilai();nilainya.cetakNilai();
        System.out.println(nilainya.getNim()+"N. UTS : "+nilainya.getUts());
        Nilai nilaiDia=new Nilai();
        nilaiDia.isiData();//input data
        nilaiDia.hitungNilai();
        nilaiDia.cetakNilai();
    }
}