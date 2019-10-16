package Lingkaran;
/**
 * Nama      : Rama Al Halik
 * Kelas     : IF-1
 * NIM       : 10118007
 * Deskripsi : Menghitung Lingkaran
 * @author Rama
 */
public class Main {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Lingkaran bulat = new Lingkaran();
       
        System.out.println("======Perhitungan Lingkaran======");
        bulat.validasi();
        bulat.tampil(bulat.diameter);
	}

}