
public class BessererAntwortGeber extends AntwortGeber{
	/**
	 * Hier definieren Sie die Attribute Ihrer Klasse Beispiel: private <Typ>
	 * Name_des_Attributs
	 */
	int x;

	/**
	 * Hier definieren Sie den Konstruktor fuer Objekte Ihrer Klasse (falls Sie
	 * einen eigenen brauchen) BessererAntwortGeber
	 */
	public BessererAntwortGeber() {
	}

	public String gibAntwort(String dieFrage) {
		int auswahl = (int) (Math.random() * 100);
		switch (auswahl % 6) {
		case 0:
			return "Das vestehe ich nicht. Erkl‰ren Sie es bitte genauer!";
		case 1:
			return "Seit wann haben Sie diese Probleme?";
		case 2:
			return "Was denken Sie, ist die Ursache dieser Probleme?";
		case 3:
			return "Das klingt interessant. Erz‰hlen Sie mir mehr davon!";
		case 4:
			return "Erz‰hlen Sie mir von Ihrer Mutter!";
		case 5:
			return "Weiﬂ Ihre Frau davon!";
		}
		return "?";
	}
}
