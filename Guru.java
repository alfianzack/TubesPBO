
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

    public void addSiswa(Siswa s){
        daftarSiswa[nSiswa] = s;
        nSiswa++;
    }
    
    public void setKuis(String nos, String mapel,int nilai){
        int i=0;
        while (i!=nSiswa){
            if(daftarSiswa[i].getNis().equals(nos)){
                daftarSiswa[i].setKuis(mapel, nilai);
                System.out.println(daftarSiswa[i].toString());
            }
            i++;
        }
    }

    public String toString() {
        return super.toString() + getNip();
    }
}
