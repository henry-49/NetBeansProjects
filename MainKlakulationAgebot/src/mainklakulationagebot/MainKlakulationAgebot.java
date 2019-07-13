/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainklakulationagebot;

/**
 *
 * @author henry
 */
public class MainKlakulationAgebot {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        KlakulationAgebot gm = new KlakulationAgebot();

        char cMenueauswahl;
	//Solange das Hauptmenü zeigen, bis der Nutzer x eingegeben hat.
	do {
		cMenueauswahl = gm.hauptMenue();
	} while (cMenueauswahl != 'x');
    }
    
}
