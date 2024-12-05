import java.util.Scanner;

//controller : istemci ya da client ile iletişime gecicek
//controller ile sadece service class ları görüşür.
public class Runner {

    public static Scanner imp =new Scanner(System.in);

    public static void main(String[] args) {

        start();

    }

    private static void start() {

StudentService service = new StudentService();
//Uygulama başladığında tablo oluşturulsun.
service.createStudentTable();


int select ;
int id;
do {
    System.out.println("===================================================");
    System.out.println("Öğrenci Yönetim Paneli");
    System.out.println("Öğrenci Kaydetme");
    System.out.println("Tüm Öğrencileri Görüntüleme");
    System.out.println("Öğrenciyi Güncelleme");
    System.out.println("Öğrenciyi Silme");
    System.out.println("Tek Bir Öğrenciyi Görüntüleme");
    System.out.println("Çıkış");
    System.out.println("İşlem Seçiniz: ");
    select = imp.nextInt();
    imp.nextLine();

    switch (select){
        case 1:
            //bilgileri verilen öğrenciyi kaydetme
            Student newStudent = service.getStudentInfo();
            service.saveStudent(newStudent);
            break;
        case 2:
            // öğrencileri databaseden çekip consola yazdırma
            service.printAllStudents();

            break;
        case 3:
            //id si verilen öğrenciyi güncelleme
        id= getIdInfo();
            break;
        case 4:
            //id si verilen öğrenciyi silme
            id=getIdInfo();
            break;
        case 5:
           id= getIdInfo();
           service.printStudentById(id);
           //id si verlien öğrenciyi görüntüleme

            break;
        case 0:
            System.out.println("İyi Günler...");
            break;
        default:
            System.out.println("Hatalı Giriş!!!");
            break;
    }

}while (select !=0);

    }
private static int getIdInfo(){

    System.out.println("Öğrenci ID: ");
    int id = imp.nextInt();
    imp.nextLine();
    return id;
}
}




