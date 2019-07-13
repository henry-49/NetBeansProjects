/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainperson;

/**
 *
 * @author henry
 */
public class ZuHouse{
     // Attribute
    public String vorname;
    public String nachname;
    public int alter;
    public String emial;
    public int telefon;
    public String strasse;
    public int hausnummer;
    public int postleitzahl;
    public String ort;
 // public int grossederWohnung;
//  public int anzahlderZimmer;
    
// Konstruktoren
    public ZuHouse(){}
    public ZuHouse(String vorname,String nachname,
                int alter,String email, int telefon, String strasse,
                int hausnummer, int postleitzahl, String ort){
      
      this.vorname = vorname;
      this.nachname = nachname;
      this.alter = alter;
      this.emial = email;
      this.telefon = telefon;
      this.strasse = strasse;
      this.hausnummer = hausnummer;
      this.postleitzahl = postleitzahl;
      this.ort = ort;
      
  }
    // Methode
    public void identiefizieren(){
        System.out.println("Ich bin Papa");
    }
    
    public void datenAusgeben(){
        System.out.println("Vorname: "+vorname+ "\n"+ 
                           "Nachname: "+nachname+"\n"+
                            "Alter: "+alter+"\n"+
                            "Email: "+emial+"\n"+
                            "Telefon: "+telefon+"\n"+
                            "Strasse: "+strasse+"\n"+
                            "Haunummber: "+hausnummer+"\n"+
                            "Postleitzahl: "+postleitzahl+"\n"+
                            "Ort: "+ort+"\n"
                            );
    }
}
