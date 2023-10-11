public class Nilai {
  String nama;
  long NIM;
  int NAbsen, NTugas, NUts, NUas;

  void CetakNilai() {
    float NAkhir = 0.1f*NAbsen + 0.2f*NTugas + 0.3f*NUts + 0.4f*NUas;
    System.out.println("Data Nilai Mahasiswa");
    System.out.println("NIM : "+NIM);
    System.out.println("Nama : "+nama);
    System.out.println("Nilai Absen : "+NAbsen);
    System.out.println("Nilai Tugas : "+NTugas);
    System.out.println("Nilai UTS : "+NUts);
    System.out.println("Nilai UAS : "+NUas);

    System.out.println("Nilai Akhir : "+NAkhir);
  }
}