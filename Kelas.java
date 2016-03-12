
 public class Kelas{
    private Matakuliah mk;
    private Dosen d;
	public String namaKelas;
	public String kodeKelas;
	
	public Kelas(String kodeKelas, String namaKelas){
		this.namaKelas=namaKelas;
		this.kodeKelas=kodeKelas;
	}
	
	
	public void setKodeKelas(String kodeKelas){
		this.kodeKelas=kodeKelas;
	}
	
	public void setNamaKelas(String namaKelas){
		this.namaKelas=namaKelas;
	}
	
	public String getNamaKelas(){
		return ("Nama Kelas		: "+this.namaKelas);
	}
	
	    public String getKodeKelas() {
		return ("Kode Kelas		: "+this.kodeKelas);
    }
	
	
    public Matakuliah getMk() {
        return mk;
    }

    public void setMk(Matakuliah mk) {
        this.mk = mk;
    }

    public Dosen getD() {
        return d;
    }

    public void setD(Dosen d) {
        this.d = d;
    }
    
    
    
    
    
    
}
