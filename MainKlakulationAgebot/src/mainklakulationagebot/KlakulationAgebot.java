/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainklakulationagebot;

public class KlakulationAgebot {
    final int  LAGER_PROZENT = 10;
final int VERWALTUNGS_PROZENT = 10 ;
final int GEWINN_PROZENT   = 10;
final int VERSEND_PROZENT  = 5;
final int  MONTAGE_PROZENT = 15 ; 


final Float FUN_STAR = 1243.43f;
final float HIGH_END  = 1658.50f;
final float MULTIMEDIA_STAR  = 698.20f;
final float OFFICE_STAR  = 1015.39f;
final float COMPU_CASE   = 96.03f;
final float COMPU_CASE_LX100 = 98.05f;
final float COMPU_CASE_LX120  = 69.89f;
final float COMPU_CASE_LX34A  = 105.60f;
final float MAINBOARD  = 193.03f;
final float CPU = 334.65f;
final float HARDDISK  = 130.95f;
final float GRAFIC_CARD = 319.13f;

//Deklaration der globalen Variable für den Warenkorbpreis
float fWarenkorbpreis = 0;

float fWarekorbwert = 0.00f;
char cMenueauswhal;
int iMenueauswhal = -1;
 int meunInput;
    Scanner sc = new Scanner(System.in);
    // Warenkorb Zeigen
    
              
       public char hauptMenue() {
           int iError;
           char cMenueauswhal;
    // Warenkorb Zeigen
//    system("cls");
        System.out.println("\t\t  Warenkorbpreis:"+ fWarekorbwert);
        System.out.println("\tPRISEKALKULATION");
        System.out.println("=================");
        System.out.println("a:Standardkonfiguration\n b:Einzelkomponenten \n x:Ende");
 
do{
     cMenueauswhal = sc.next().charAt(0);
    iError = cMenueauswhal;
}while (iError == 0) ;             
               
           
    switch (cMenueauswhal)
    {
    case 'a':
       
            standardKonfigurationsMenue();

        break;

    case 'b':
//           EinzelkomponentenMenue();

        break;
    default:
        break;
    }
    return cMenueauswhal;
       }
     
     /*
========================================================================
Funktion standardKonfigurationsMenue()
Parameter: -
Rückgabe:  -
Beschreibung: Zeigt das Konfigurationsmenue des Programmes an.
Der Nutzer kann zwischen verschiedenen Konfigurationen wählen.
Die Preise werden mit angezeigt.
========================================================================
*/

public void standardKonfigurationsMenue() {
	int iError, iArtikelAnzahl,  iMenueauswahl; 
         
	char cVersandInfo, cWarenkorbInfo;
	float fListenpreis=0, fMaterialkosten, fVersandpreis, fBarverkaufspreis;
	//Ausgabe des Menüs
	System.out.println(" \t\t\t\t Warenkorb:"+ fWarenkorbpreis);
	System.out.println("\tS T A N D A R D K O N F I G U R A T I O N E N");
	System.out.println("\t=============================================");
	System.out.println("\t1: Fun Star \t\t\t "+ FUN_STAR);
	System.out.println("\t2: High End \t\t\t "+ HIGH_END);
	System.out.println("\t3: Multimedia Star \t\t "+ MULTIMEDIA_STAR);
	System.out.println("\t4: Office Star \t\t\t "+ OFFICE_STAR);
	System.out.println("\t0: Abbruch \n\n");
	//Solange eine Auswahl einlesen, bis die Eingabe valide ist
	do {
		System.out.println("\tAuswahl: ");
                iMenueauswahl = sc.nextInt();
		iError = iMenueauswahl;
		fListenpreis = listenpreisStandardKonfiguration(iMenueauswahl);
	} while (fListenpreis < 0 || iError == 0
		|| iMenueauswahl > 4 || iMenueauswahl < 0);
	/* Überprüfen, ob der Listenpreis ungleich 0 ist. 
	Ansonsten wird nichts gemacht und das Hauptmenü wird angezeigt. */
	if (fListenpreis != 0) {
		//Artikelanzahl und Versandinfo erfragen
		iArtikelAnzahl = anzahlArtikelAbfrage();
		cVersandInfo = versandAbfrage();
		//Materialkosten berechnen
		fMaterialkosten = materialkostenBerechnung(fListenpreis, 
			                                       iArtikelAnzahl);
		//Barverkaufspreis berechnen
		fBarverkaufspreis = barverkaufspreisBerechnung(fMaterialkosten);
		//Überprüfung der eingegebenen Versandinfo
		if (cVersandInfo == 'j') {
			//Berechnung des Versandpreises
			fVersandpreis = versandpreisBerechnung(fBarverkaufspreis);
		}
		else {
			fVersandpreis = 0;
		}
		//Abfrage, ob die Komponenten in den Warenkorb gelegt werden soll
		cWarenkorbInfo = warenkorbInfo();
		//Berechnung des Warenkorbpreises
		warenkorbpreisBerechnung(cWarenkorbInfo, cVersandInfo,
		                     	fVersandpreis, fBarverkaufspreis);
	}
}/*
========================================================================
Funktion listenpreisEinzelkomponente()
Parameter: iMenueauswahl
Rückgabe:  fListenpreis
Beschreibung: Gibt den Listenpreis für die Komponenten des
Einzelkomponentenmenüs anhand der zugehörigen,
definierten Konstanten zurück.
========================================================================
*/
public float listenpreisEinzelkomponente(int iMenueauswahl) {
	float fListenpreis;
	/*Setzen des dazugehörigen Listenpreises für die
	Einzelkomponenten in Abhängigkeit von der Menüauswahl des Nutzers*/
	switch (iMenueauswahl) {
	case 1:
		fListenpreis = (float)COMPU_CASE;
		break;
	case 2:
		fListenpreis = (float)MAINBOARD;
		break;
	case 3:
		fListenpreis = (float)CPU;
		break;
	case 4:
		fListenpreis = (float)HARDDISK;
		break;
	case 5:
		fListenpreis = (float)GRAFIC_CARD;
		break;
	default:
		fListenpreis = 0;
	}
	return fListenpreis;
}
    
}
