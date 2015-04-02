public class Mapel {
    private String namaMapel;
    private Guru g; //Buat nanti ngambil nilai
    
    /**
     * Set nama Mapel
     * @param namaMapel 
     */
    public void setNamaMapel(String namaMapel) {
        this.namaMapel = namaMapel;
    }
    
    /**
     * Get nama Mapel
     * @return namaMapel
     */
    public String getNamaMapel() {
        return namaMapel;
    }
    
    /**
     * toString pada class Mapel
     * @return Nama Mapel
     */
    public String toString() {
        return "\nMapel : " + getNamaMapel();
    }

}
