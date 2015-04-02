public class Mapel {
    private String namaMapel;
    private Guru g; //Buat nanti ngambil nilai
    
    public void setNilai(String namaMapel) {
        this.namaMapel = namaMapel;
    }

    public String getNamaMapel() {
        return namaMapel;
    }

    public void setNamaMapel(String namaMapel) {
        this.namaMapel = namaMapel;
    }

    public String toString() {
        return "Mapel : " + getNamaMapel() + " Nilai : " + g.getNilai();
    }

}
