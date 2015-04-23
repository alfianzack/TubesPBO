/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubes;

/**
 *
 * @author alfianzack
 */
public class Mapel implements ViewtoString {

    private String namaMapel;
    private int tugas, uts, uas, kuis;

    public Mapel(String namaMapel) {
        this.namaMapel = namaMapel;
    }

    public String getNamaMapel() {
        return namaMapel;
    }

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

    public void setNilai(int uts, int uas, int kuis, int tugas) {
        setUts(uts);
        setUas(uas);
        setKuis(kuis);
        setTugas(tugas);
    }

    public double getNilai(){
        double nilaiTotal = (tugas*0.1)+(kuis*0.2)+(uts*0.35)+(uas*0.35);
        return nilaiTotal;
    }

    @Override
    public String toString() {
        return "Nama Mapel = " + namaMapel + "\nNilai : "+getNilai();
    }
    
    
}
