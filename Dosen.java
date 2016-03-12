
/*
Nama : Adrian G Nurcahyo
Kelompok : 1
Kelas : IF-38-02
 */
 
public class Dosen extends Orang
{
	private String kodeDosen;
	
/*	public void setKodeDosen(String kodeDosen)
	{
		this.kodeDosen = kodeDosen;
	} */
	
	public void setNama(String nama)
	{
		this.nama = nama;
	}
	
/*	public String getKodeDosen()
	{
		return ("Kode Dosen			: "+this.kodeDosen);
	} */
	
	public void setEmail(String email)
	{
		this.email = email;
	}
	
	public void setNoInduk (String noInduk)
	{
		this.noInduk = noInduk;
	}
	
	public void setAlamat(String alamat) 
	{
		this.alamat = alamat;
	}
	
	public String getNama()
	{
		return ("Nama Dosen		: "+this.nama);
	}
	
	public String getEmail()
	{
		return ("Email Dosen		: "+this.email);
	}
	
	public String getNoInduk()
	{
		return ("NIP Dosen		: "+this.noInduk);
	}
	
	public String getAlamat()
	{
		return ("Alamat Dosen		: "+this.alamat);
	}
}
