package praktikum;

import java.util.Scanner;

public class latihan1 {
	public static void main(String[] args) {
	System.out.println("Program Menghitung Volume Balok");
	
	balok balok = new balok();
	Scanner scanner = new Scanner(System.in);
	
	System.out.print("Masukan panjang balok: ");
	balok.panjang = scanner.nextDouble();
	
	System.out.print("Masukan lebar balok: ");
	balok.lebar = scanner.nextDouble();
	
	System.out.print("Masukan tinggi balok: ");
	balok.tinggi = scanner.nextDouble();
			
	System.out.print("Volume dari balok: " + balok.getVolume());
	}
}
