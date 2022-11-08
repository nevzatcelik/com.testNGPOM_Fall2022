package tests.ders17_smokeTests;

import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class C01_SingletonPattern {

    /*
       SingletonPattern Bir class tan obje olusturulmasini engelleyen veya sinirlandiran bir konsepttir
     */


    @Test
    public void test01(){
      //  Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
    /* Tum class lardan yapabildigimiz gibi driver clasindan da obje olusturabilir ve oradaki class uylerini kullanabiliriz
       Boyle bir durum da driver class inda yaptigimiz tercihler bypass edilir

       Bu tur kullanimin onune gecebilmek icin Java'dan singleton pattern konspeti uygulanir

       Driver class indan obje olusurlmasini engellemek icin;

       Driver class indan obje olusturup, kullanabilmek icin
       Driver() constructor ina ihtiyac vardir
       Eger bu consttructor i erisilemez yaparsak
       kimse constructoor a erisemez ve dolayisiyla kimse Driver Classindan obje olusturamaz

       Bunun icin gorunur parametresiz bir constructor olusturup bunu private yapariz

       Bu yonteme SINGLETON PATTERN denir

     */
      //  Driver driver=new Driver();


    }
}
