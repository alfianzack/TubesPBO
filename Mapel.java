public class Mapel implements ViewtoString {
    private String namaMapel;
    private int tugas,uts,uas,kuis;
    
>>>>>>> master
    /**
     * Set nama Mapel
     *
     * @param namaMapel
     */
    public void setNamaMapel(String namaMapel) {
        this.namaMapel = namaMapel;
    }

    //untuk memberikan nilai setiap mapel
       public void setTugas(int tugas) {
        this.tugas = tugas;
    }

    public void setUts(int uts) {
        this.uts = uts;
    }

    public void setKuis(int kuis) {
        this.kuis = kuis;
    }

    public void setUas(int uas) {
        this.uas = uas;
    }

    public int getTugas() {
        return tugas;
    }

    public int getUts() {
        return uts;
    }

    public int getKuis() {
        return kuis;
    }

    public int getUas() {
        return uas;
    }
    
    public double getNilai(){
        double nilaiTotal = (tugas*0.1)+(kuis*0.2)+(uts*0.35)+(uas*0.35);
        return nilaiTotal;
    }
    /**
     * toString pada class Mapel
     * @return Nama Mapel
     */
>>>>>>> master
    public String toString() {
        return getNamaMapel()+" : "+getNilai();
    }

}
