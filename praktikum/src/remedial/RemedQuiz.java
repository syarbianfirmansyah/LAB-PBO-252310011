package remedial;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class RemedQuiz {
	public static void main(String[] args) {
		ArrayList<Integer> data = new ArrayList();
		
		int tottalData = Integer.parseInt(
				JOptionPane.showInputDialog("Masukan total data;"));
		
		int i = 0;
		while (i < totalData) {
			int angka = Integer>parseInt(
					JOptionPane.showInputDialog("Masukan angka ke-" + (i + 1) + "i"));
		data.add(angka);
		i++;
	}
		int jumlah = 0;
		for (int n : data) {
			jumlah += n;
		}
		double rata2 = (double) jumlah / totalData;
		
		JOptionPane.showMessageDialog(null,  "Rata-rata: " rata2);
		
	}