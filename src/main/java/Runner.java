import java.util.Scanner;

//controller : işlemci ya da client ile iletişime gecicek
public class Runner {

    public static Scanner inp=new Scanner(System.in);

    public static void main(String[] args) {
        start();
    }
    private static void start(){

        int select;
        int id;
        do {
            System.out.println("=========================================");
            System.out.println("Öğrenci Yönetim Paneli");
            System.out.println("1-Öğrenci Kaydetme");
            System.out.println("2-Tüm Öğrencileri Listeleme");
            System.out.println("3-Öğrenciyi Güncelleme");
            System.out.println("4-Öğrenciyi silme");
            System.out.println("5-Tek bir Öğrenciyi görüntüleme");
            System.out.println("0-ÇIKIŞ");
            System.out.println("İşlem Seçiniz : ");
            select= inp.nextInt();
            inp.nextLine();

            switch (select){
                case 1:
                    //bilgileri verilen öğrenciyi kaydetme
                    break;
                case 2:
                    //tüm öğrencileri konsola yazdırma
                    break;
                case 3:
                    id=getIdInfo();
                    //id si verilen öğrencinin bilgilerini güncelleme
                    break;
                case 4:
                    id=getIdInfo();
                    //id si girilen öğrenciyi silme
                    break;
                case 5:
                    id=getIdInfo();
                    //id si verilen ogrenciyi getirme
                    break;
                case 0:
                    System.out.println("İYİ GÜNLER....");
                    break;
                default:
                    System.out.println("Hatalı GİRİŞ!!!!");
                    break;

            }

        }while (select!=0);


    }

    private static int getIdInfo(){
        System.out.println("Öğrenci id : ");
        int id=inp.nextInt();
        inp.nextLine();
        return id;
    }
}