package Praktikum4;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ArrayListApp {
	public static void main(String[] args) {
		ArrayList<String> nama = new ArrayList<String>();
		nama.add("Rafly"); // input data
		System.out.println(nama.get(0));
		
		// input dari user menggunakan jop
		JOptionPane jop = new JOptionPane();
		nama.add(jop.showInputDialog(null, "Input nama:"));
		jop.showMessageDialog(null, "Nama: " + nama.getLast());
		
		nama.remove(0); // menghapus
		System.out.println("Nama setelah dihapus: " + nama.get(0));
		
		// pertanyaan
//		System.out.println(nama.get(1));
		
		nama.add("Ade");
		nama.add("Louren");
		System.out.println("List nama: ");
		for (int i = 0; i < nama.size(); i++) {
			System.out.println(nama.get(1));
		}
		
	}
}
