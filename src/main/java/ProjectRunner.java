import controller.MusteriController;
import repository.entity.Musteri;
import service.MusteriService;

public class ProjectRunner {
    public static void main(String[] args) {
        MusteriController musteriController=new MusteriController();
        //musteriController.MusteriKaydet();
        MusteriService ms = new MusteriService();
        for(Musteri musteri: ms.finAll()){
            System.out.println("müsteri id....: "+musteri.getId());
            System.out.println("müsteri ad....: "+musteri.getAd());
            System.out.println("müsteri soyad....: "+musteri.getSoyad());
            System.out.println("-------------------");
        }
    }
}
