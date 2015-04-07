
public class Kelas implements ViewString{

    private int nSiswa;//jumlah siswa dalam kelas
    private String namaKelas;
    private Siswa[] siswa = new Siswa[10];
    private String view;

    public Kelas() {
    }

    public Kelas(String namaKelas) {
        this.namaKelas = namaKelas;
        nSiswa = 0;
    }

    public String getNamaKelas() {
        return namaKelas;
    }

    public void setNamaKelas(String namaKelas) {
        this.namaKelas = namaKelas;
    }

    //Tambah Siswa
    public void addSiswa(Siswa siswa) {
        this.siswa[nSiswa] = siswa;
        this.nSiswa++;
    }

    public int getJumlahSiswa() {
        return nSiswa;
    }

    public String viewSiswa(){
        view = "";
        for (int i =0; i<nSiswa; i++){
            view = view + this.siswa[i]+"\n";
        }
        return view;
    }
    //Menampilkan nama Kelas
    @Override
    public String toString() {
        return "Kelas : "+getNamaKelas()+"\n"+viewSiswa();
    }
}
