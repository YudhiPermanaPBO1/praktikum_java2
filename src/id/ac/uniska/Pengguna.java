package id.ac.uniska;

import helper.MyConnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Pengguna {
    private int id;
    private String username;
    private String password;
    private String namaLengkap;
    private String level;

    private Connection connection;

    public Pengguna() {
    }

    public Pengguna(int id, String username, String password, String namaLengkap, String level) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.namaLengkap = namaLengkap;
        this.level = level;
    }

    //CRUD create read update delete
    public void create(){
        String createSQL = "INSERT INTO `pengguna` (`id`, `username`, `password`, `namalengkap`, `level`) " +
                "VALUES " +
                "(NULL, '"+this.username+"', MD5('"+this.password+"'), '"+this.namaLengkap+"', '"+this.level+"')";

        MyConnection m = new MyConnection();
        this.connection = m.getConnection();
        try {
        Statement statement = this.connection.createStatement();
        statement.execute(createSQL);
            System.out.println("Berhasil Membuat Data");
        } catch (SQLException e) {
            System.out.println("Data Yang dimasukkan ERROR!");
        }

    }
    public ArrayList<Pengguna> read(){
        MyConnection m = new MyConnection();
        this.connection = m.getConnection();

        ArrayList<Pengguna> listpengguna = new ArrayList<>();

        String readSQL = "SELECT * FROM pengguna";


        try {

            Statement statement = this.connection.createStatement();
            ResultSet resultSet = statement.executeQuery(readSQL);

            Pengguna penggunaHasilQuery;
            while (resultSet.next()){
                penggunaHasilQuery = new Pengguna(
                        resultSet.getInt("id"),
                        resultSet.getString("username"),
                        resultSet.getString("password"),
                        resultSet.getString("namalengkap"),
                        resultSet.getString("level")
                );
                listpengguna.add(penggunaHasilQuery);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listpengguna;
    }
    public void update(){}
    public void delete(){}

    public void login(){}
    public void updatePassword(){}
    public void resetPassword(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNamaLengkap() {
        return namaLengkap;
    }

    public void setNamaLengkap(String namaLengkap) {
        this.namaLengkap = namaLengkap;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
}
