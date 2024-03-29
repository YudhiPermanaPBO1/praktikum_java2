package frame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PenggunaCreateFrame extends JFrame {

    JLabel labelUsername = new JLabel("Username");
    JTextField tfUsername = new JTextField();

    JButton bSimpan = new JButton("Simpan");


    public PenggunaCreateFrame(){
        setTitle("Input data pengguna");
        setSize(640,480);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void meletakkanKomponen(){
        getContentPane().setLayout(null);
        getContentPane().add(labelUsername);
        getContentPane().add(tfUsername);
        getContentPane().add(bSimpan);

        labelUsername.setBounds(10,20,80,20);
        tfUsername.setBounds(10,48,110,20);
        bSimpan.setBounds(100,80,110,24);
    }

    public void menambahkanListener(){
        bSimpan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"tes");
            }
        });
    }

}
