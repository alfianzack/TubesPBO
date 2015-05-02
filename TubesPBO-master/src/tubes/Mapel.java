/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubes;

/**
 *
 * @author Kelompok 6
 */
public class Mapel implements ViewtoString {

    private String namaMapel;
    private int tugas, uts, uas, kuis;
/**
 * 
 * @param namaMapel 
 */
    public Mapel(String namaMapel) {
        this.namaMapel = namaMapel;
    }
/**
 * 
 * @return 
 */
    public String getNamaMapel() {
        return namaMapel;
    }
/**
 * 
 * @param tugas 
 */
    public void setTugas(int tugas) {
        this.tugas = tugas;
    }
/**
 * 
 * @param uts 
 */
    public void setUts(int uts) {
        this.uts = uts;
    }
/**
 * 
 * @param kuis 
 */
    public void setKuis(int kuis) {
        this.kuis = kuis;
    }
/**
 * 
 * @param uas 
 */
    public void setUas(int uas) {
        this.uas = uas;
    }
/**
 * 
 * @return 
 */
    public int getTugas() {
        return tugas;
    }
/**
 * 
 * @return 
 */
    public int getUts() {
        return uts;
    }
/**
 * 
 * @return 
 */
    public int getKuis() {
        return kuis;
    }
/**
 * 
 * @return 
 */
    public int getUas() {
        return uas;
    }
/**
 * 
 * @param uts
 * @param uas
 * @param kuis
 * @param tugas 
 */
    public void setNilai(int uts, int uas, int kuis, int tugas) {
        setUts(uts);
        setUas(uas);
        setKuis(kuis);
        setTugas(tugas);
    }
/**
 * 
 * @return 
 */
    public double getNilai(){
        double nilaiTotal = (tugas*0.1)+(kuis*0.2)+(uts*0.35)+(uas*0.35);
        return nilaiTotal;
    }
/**
 * 
 * @return 
 */
    @Override
    public String toString() {
        return "Nama Mapel = " + namaMapel + "\nNilai : "+getNilai();
    }
    
    
}
