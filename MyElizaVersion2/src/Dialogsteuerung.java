
public class Dialogsteuerung {
	// Definieren Sie ab hier die Klassenvariablen f�r Dialogsteuerung

	// Definieren Sie ab hier die Objektvariablen f�r Dialogsteuerung
	private FragenLeser leser;
	private AntwortGeber antworter;

	// Definieren Sie ab hier die KOnstruktoren f�r Dialogsteuerung
	/**
	 * Konstruktor f�r Objekte der Klasse Dialogsteuerung
	 */
	public Dialogsteuerung() {
		// Objektvariable initialisieren
		leser = new FragenLeser();
		antworter = new AntwortGeber();
	}

	public Dialogsteuerung(AntwortGeber ag) {
		leser = new FragenLeser();
		antworter = ag;
	}

	// Definieren Sie ab hier die Methoden f�r Dialogsteuerung
	/**
	 * Gibt Willkommensbotschaft aus
	 */
	private void sagHallo() {
		System.out.println("Guten Tag. Nehmen Sie Platz.");
		System.out.println("Wie kann ich Ihnen helfen?");
	}

	/**
	 * Gibt Willkommensbotschaft aus
	 */
	private void sagAufwiedersehen() {
		System.out.println("Sch�n, dass Sie da waren. Sie schaffen das schon!");
		System.out.println("Bis zur n�chsten Sitzung und denken Sie an die Rechnung.");
	}

	/**
	 * Startet die Kommunikation und steuert die Kommunikation.
	 */
	public void starteDialog() {

		boolean fertig = false;
		sagHallo();

		while (!fertig) {
			String frage = leser.naechsteFrage();
			if (frage.startsWith("bye")) {
				fertig = true;
			} else {
				String antwort = antworter.gibAntwort(frage);
				System.out.println(antwort);
			}
		}
		sagAufwiedersehen();
	}
}
