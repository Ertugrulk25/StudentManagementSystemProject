import java.sql.SQLException;
import java.util.List;

//repository : veritabani ile ilgili işlemler
//create table,save,update,delete,findAll
//repository sadece service iletişime gecer
public class StudentRepository implements Repository<Student, Integer> {

    //7-t_student tablosunu olusturma
    @Override
    public void createTable() {
        JdbcUtils.setConnection();//bağlantı olustu
        JdbcUtils.setStatement();//statement başlattık
        try {
            JdbcUtils.st.execute("CREATE TABLE IF NOT EXISTS t_student(" +
                    "id SERIAL UNIQUE, " +
                    "name VARCHAR(50) NOT NULL CHECK(LENGTH(name)>1), " +
                    "lastname VARCHAR(50) NOT NULL CHECK(LENGTH(lastname)>1)," +
                    "city VARCHAR(50)NOT NULL," +
                    "age INTEGER NOT NULL CHECK(age>0))");//""
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                JdbcUtils.st.close();
                JdbcUtils.connection.close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }


        }

    }

    //8-öğrenciyi kaydetme
    @Override
    public void save(Student student) {
        JdbcUtils.setConnection();
        JdbcUtils.setPreparedStatement("Insert Into t_student(name,lastname,city,age) values(?,?,?,?)");

        try {
            JdbcUtils.prst.setString(1, student.getName());
            JdbcUtils.prst.setString(2, student.getLastName());
            JdbcUtils.prst.setString(3, student.getCity());
            JdbcUtils.prst.setInt(4, student.getAge());
            JdbcUtils.prst.executeUpdate();
            System.out.println("Başarılı bir şekilde kaydedildi.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }finally {

            try {
                JdbcUtils.prst.close();
                JdbcUtils.connection.close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }

    }

    @Override
    public List<Student> findAll() {
        return null;
    }

    @Override
    public void update(Student entity) {

    }

    @Override
    public void deleteById(Integer id) {

    }

    @Override
    public Student findById(Integer id) {
        return null;
    }
}