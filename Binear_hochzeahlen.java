//Funktion:
//vier Bit hochzaehlen
//Zahlen uebergross dargestellt
public class Binear_hochzeahlen {
  
  //Variablendeklaration ohne Initialisierung
  public static int zaehlereins;
  public static int zaehlerzwei;
  public static int zaehlerdrei;
  public static int vierBit;
  public static String bitZahl;
  public static String ergebnis;
  public static String ziffer;
  public static int Bit;
  public static int stelle;

  public static void main(String[] args) {
    for (int i = 0; i <= 15; i++) { //Binaer zaehler
      vierBit = i;
      ergebnis = "";
      stelle = 8;
      for(int n = 3; n >= 0; n--) {
        if(vierBit >= stelle) {
          ergebnis = ergebnis + "1";
          vierBit = vierBit -stelle;
          stelle = stelle / 2;
        } else {
          ergebnis = ergebnis + "0";
          stelle = stelle / 2;
        }
      } 
      System.out.println("Die Bitzahl von "+zaehlereins+" ist: "+ergebnis);
      for (int t = 0; t < ergebnis.length(); t++) { //uebergroße Zahlen
        ziffer = ergebnis.charAt(t)+"";
        if (ziffer.equals("1")) {
          System.out.println(" 1");
          System.out.println("11");
          System.out.println(" 1");
          System.out.println(" 1");
          System.out.println();
        } else {
          System.out.println(" 0 ");
          System.out.println("0 0");
          System.out.println("0 0");
          System.out.println(" 0 ");
          System.out.println();
        }
      } // end of uebergroße Zahlen
    } // end of Binaer zaehler
  }
}