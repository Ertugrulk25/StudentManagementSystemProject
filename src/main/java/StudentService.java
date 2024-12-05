import java.util.List;
import java.util.Scanner;

//service:(business) manipülation islemleri yapacak.
//service class ları repo cass ları ile görüşür.
public class StudentService {

    Scanner imput = Runner.imp;

    //repository nin methodlarını kullanabilmek için obje oluşturalım.
    private Repository repo = new StudentRepository();

    // 7-a student tablosunu oluşturma

    public void createStudentTable(){
        repo.createTable();

    }
    //8-a verilen bilgler ile öğrenciyi kaydetme

    public Student getStudentInfo(){

        System.out.println("AD :");
        String name = imput.next();
        System.out.println("SOYAD :");
        String lastname= imput.next();
        System.out.println("ŞEHİR :");
        String city = imput.next();
        System.out.println("YAŞ :");
        int age = imput.nextInt();
        imput.nextLine();

        return new Student(name,lastname,city,age); // id: null
    }

public void saveStudent(Student newStudent){
        repo.save(newStudent);

}
//9-a Tüm öğrencileri consol a yazdırma
    public void printAllStudents(){
      List<Student> students = repo.findAll();

        System.out.println("============== TÜM ÖĞRENCİLER =============================");
            for (Student student : students) {

                System.out.println(" id: "+student.getId()
                        + " ad: "+ student.getName()
                        + " soyadı: "+ student.getLastName()
                        + " yaş: "+ student.getAge()
                        + " şehir: "+ student.getCity());
            }
    }
//10- a id si verilen öğrenciyi getirme
    public Student getStudentById(int id){
        Student student = (Student) repo.findById(id);

        return student;
    }
    //10-b id si verilen öğrenciyi görüntüleme

    public void printStudentById(int id){
        Student foundStudent = getStudentById(id);
        if (foundStudent==null){
            System.out.println("ID si verilen öğrenci bulunamadı. ");
        }else {
            System.out.println(foundStudent);
        }
        System.out.println(foundStudent);


    }


}








