package controller;

import repository.entity.Musteri;
import service.MusteriService;

import java.util.Scanner;

public class MusteriController {
    private final MusteriService musteriService;
    Scanner sc =new Scanner(System.in);
    public MusteriController(){
        musteriService = new MusteriService();
    }
    public void MusteriKaydet(){
        System.out.println("----------------------");
        System.out.println("-----Müşteri Kayıt----");
        System.out.println("----------------------");
        Musteri mst =new Musteri();
        System.out.println("Adınız...: ");
        mst.setAd(sc.nextLine());
        System.out.println("Soyadınız...: ");
        mst.setSoyad(sc.nextLine());
        System.out.println("Adresiniz...: ");
        mst.setAdres(sc.nextLine());
        System.out.println("Telefonunuz...: ");
        mst.setTelefon(sc.nextLine());
        musteriService.save(mst);

        System.out.println("Müşteri başarı ile kaydedildi");
    }
}
