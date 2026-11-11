package test;

import personnages.Gaulois;
import personnages.Romain;

public class testGaulois {
	
	
	
 public static void main(String[] args) {
	 Gaulois asterix = new Gaulois ("Astérix",8); 
		Gaulois obelix = new Gaulois ("Obélix",16); 
		Romain minus = new Romain("minus", 6);
		

        asterix.parler("Bonjour Obélix.");
        obelix.parler("Bonjour Astérix. Ca te dirais d'aller chasser des sangliers ?");
        asterix.parler("Oui très bonne idée.");
        System.out.println("Dans la forêt " + asterix + " et " + obelix
                + " tombent nez à nez sur le romain " + minus.getNom() + ".");
        for (int i = 0; i < 3; i++) {
            asterix.frapper(minus);
        }
}}

