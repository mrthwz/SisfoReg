/*
Nama : Adrian G Nurcahyo
Kelompok : 1
Kelas : IF-38-02
 */

public class Matakuliah 
{
    private String nama;
    private String kodeMK;

    public Matakuliah(String nama, String kodeMK) 
	{
        this.nama = nama;
        this.kodeMK = kodeMK;
    }

    public String getNama() 
	{
		return ("Nama Mata Kuliah	: "+this.nama);
    }

    public String getKodeMK() 
	{
		return ("Kode Mata Kuliah	: "+this.kodeMK);
    }
}

