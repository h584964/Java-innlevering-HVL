package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class Oppgave5 {

	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {
			int poengsum = Integer.parseInt(showInputDialog("Skriv inn poengsummen din her: "));
			while (poengsum < 0 || poengsum > 100) {
				poengsum = Integer.parseInt(showInputDialog("Ugyldig poengsum, vennligst prøv på nytt: "));
			}

			if (poengsum <= 100 && poengsum >= 90)

				System.out.println("Karakter A: " + poengsum);

			else if (poengsum <= 89 && poengsum >= 80)

				System.out.println("Karakter B: " + poengsum);

			else if (poengsum <= 79 && poengsum >= 60)
				System.out.println("Karakter C: " + poengsum);

			else if (poengsum <= 59 && poengsum >= 50)
				System.out.println("Karakter D: " + poengsum);

			else if (poengsum <= 49 && poengsum >= 40)
				System.out.println("Karakter E: " + poengsum);

			else if (poengsum <= 39 && poengsum >= 0)
				System.out.println("Karakter F: " + poengsum);

			else
				System.out.println("Poengsummen er ugyldig, venligst prøv på nytt");

		}

	}

}
