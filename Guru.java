
public class Guru extends Wargasekolah implements Nilai {

    private String nip;
    private Mapel[] m = new Mapel[5];//array mapel yang dinilai oleh guru
    private Siswa[] s = new Siswa[3];//array siswa yang dianajar oleh guru
    private int uas, uts, kuis, tugas;

    public Guru(String nama) {
        super(nama);
    }

    public Guru(String nama, String nip) {
        super(nama);
        this.nip = nip;
    }

    public String getNip() {
        return "\nNIP : " + nip;
    }

    public void inputNilai(int n, Mapel m) {
        System.out.println("");

        System.out.println("Masukkan nama mapel : ");
        System.out.println("masukkkan nilai uts : ");

    }

    public int getNilai() {
        return (uas + uts + kuis + tugas) / 3;
    }

    public void setNilai(int tugas, int uas, int uts, int kuis) {
        this.uas = uas;
        this.uts = uts;
        this.kuis = kuis;
        this.tugas = tugas;
    }

    public String toString() {
        return super.toString() + getNip();
    }
}
