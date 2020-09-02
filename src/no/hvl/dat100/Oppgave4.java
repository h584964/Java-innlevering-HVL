package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

import static java.lang.Double.*;

public class Oppgave4 {

	public static void main(String[] args) {

		double brutto = Double.parseDouble(showInputDialog("Skriv inn bruttoinntekten"));

		double T0 = brutto * 1;
		double T1 = brutto * 0.019;
		double T2 = brutto * 0.042;
		double T3 = brutto * 0.132;
		double T4 = brutto * 0.162;

		if (brutto < 180800) {
			System.out.println("Betaler ikke trinnskatt ");
		}

		else if (brutto > 180800 && brutto < 254500) {
			System.out.println("Trinnskatt nr. 1:  " + T1);
		}

		else if (brutto > 254500 && brutto < 639750) {
			System.out.println("Trinnskatt nr. 2:  " + T2);
		}

		else if (brutto > 639750 && brutto < 999550) {
			System.out.println("Trinnskatt nr. 3:  " + T3);
		}

		else if (brutto > 999550) {
			System.out.println("Trinnskatt nr. 4:  " + T4);
		}

	}

}
