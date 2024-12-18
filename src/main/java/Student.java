//domain-entity
public class Student {
    private Integer id;//eğer değer atamadıysak null olarak ayarlanıcak

    private String name;

    private String lastName;

    private String city;

    private int age;


    // pmetresiz-pmatreli Constructor
    public Student() {
    }

    public Student(String name, String lastName, String city, int age) {
        this.name = name;
        this.lastName = lastName;
        this.city = city;
        this.age = age;
    }



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", city='" + city + '\'' +
                ", age=" + age +
                '}';
    }
}
