public class Siswa extends Wargasekolah{
	private String nis;
	private Mapel[] m = new Mapel[5];//mapel yang diambil oleh siswa
	private int nMapel=0;

	public Siswa(String nama, String nis){
		super(nama);
		this.nis= nis;
	}
	public String getNis(){
		return "\nNis : "+nis;
	}
	public void ambilMapel(Mapel m){
		if (nMapel >= 6 ){
			throw new ArrayIndexOutOfBoundsException("jumlah mepel melebihi");
		}else {
			this.m[nMapel] = m;
			this.nMapel++;	
		}
		
	}
	public String toString(){
		return super.toString()+getNis();
	}
}