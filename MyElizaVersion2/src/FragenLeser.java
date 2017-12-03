import java.io.*;

public class FragenLeser {
	// Definieren Sie ab hier die Klassenvariablen für FragenLeser

	// Definieren Sie ab hier die Objektvariablen für FragenLeser

	// Definieren Sie ab hier die KOnstruktoren für FragenLeser
	/**
	 * Konstruktor für Objekte der Klasse FragenLeser
	 */
	public FragenLeser() {
		// Objektvariable initialisieren
	}

	// Definieren Sie ab hier die Methoden für FragenLeser
	/**
	 * Lies die nächste Frage von der Konsole
	 * 
	 * @param -
	 * @return die nächste Frage
	 */
	public static String liesString() {
		BufferedReader B = new BufferedReader(new InputStreamReader(System.in));
		try {
			return B.readLine();
		} catch (Exception e) {
			return "?";
		}
	}

	/**
	 * Methode gibt Prompt auf dem Bildschirm aus und liest die nächste Frage
	 * 
	 * @param -
	 * @return die nächste Frage
	 */
	public String naechsteFrage() {
		System.out.print("> ");
		return liesString();
	}
}
