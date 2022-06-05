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
        coba.setUsername("user5");
        coba.setPassword("user5");
        coba.setNamaLengkap("Saya User 5");
        coba.setLevel("user");
        coba.create();
    }
}
