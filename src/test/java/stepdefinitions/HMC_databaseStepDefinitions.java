package stepdefinitions;

import io.cucumber.java.en.Given;

import java.sql.*;

public class HMC_databaseStepDefinitions {

    String url = "jdbc:sqlserver://184.168.194.58:1433;databaseName=hotelmycamp ; user=techproed;password=P2s@rt65";
    String username = "techproed";
    String password = "P2s@rt65";

    Connection connection;//database baglanmamızı saglardı
    Statement statement;//query calıştırmamızı saglıyordu
    ResultSet resultSet;//query sonucunda dönen sonucu store etmemizi saglıyordu


    @Given("kullanici HMC veri tabanina baglanir")
    public void kullanici_hmc_veri_tabanina_baglanir() throws SQLException {
        connection = DriverManager.getConnection(url, username, password);
        statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
    }

    @Given("kullanici {string} tablosundaki {string} verilerini alir")
    public void kullanici_tablosundaki_verilerini_alir(String table, String field) throws SQLException {
        String query = "select " + field + " from " + table;
        resultSet = statement.executeQuery(query);
    }

    @Given("kullanici {string} sutunundaki verileri okur")
    public void kullanici_sutunundaki_verileri_okur(String field) throws SQLException {
        //resultset iterator gibi çalışır
        resultSet.first();
        System.out.println(resultSet.getString("price"));//225.000
        resultSet.next();//iteratora benzer şekilde çalışır,next methodu imleci bir sonraki degerin yanına götürür
        //bize true veya false döner
        System.out.println(resultSet.getString("price"));//400.000
        System.out.println(resultSet.next());//true
        System.out.println(resultSet.getString("price"));//445.000
        //next kullanırken dikkatli olmalıyız nerede olursa olsun imleci bir sonrakine götürür

        System.out.println("********************************liste************************************");
        resultSet.absolute(0);
        int sira=1;
        while (resultSet.next()) {
            System.out.println(sira+". kayıt: " +resultSet.getString("price"));
            sira++;

        }
        resultSet.last();
        System.out.println(resultSet.getRow());//416





    }
}