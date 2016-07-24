/* 	Nama 	: Fadma Sari Yuenam E.G.
	Kelas 	: IF - 38 - 02
	NIM		:1301144352
*/

public abstract class Orang {
    protected String nama;
    protected String email;
    protected String noInduk;
    protected String alamat;
	
	
	public void setNama(String nama){
		this.nama = nama;
	}
	
	public void setEmail(String email){
		this.email = email;
	}
	
	public void setNoInduk (String noInduk){
		this.noInduk = noInduk;
	}
	
	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}
	
	public String getNama(){
		return nama;
	}
	
	public String getEmail(){
		return email;
	}
	
	public String getNoInduk(){
		return noInduk;
	}
	
	public String getAlamat(){
		return alamat;
	}
}
