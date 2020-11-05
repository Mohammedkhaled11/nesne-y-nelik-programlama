/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nyp2;
import java.util.Scanner;
/**
 *1
 * @author Mohammed
 */
public class Nyp2 {
private static Scanner input;
    /**
    private static Scanner input; * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         input = new Scanner(System.in);
		double birinciKenarUzunlugu, ikinciKenarUzunlugu, tabanUzunlugu , yukseklik,yaricap,kenarsayisi,kenarUzunluk,
                        cokkenCevresi,cokkenAlan, ucgenCevresi, ucgenAlani;
		
		
		
		System.out.println("ucgenin İkinci Kenar Uzunlugunu giriniz:");
		ikinciKenarUzunlugu= input.nextDouble();
                
                System.out.println("ucgenin Birinci Kenar Uzunlugunu giriniz:");
		birinciKenarUzunlugu = input.nextDouble();
		
		System.out.println("ucgenin Taban Uzunluğunu Giriniz:");
		tabanUzunlugu= input.nextDouble();
                
                System.out.println("cokkenin yarıcapını giriniz:");
		yaricap= input.nextDouble();
		
		System.out.println("ucgenin Yüksekliğini Giriniz:");
		yukseklik= input.nextDouble();
                
        
                System.out.println("Duzgun cokkenin kenar sayısını giriniz:");
		kenarsayisi= input.nextDouble();
                
                System.out.println("Duzgun cokkenin bir kenar uzunlugunu giriniz:");
		kenarUzunluk= input.nextDouble();
		
               
		
		ucgenAlani=ucgenAlaniHesapla(tabanUzunlugu, yukseklik);
                cokkenAlan=cokkenAlanHesapla(yaricap, kenarsayisi);
                cokkenCevresi=cokkeCevreHesapla(kenarUzunluk,kenarsayisi);
                ucgenCevresi= ucgenCevresiHesapla(birinciKenarUzunlugu, ikinciKenarUzunlugu, tabanUzunlugu);
	
		cevreYazdir(ucgenCevresi);
               alanaYazdir(cokkenAlan);
		alanYazdir(ucgenAlani);
                
                cevreeYazdirc(cokkenCevresi);
		
		
       
    }

    private static double ucgenCevresiHesapla(double a, double b, double c) {
        double cevre= a + b + c;
		return cevre;
    }

    private static double ucgenAlaniHesapla(double c, double h) {
        double alan= (c*h)/2;
		return alan;
    }

    private static void cevreYazdir(double i) {
        System.out.println("ucgenin cevresi:"+i);
    }

    private static void alanYazdir(double j) {
        System.out.println("ucgenin Alani:"+j);
    }

    private static double cokkenAlanHesapla(double a, double b) {
        double alana = 1/2*a*b;
                return alana;
    }

    private static void alanaYazdir(double R) {
        System.out.println("cokken Alani:"+R);
        
    }

    private static double cokkeCevreHesapla(double Y, double Z) {
        double cevree = Y*Z;
              return cevree;
    }

    private static void cevreeYazdirc(double X) {
        System.out.println("Çokken çevresi:"+X);
    }
    
}
        // TODO code application logic here
    
    

