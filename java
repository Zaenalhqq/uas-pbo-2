// ... (kelas-kelas Customer, Account, Transaction)

class Bank {
    // ... (koneksi database, metode CRUD)

    public void transfer(int fromAccountId, int toAccountId, double amount) throws SQLException {
        // ... (logika transfer, cek saldo, update tabel transaksi)
    }

    public List<Transaction> getTransactions(int accountId) throws SQLException {
        // ... (ambil data transaksi dari database)
    }

    // ... (metode untuk pembayaran tagihan, investasi, dll)
}

class BankApp {
    public static void main(String[] args) {
        // ... (buat objek Bank, tampilkan menu, tangani input pengguna)
    }

import javax.swing.*;

public class BankZeynCorporation {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Bank Zeyn Corporation");
        // ... (komponen UI: label, tombol, text field, dll)
        frame.setVisible(true);
    }
}

