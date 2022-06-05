import frame.PenggunaCreateForm;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
//        PenggunaCreateFrame f = new PenggunaCreateFrame();
//        f.meletakkanKomponen();
//        f.menambahkanListener();
//        f.setVisible(true);

        PenggunaCreateForm f = new PenggunaCreateForm();
        f.setContentPane(f.panelMain);
        f.setTitle("Input Data Pengguna");
        f.pack();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
