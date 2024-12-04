import java.sql.*;

//4-jdbc için gerekli olan nesnelerin hazırlığı
public class JdbcUtils {

    public static Connection connection;
    public static Statement st;
    public static PreparedStatement prst;

    //4-a: connection bağlantısını olusturma
    public static void setConnection(){
        try {
            connection=DriverManager.getConnection("jdbc:postgresql://localhost:5432/jdbcStudentManagement",
                    "techpro","password");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    //4-b statement olusturma methodu
    public static void setStatement(){
        try {
            st= connection.createStatement();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    //4-c preparedstatement olusturma
    public static void setPreparedStatement(String sql){
        try {
            prst=connection.prepareStatement(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }




}