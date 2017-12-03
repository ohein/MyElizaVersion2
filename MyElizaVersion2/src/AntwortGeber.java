
public class AntwortGeber {
	// Definieren Sie ab hier die Klassenvariablen f�r AntwortGeber

	// Definieren Sie ab hier die Objektvariablen f�r AntwortGeber
	int anzahlAntworten = 0;

	// Definieren Sie ab hier die KOnstruktoren f�r AntwortGeber
	/**
	 * Konstruktor f�r Objekte der Klasse AntwortGeber
	 */
	public AntwortGeber() {
		// Objektvariable initialisieren
	}

	// Definieren Sie ab hier die Methoden f�r AntwortGeber
	/**
	 * erzeugt eine Antwort
	 * 
	 * @param dieFrage
	 *            String
	 * @return die Antwort String
	 */
	public String gibAntwort(String dieFrage) {
		anzahlAntworten++;
		switch (anzahlAntworten % 6) {
		case 0:
			return "Das vestehe ich nicht. Erkl�ren Sie es bitte genauer!";
		case 1:
			return "Seit wann haben Sie diese Probleme?";
		case 2:
			return "Was denken Sie, ist die Ursache dieser Probleme?";
		case 3:
			return "Das klingt interessant. Erz�hlen Sie mir mehr davon!";
		case 4:
			return "Erz�hlen Sie mir von Ihrer Mutter!";
		case 5:
			return "Wei� Ihre Frau davon!";
		}
		return "?";
	}
}
