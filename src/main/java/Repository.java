import java.util.List;

public interface Repository<S, I extends Number> {

    //7-t_student tablosunu olusturma
    void createTable();

    void save(Student entity);

    List<Student> findAll();

    void update(Student entity);

    void deleteById(Integer id);

    Student findById(Integer id);
}
