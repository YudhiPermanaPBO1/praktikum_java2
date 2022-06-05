package id.ac.uniska;

import helper.MyConnection;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
//        MyConnection m = new MyConnection();
//        m.getConnection();

        Pengguna pengguna = new Pengguna();
        ArrayList<Pengguna> listPengguna = pengguna.read();

        for (Pengguna value: listPengguna){
            System.out.println(value.getNamaLengkap());
        }
    //    Pengguna coba = new Pengguna(5,"user4","user4","Saya User 4","user");
        Pengguna coba = new Pengguna();
        coba.setId(6);
//        coba.setUsername("user7");
//        coba.setPassword("user7");
//        coba.setNamaLengkap("Saya User 7");
//        coba.setLevel("user");
//        coba.create();
//        coba.update();
        coba.delete();

        Pengguna mauLogin = new Pengguna();
        mauLogin.setUsername("user1");
        mauLogin.setPassword("user1");
        if (mauLogin.login()){
            System.out.println("Login Berhasil");
        } else {
            System.err.println("Login Gagal");
        }

        Pengguna gantiPassword = new Pengguna();
        gantiPassword.setUsername("user2");
        gantiPassword.setPassword("pwbaru");

        if (gantiPassword.updatePassword("user2")){
            System.out.println("Password berhasil diperbarui");
        } else {
            System.err.println("Gagal Memperbarui");
        }
    }
}
