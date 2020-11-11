package con.toh.generics;

import java.util.ArrayList;
import java.util.List;

public class CustomGenerics {
	public static void main(String[] args) {
		List<Mahasiswa> lm = new ArrayList<>();
		
		Mahasiswa mahasiswa1 = new Mahasiswa("M0501001", "Penikmat Senja", "Solo");
		lm.add(mahasiswa1);
		
		Mahasiswa mahasiswa2 = new Mahasiswa("M0501002", "Pengadu Rindu", "Magelang");
		lm.add(mahasiswa2);
		
		Mahasiswa mahasiswa3 = new Mahasiswa("M0501003", "Pemuja Makna", "Jogjakarta");
		lm.add(mahasiswa3);
		
		for (int i = 0; i < lm.size(); i++) {
			System.out.println("NIM: "+lm.get(i).nim+", Nama: "+lm.get(i).nama+", Alamat: "+lm.get(i).alamat);
		}
	}
}
