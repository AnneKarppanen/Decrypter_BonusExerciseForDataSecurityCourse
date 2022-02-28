package salauksenmurtaja;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		
		Scanner lukija = new Scanner(System.in);
		
		ArrayList<Merkki> merkit = new ArrayList<>();
		
		HashMap<Double, String> suomenMerkit = new HashMap<>(); 
		
		suomenMerkit.put(11.90, "a");
		suomenMerkit.put(10.64, "i");
		suomenMerkit.put(9.77, "t");
		suomenMerkit.put(8.67, "n");
		suomenMerkit.put(8.21, "e");
		suomenMerkit.put(7.85, "s");
		suomenMerkit.put(5.68, "l");
		suomenMerkit.put(5.34, "k");
		suomenMerkit.put(5.24, "o");
		suomenMerkit.put(5.06, "u");
		suomenMerkit.put(4.59, "ä");
		suomenMerkit.put(3.30, "m");
		suomenMerkit.put(2.52, "v");
		suomenMerkit.put(2.32, "r");
		suomenMerkit.put(1.91, "j");
		suomenMerkit.put(1.83, "h");
		suomenMerkit.put(1.79, "y");
		suomenMerkit.put(1.74, "p");
		suomenMerkit.put(0.84, "d");
		suomenMerkit.put(0.49, "ö");
		suomenMerkit.put(0.13, "g");
		suomenMerkit.put(0.06, "b");
		suomenMerkit.put(0.06, "f");
		suomenMerkit.put(0.04, "c");
		suomenMerkit.put(0.01, "w");
		suomenMerkit.put(0.00, "å");
		suomenMerkit.put(0.00, "q");
		
		System.out.println("Anna murrettava teksti.");
		
		String murrettava = lukija.nextLine();
		
		int murrettavanPituus = murrettava.length();
		double murrettavatMerkit = 0.0;
		int i = 0;
		
		// Luo Merkki-oliot syotetyn tekstin merkeista.
		for (i = 0; i < murrettavanPituus; i++) {
			
			char merkki1 = murrettava.charAt(i);
			
			if (merkki1 != ' ') {
			
				murrettavatMerkit++;
				Merkki lisattava = new Merkki(merkki1);
				int loytyi = 0;
			
				for (Merkki merkki: merkit) {
					char verrattava = merkki.getMerkki();
					if (verrattava == merkki1) {
						loytyi++;
					}
				}
			
				if (loytyi == 0) {
					lisattava.setMaara(0);
					merkit.add(lisattava);
				
				}
			} 
			
		}
		
		
		// Laskee kunkin merkin maaran tekstista ja tallettaa sen Merkki-olioon.
		for (i = 0; i < murrettavanPituus; i++) {
			
			char merkki1 = murrettava.charAt(i);
			
			for (Merkki merkki: merkit) {
				char verrattava = merkki.getMerkki();
				if (verrattava == merkki1) {
					int maara = merkki.getMaara();
					maara++;
					merkki.setMaara(maara);
					merkki.setMerkitys(merkki1);
				}
		
			}
			
		}
		
		// Laskee kunkin merkin frekvenssin ja tallettaa sen Merkki-olioon.
		
		for (Merkki merkki: merkit) {
			int maara = merkki.getMaara();
			double frekvenssi = (maara / murrettavatMerkit) * 100;
			merkki.setFrekvenssi(frekvenssi);
		}
		
		Collections.sort(merkit, (m1, m2) -> m1.getMaara() - m2.getMaara());
		
		for (Merkki merkki: merkit) {
			System.out.println(merkki);
		}
		
		String valinta = "j";
		
		while (valinta.equals("j")) {
			
			System.out.print("\nMinka syottamasi tekstin merkin haluat korvata: ");
			String korvattava = lukija.nextLine();
			char korvattavaMerkki = korvattava.charAt(0);
			Merkki kasiteltava = null;
			
			for (Merkki merkki: merkit) {
				char verrattava = merkki.getMerkki();
				if (verrattava == korvattavaMerkki) {
				    kasiteltava = merkki;
					break;
				}
			} 
			
			double frekvenssi = kasiteltava.getFrekvenssi();
			
			System.out.println("Merkin " + korvattavaMerkki + " frekvenssi on " + frekvenssi);
			System.out.println("Seuraavien kirjainten frekvenssi on lähellä: ");
			
				for (Double fr: suomenMerkit.keySet()) {
					if (fr >= frekvenssi - 2.5 && fr <= frekvenssi + 2.5) {
						System.out.println(suomenMerkit.get(fr) + ": " + fr);
					}
				} 
					
			System.out.print("Milla haluat korvata merkin " + korvattavaMerkki + " :");
			String merkitys = lukija.nextLine();
			char lisattavaMerkitys = merkitys.charAt(0);
			kasiteltava.setMerkitys(lisattavaMerkitys);
		
		
			for (i = 0; i < murrettavanPituus; i++) {
			
				char merkki3 = murrettava.charAt(i);
			
				if (merkki3 != ' ') {
				
					for (Merkki merkki: merkit) {
						char merkki4 = merkki.getMerkki();
						if (merkki4 == merkki3) {
							System.out.print(merkki.getMerkitys());
						}
					}
				}
			
				if (merkki3 == ' ') {
					System.out.print(' ');
				}
			}
			
			System.out.print("\nHaluatko jatkaa murtamista? j = jatkan / e = en jatka: ");
			valinta = lukija.nextLine();
			
		}
		
		
		lukija.close();

	}

}
