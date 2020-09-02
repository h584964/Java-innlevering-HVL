package no.hvl.dat100;

import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;

public class Oppgave6 {

	public static void main(String[] args) {

		int i, fakultet = 1;
		int tall = parseInt(showInputDialog("Skriv inn et heltall som er større enn 0: "));

		for (i = 1; i <= tall; i++) {
			fakultet = fakultet * i;

		}
		System.out.println("Fakultet av: " + tall + " = " + fakultet);

	}

}
