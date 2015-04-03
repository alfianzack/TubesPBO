
public interface Nilai {

    /**
     * Set nilai integer pada nilai Tugas
     * @param tugas 
     */
    public void setTugas(int tugas);

    /**
     *Set nilai integer pada nilai UTS
     * @param uts
     */
    public void setUts(int uts);

    /**
     * Set nilai integer pada nilai Kuis
     * @param kuis
     */
    public void setKuis(int kuis);

    /**
     * Set nilai integer pada nilai UAS
     * @param uas
     */
    public void setUas(int uas);

    /**
     * Mengembalikan nilai Tugas
     * @return Tugas
     */
    public int getTugas();

    /**
     * Mengembalikan nilai UTS
     * @return nilai UTS
     */
    public int getUts();

    /**
     * Mengembalikan nilai Kuis
     * @return nilai Kuis
     */

    public int getKuis();

    /**
     * Mengembalikan nilai UAS
     * @return nilai UAS
     */

    public int getUas();
    public int getNilai();
   
}
