public class Guru extends Wargasekolah{
	private String nip;
	private Mapel[] m = new Mapel[5];//array mapel yang dinilai oleh guru
	private Siswa[] s = new Siswa[3];//array siswa yang dianajar oleh guru

	public Guru(String nama, String nip){
		super(nama);
		this.nip= nip;
	}
	public String getNip(){
		return "\nNIP : "+nip;
	}
	public void inputNilai(int n,Mapel m){
		System.out.println("Masukkan nama mapel : ");
		System.out.println("masukkkan nilai ": ");
		
	}
	public String toString(){
		return super.toString()+getNip();
	}
}
