// Hessam Farhat	 N20239030		 hessamfarhat@hacettepe.edu.tr
/** 
 * @author Hessam
 * homework1 adinda class olusturuluyor.
 */
public class homework1 {

	public static void main(String[] args) {
		
				
					
				
	}
	/**
	 * asagidaki num_digits fonksiyonu, bir tam sayi aliyor ve basamak sayisini bastiriyor.
	 * num girdi olarak verilecek sayi. fonksiyon integer fonksiyon oldugu icin return degeri olmasi lazim
	 */
	public static int num_digits(int num) {
		int basamak_sayisi = 0;
		if (num == 0)
			basamak_sayisi = 1;
		while ( num != 0) {
			num = num / 10;
			++basamak_sayisi;
		}
		return basamak_sayisi;
	}
	/**
	 * number_matrix fonksiyonu, girdi olarak tam sayi R (satir) ve C (sutun) sayilarini alip, ilk satir 1 den baslayip
	 *  tek tek arttirarak girilen sutun sayisina kadar basiyor, ve ilk sutun ayni satirdaki gibi 1 den baslayip
	 *  tek tek arttirarak girilen satir sayisina kadar basiyor. 2. satir ve sutun baslian sayidanitibaren arttirarak
	 *  devam ediyor. 
	 */
	
	
	public static void number_matrix(int R, int C) {
		
		for (int satir = 1 ; satir <= R ; satir++) {
			int i = 0;
			for(int sutun = 1 ; sutun <= C ; sutun++) {
				System.out.print(i + satir + " ");
				++i;
			}
			System.out.println();
		}			
	}
	/**
	 * fonksiyon bir string fonksiyonudur, ve girdi olarak 3 string degeri aliyor, str1 str2 str3.
	 * fonksiyon str2'ye bakip o degerler str1 de varsa eger o degerleri str3 ile degistiriyor. 
	 * tabi programda index'leri ve stringin uzunluklari kullanilarak yazildi.
	 * string fonksiyonu oldugu icin return degeri olmasi lazim.
	 */
	
	public static String str_replace(String str1, String str2, String str3) {
		String yeni = "";
		int uzunluk = str1.length() - str2.length();
		for (int index = 0; index <= uzunluk; index++) {
			String gecici = "";
			for (int k = 0 ; k < str2.length(); k++ ) {
				gecici += str1.charAt(index + k);
			}
			if (gecici.equals(str2)) {
				yeni += str3;
				index += str2.length() - 1;
			}
			
			if ((!gecici.equals(str2)) && (index == uzunluk)) {
				for (int m = index; m < str1.length(); m++) {
					yeni += str1.charAt(m);
				}
			}
			if ((!gecici.equals(str2)) && (index != uzunluk)){
				yeni += str1.charAt(index);
			}
				
		}
		
		return yeni;
	}
	/**
	 * bu fonksiyon compute_letter fonksiyonudur ve string degeri vardir. string degeri oldugu icin return olmasi lazim.
	 * a1, a2, a3, f parametrelerimiz tam syi degeri vardir, verilen formulde  ortalama hesaplanip ve double degeri vardir.
	 * degerlerin ortalamasi kusuratli sayi oldugundan onlari yuvarlamak lazim veya kaba bir sekilde  "if"
	 * yazarak harf notlarini hesaplatiriz. 
	 */
	
	
	public static String compute_letter(int a1, int a2, int a3, int f) {
		String harf = "";
		double ortalama;
		ortalama = a1*0.2 + a2*0.2 + a3*0.2 + f*0.4;
		if ((ortalama >= 94.5) && (ortalama <= 100))
			harf = "A1";
		if ((ortalama >= 89.5) && (ortalama < 94.5))
			harf = "A2";
		if ((ortalama >= 84.5) && (ortalama < 89.5))
			harf = "A3";
		if ((ortalama >= 79.5) && (ortalama < 84.5))
			harf = "B1";
		if ((ortalama >= 74.5) && (ortalama < 79.5))
			harf = "B2";
		if ((ortalama >= 69.5) && (ortalama < 74.5))
			harf = "B3";
		if ((ortalama >= 64.5) && (ortalama < 69.5))
			harf = "C1";
		if ((ortalama >= 59.5) && (ortalama < 64.5))
			harf = "C2";
		if ((ortalama >= 54.5) && (ortalama < 59.5))
			harf = "C3";
		if ((ortalama >= 39.5) && (ortalama < 54.5))
			harf = "D";
		if ((ortalama >= 0) && (ortalama < 39.5))
			harf = "F";
			
		return harf;
	}
	/**
	 * fonksiyon binary_to_decimal fonksiyonu, yani ikilik degeri ondalik degere ceviriyor. integer fonksiyonu oldugu icin
	 * return degeri lazim. ama eger "." ve "-" kullanirsak ikilik olarak "." icin "1" ve "-" icin "0" olarak
	 * bastirip sonra onu ondalik sayiya ceviriyoruz.
	 */
	
	public static int binary_to_decimal(String harf) {
		int ondalik = 0;
		int basamak = 1;
		String ikilik = "";
		
		for (int index = 0; index < harf.length(); index++) {
			if (harf.charAt(index) == '.')
				ikilik += "1";
			if (harf.charAt(index) == '-')
				ikilik += "0";
		}
		for (int index = ikilik.length()-1 ; index >= 0 ; index--) {
			if (ikilik.charAt(index) == '1')
				ondalik += basamak;
		    basamak *= 2;
		}
		return ondalik;
		
	}
}
