
public class Main{
	public static void main(String[] args){
		
		
		
/*DOSEN*/		
		Orang d1=new Dosen();
		d1.setNama("Prof.Dania.MSc");
		d1.setNoInduk("DA");
		/* d1.setKodeDosen("DA"); */
		d1.setEmail("daniamrth.telkom@gmail.com");
		d1.setAlamat("Sukabirus");

		Orang d2=new Dosen();
		d2.setNama("Dra.Emma S.Eng");
		d2.setNoInduk("4352");
		/* d2.setKodeDosen("EM"); */
		d2.setEmail("emma.telkom@gmail.com");
		d2.setAlamat("Sukapura");		
		
		Orang d3=new Dosen();
		d3.setNama("Ir.H.Adrian.MT");
		d3.setNoInduk("1234");
		/* d3.setKodeDosen("AD"); */
		d3.setEmail("adrian.telkom@gmail.com");
		d3.setAlamat("PGA");				
		
		System.out.println("===PROFIL DOSEN===");
		System.out.println(d1.getNama());
		System.out.println(d1.getNoInduk());		
		/* System.out.println(d1.getKodeDosen()); */
		System.out.println(d1.getEmail());
		System.out.println(d1.getAlamat());		
		System.out.println("\n");
		System.out.println(d2.getNama());
		System.out.println(d2.getNoInduk());		
		/* System.out.println(d2.getKodeDosen()); */
		System.out.println(d2.getEmail());
		System.out.println(d2.getAlamat());		
		System.out.println("\n");
		System.out.println(d3.getNama());
		System.out.println(d3.getNoInduk());		
		/* System.out.println(d2.getKodeDosen()); */
		System.out.println(d3.getEmail());
		System.out.println(d3.getAlamat());		
		System.out.println("\n");
		System.out.println("\n");		
	
	
	
/*MATAKULIAH*/	
		Matakuliah m1=new Matakuliah("Computer Organization Architecture ","C");
		Matakuliah m2=new Matakuliah("Rekayasa Perangkat Linear","RPL");
		Matakuliah m3=new Matakuliah("Bahasa Inggris","ING");
		Matakuliah m4=new Matakuliah("Probabilitas Statistika","PRB");
		Matakuliah m5=new Matakuliah("Studium Generale","SGR");
		Matakuliah m6=new Matakuliah("Pemrograman Berorientasi Objek","PBO");

		
		System.out.println("===DAFTAR MATA KULIAH===");
		System.out.println(m1.getNama());
		System.out.println(m1.getKodeMK());
		System.out.println("\n");	
		System.out.println(m2.getNama());
		System.out.println(m2.getKodeMK());
		System.out.println("\n");	
		System.out.println(m3.getNama());
		System.out.println(m3.getKodeMK());
		System.out.println("\n");	
		System.out.println(m4.getNama());
		System.out.println(m4.getKodeMK());
		System.out.println("\n");	
		System.out.println(m5.getNama());
		System.out.println(m5.getKodeMK());
		System.out.println("\n");	
		System.out.println(m6.getNama());
		System.out.println(m6.getKodeMK());
	
		
/*KELAS*/

		Kelas k1=new Kelas("01","IF 38 01");
		Kelas k2=new Kelas("02","IF 38 02");
		Kelas k3=new Kelas("03","IF 38 03");


		
		System.out.println("\n");
		System.out.println("\n");
		System.out.println("===DAFTAR KELAS===");
		System.out.println(k1.getKodeKelas());
		System.out.println(k1.getNamaKelas());
		System.out.println("\n");		
		System.out.println(k2.getKodeKelas());
		System.out.println(k2.getNamaKelas());	
		System.out.println("\n");		
		System.out.println(k3.getKodeKelas());
		System.out.println(k3.getNamaKelas());				
		System.out.println("\n");
		System.out.println("\n");
		
			
/*MAHASISWA*/

		Mahasiswa ma1=new Mahasiswa("Fadma Sari","1301144352","emmafadma@gmail.com","Rumah Strawberry");
		Mahasiswa ma2=new Mahasiswa("Dania Mrth","1301144322","daniamrth@gmail.com","Kos Rafflesia");
		Mahasiswa ma3=new Mahasiswa("Adrian Gusti","1301140092","adrian@gmail.com","PBR");
		
		System.out.println("===DAFTAR MAHASISWA===");
		System.out.println(ma1.getNama());
		System.out.println(ma1.getNoInduk());
		System.out.println(ma1.getEmail());
		System.out.println(ma1.getAlamat());

       
		
		
		
		
		
		
		System.out.println("\n");		
		System.out.println(ma2.getNama());
		System.out.println(ma2.getNoInduk());
		System.out.println(ma2.getEmail());
		System.out.println(ma2.getAlamat());
		
		
		
		
		
		
		System.out.println("\n");
		System.out.println(ma3.getNama());
		System.out.println(ma3.getNoInduk());
		System.out.println(ma3.getEmail());
		System.out.println(ma3.getAlamat());		
		
		
		}	
}
