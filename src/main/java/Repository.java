import java.util.List;

public interface Repository<S, U extends Number> {

    //7-t_student tablosunu olusturma
    void createTable();

    void save(S entity);

    List<S> findAll();

    void update(S entity);

    void deleteById(U id);

    S findById(U id);
}
