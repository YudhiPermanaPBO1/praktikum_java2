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
        coba.setId(7);
        coba.setUsername("user7");
        coba.setPassword("user7");
        coba.setNamaLengkap("Saya User 7");
        coba.setLevel("user");
//        coba.create();
        coba.update();
    }
}
