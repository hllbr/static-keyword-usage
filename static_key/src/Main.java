
public class Main {
    public static void main(String[] args) {
        /*
        Static anahtar kelimesi = 
        bizim özelliklerimiz ve metodlarımız sadece objeye özgü oluyordu
        bunlara erişmek için o classtan bir obje oluşturmamız gerekiyordu
        bu objenin referansı üzerinden bu özelliklere veya metodlara direkt erişebiliyorduk.
        
        **Ancak biz static anahtar kelimesiyle yazdığımız zaman özelliklerimizi ve metodlarımızı bunlar artık bir objeye bağlı değil sınıfa bağlı özellikler veya metodlar oluyor.
        biz bu özellik yada metodları kullanmamız için artık bir obje oluşturmamıza gerk kalmıyor.
        bunlara direkt oalrak sınıf ismi üzerinden erişeniliyoruz 
        Ayrıca static tanımladığımız tüm özellikler ve metodlar program çalıştırıldığı zaman bellekte direkt olark oluşyorlar.
        herhangi bir obje oluştrmaya gerek kalmadan bellekte direkt oluşuyorlar
        Ve bunlar sınıfa ait oldukları için sadece ve sadece bir defa oluşuyorlar.
        biz bunlara bir defa oluştukları için sınıf ismi üzerinden erişebiliyoruz.
        
        */
        Seyirci seyirci = new Seyirci("hllbr");
        Seyirci seyirci1 = new Seyirci("@prince");
        seyirci.twitch_izle();
        System.out.println("seyirci sayısı : " +Seyirci.getSeyirciSayısı());
//bu şerkilde olamaz bunun için bir onje oluşturmamız gerekiyor.seyircisayısı non static bir metod olduğu için 
        System.out.println("Kanalın görüntülenme sayısı :" +seyirci1.getSeyirciSayısı());
        //static olmayan yapıyı bu alanda direkt çağıramıyoruz*****static bir metod içinde static olmayan bir yapı çağıramassın şeklinde bir hata ile karşılaşıyoruz
        naber();
        
    }
    public static void naber(){//yapıyı static yaparsak main içinde çalıştıtıtken olaşacak sıkıntıyı engeller.
        //oluşan bir metoddan oluşmayan bir metodu çağırmak java da hataya sebep oluyor
        System.out.println("Selamlar ...");
        System.out.println(Math.PI);
    }
}
/*
public static ain metodu neden static ? 
bizim projeyi oluşturup derledğimiz anda bunun direkt olarak bellekte oluşması gerekiyor bunu static anahtar kelimesi sağlıyor
//biz math kütüphanesi içersinide olan pi' ye eişrtik bunu sağlayan yapı yine static
*/