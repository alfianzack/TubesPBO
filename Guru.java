
public class Guru extends Wargasekolah implements Nilai {

    private String nip;
    private Mapel[] m = new Mapel[5];//array mapel yang dinilai oleh guru
    private Siswa[] s = new Siswa[3];//array siswa yang dianajar oleh guru
    private int uas, uts, kuis, tugas, nilai;

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
    
    public int getKuis(String nos, String mapel,int kuis){
        int i=0;
        while (i!=nSiswa){
            if(daftarSiswa[i].getNis().equals(nos)){
                daftarSiswa[i].setKuis(mapel, kuis);
                System.out.println(daftarSiswa[i].toString());
            }
            i++;
        }
        return kuis;
    }
    public int getUts(String nos, String mapel,int uts){
        int i=0;
        while (i!=nSiswa){
            if(daftarSiswa[i].getNis().equals(nos)){
                daftarSiswa[i].getUts(mapel, uts);
                System.out.println(daftarSiswa[i].toString());
            }
            i++;
        }
        return uts;
    }
    public int getUas(String nos, String mapel,int uas){
        int i=0;
        while (i!=nSiswa){
            if(daftarSiswa[i].getNis().equals(nos)){
                daftarSiswa[i].getUts(mapel, uas);
                System.out.println(daftarSiswa[i].toString());
            }
            i++;
        }
        return uas;
    }
    public int getTugas(String nos, String mapel,int tugas){
        int i=0;
        while (i!=nSiswa){
            if(daftarSiswa[i].getNis().equals(nos)){
                daftarSiswa[i].getTugas(mapel, tugas);
                System.out.println(daftarSiswa[i].toString());
            }
            i++;
        }
        return tugas;
    }
    public int getNilaiAkhir(int nilai){
        nilai = uts + uas + tugas + kuis;
        return nilai;
    }

    public String toString() {
        return super.toString() + getNip();
    }
}
