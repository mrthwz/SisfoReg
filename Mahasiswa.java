/* 	Nama 	: Fadma Sari Yuenam E.G.
	Kelas 	: IF - 38 - 02
	NIM	:1301144352
*/

public class Mahasiswa extends Orang{
    private Kelas[] pil = new Kelas[100];
    private  int numofPil=0;
    
    
    public void addKelas(Kelas k){
        //Kasih kondisi kalo kelasnya penuh/lebih dari 100
        pil[numofPil]=k;
        numofPil++;
    }
    public void removeKelas(int index){
        pil[index] = null;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNoInduk() {
        return noInduk;
    }

    public void setNoInduk(String noInduk) {
        this.noInduk = noInduk;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    
}

