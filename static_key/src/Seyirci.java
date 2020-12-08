
public class Seyirci {
    private String isim ;
    //sınıfa ait bir özellik tanımlıyoruz 
   // public static int seyirci_sayısı = 0 ;
    private static int seyirci_sayısı = 0 ;
    String getSeyirciSayısı;
    //buraya sınıf izmi üzerinden ve obje ismi üzerinden ulaşabiliriz.
    public Seyirci(String isim) {
        this.isim = isim;
        seyirci_sayısı ++;
        
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
    //extra metod
    public void twitch_izle(){
        System.out.println(isim +" elwind adlı kanalı seyrediyor...");
    }
    //seyirci sayısına erişmek için
    //yapıyı static hale getirelim
    public static int getSeyirciSayısı(){
        return seyirci_sayısı;
    }
}
