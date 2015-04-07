<<<<<<< HEAD
public class Mapel implements ViewtoString {

    private String namaMapel;
    private int tugas, uts, uas, kuis;

    /**
     * Setter keempat nilai
     *
     * @param tugas
     * @param uts
     * @param uas
     * @param kuis
     */
    public void setNilai(int tugas, int uts, int uas, int kuis) {
        this.tugas = tugas;
        this.uts = uts;
        this.uas = uas;
        this.kuis = kuis;
    }

    /**
     * Get nama Mapel
     *
     * @return Nilai Tugas
     */
    public int getTugas() {
        return tugas;
    }

    /**
     * Get uts
     *
     * @return Nilai UTS
     */
    public int getUts() {
        return uts;
    }

    /**
     * Get UAS
     *
     * @return Nilai UAS
     */
    public int getUas() {
        return uas;
    }

    /**
     * Get Kuis
     *
     * @return Nilai Kuis
     */
    public int getKuis() {
        return kuis;
    }

=======
public class Mapel implements ViewString {
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

    /**
     * Get nama Mapel
     *
     * @return namaMapel
     */
    public String getNamaMapel() {
        return namaMapel;
    }
<<<<<<< HEAD
        /**
         * toString pada class Mapel
         *
         * @return Nama Mapel
         */
    @Override
=======
    
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

    /**
     * toString pada class Mapel
     * @return Nama Mapel
     */
>>>>>>> master
    public String toString() {
        return getNamaMapel();
    }

}
