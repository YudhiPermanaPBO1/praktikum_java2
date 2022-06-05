package frame;

import id.ac.uniska.Pengguna;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PenggunaCreateForm extends JFrame{
    private JPasswordField tfPassword;
    private JTextField tfNamaL;
    private JTextField tfLevel;
    private JTextField tfUsername;
    private JButton simpanButton;
    private JButton batalButton;
    public JPanel panelMain;

    public PenggunaCreateForm() {
        simpanButton.addActionListener(e -> {
            Pengguna p = new Pengguna();
            p.setUsername(tfUsername.getText());
            p.setPassword(tfPassword.getPassword().toString());
            p.setNamaLengkap(tfNamaL.getText());
            p.setLevel(tfLevel.getText());
            p.create();

            tfUsername.setText("");
            tfPassword.setText("");
            tfNamaL.setText("");
            tfLevel.setText("");

            JOptionPane.showMessageDialog(null,"Simpan Data Berhasil");
        });
        batalButton.addActionListener(e -> {
            System.exit(0);
        });
    }
}
