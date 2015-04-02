public class Kelas{
    private int nSiswa;//jumlah siswa dalam kelas
    private String namaKelas;
    private Siswa[] siswa = new Siswa[10];

    public Kelas(String namaKelas){
	this.namaKelas= namaKelas;
	nSiswa= 0;        
    }

    public String getNamaKelas() {
        return namaKelas;
    }

    public void setNamaKelas(String namaKelas) {
        this.namaKelas = namaKelas;
    }
    
    //Tambah Siswa
    public void addSiswa(Siswa siswa){
        this.siswa[nSiswa] = siswa;
        this.nSiswa++;
    }
    
    @Override
    public String toString(){
	return "Nama Kelas : "+getNamaKelas();
    }
}
