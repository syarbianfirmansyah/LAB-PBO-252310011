package Quiz;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ManajemenBuku {
    static ArrayList<String> daftarBuku = new ArrayList<>();

    public static void main(String[] args) {
        int pilihan;

        do {
            String input = JOptionPane.showInputDialog(null,
                    "1. Input Buku\n" +
                    "2. Hapus Buku\n" +
                    "3. Tampilkan Semua Buku\n" +
                    "4. Keluar\n\nPilih menu:",
                    "Manajemen Buku", JOptionPane.QUESTION_MESSAGE);

            if (input == null) {
                pilihan = 4; // Cancel dianggap keluar
            } else {
                try {
                    pilihan = Integer.parseInt(input.trim());
                } catch (NumberFormatException e) {
                    pilihan = -1; // ditangani di default
                }
            }

            switch (pilihan) {
                case 1:
                    tambahBuku();
                    break;
                case 2:
                    hapusBuku();
                    break;
                case 3:
                    tampilBuku();
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Keluar dari program.");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Pilih angka 1-4!");
            }
        } while (pilihan != 4);
    }

    static void tambahBuku() {
        String judul = JOptionPane.showInputDialog("Masukkan judul buku:");
        if (judul == null) return; // Cancel
        if (judul.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Judul tidak boleh kosong!");
            return;
        }
        daftarBuku.add(judul.trim());
        JOptionPane.showMessageDialog(null, "Buku berhasil disimpan!");
    }

    static void hapusBuku() {
        if (daftarBuku.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Data buku masih kosong!");
            return;
        }
        String input = JOptionPane.showInputDialog(
                "Masukkan index buku yang ingin dihapus (0-" + (daftarBuku.size() - 1) + "):");
        if (input == null) return; // Cancel

        try {
            int idx = Integer.parseInt(input.trim());
            if (idx < 0 || idx >= daftarBuku.size()) {
                JOptionPane.showMessageDialog(null, "Index di luar jangkauan!");
                return;
            }
            String dihapus = daftarBuku.remove(idx);
            JOptionPane.showMessageDialog(null, "Buku \"" + dihapus + "\" berhasil dihapus!");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Index harus berupa angka!");
        }
    }

    static void tampilBuku() {
        if (daftarBuku.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Data buku masih kosong!");
            return;
        }
        StringBuilder sb = new StringBuilder("Data Buku:\n");
        for (int i = 0; i < daftarBuku.size(); i++) {
            sb.append(i).append(". ").append(daftarBuku.get(i)).append("\n");
        }
        JOptionPane.showMessageDialog(null, sb.toString());
    }
}