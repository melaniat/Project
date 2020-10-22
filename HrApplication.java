package HOMEWORK;
import java.util.Scanner;

public class HrApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   String adminUsername = "admin";
	        String adminPassword = "admin";
	        String hrUsername = "hr";
	        String hrPassword = "hr";

	        Scanner scanner = new Scanner(System.in);

	        for (int incercari = 3; incercari > 0; ) {
	            System.out.println("Introduceti user:");
	            String username = scanner.nextLine();
	            System.out.println("Introduceti password:");
	            String password = scanner.nextLine();

	            incercari--;
	            if ((username.equals(adminUsername) && password.equals(adminPassword)) || (username.equals(hrUsername) && password.equals(hrPassword))) {
	                boolean esteInMeniuPrincipal = true;
	                System.out.println("Esti autentificat.");
//	               \n = new line
	                while (esteInMeniuPrincipal) {
	                    System.out.println("Alegeti una dintre optiuni:");
	                    System.out.println("" +
	                            "-1. Inchidere aplicatie\n" +
	                            "0. Delogare\n" +
	                            "1. Modul angajati\n" +
	                            "2. Modul performanta\n" +
	                            "3. Profil utilizator");

	                    int optiune = scanner.nextInt();
	                    scanner.nextLine();

	                    if (optiune == -1) {
	                        System.out.println("La revedere!");
	                        System.exit(0);
	                        return;
	                    } else if (optiune == 0) {
	                        incercari = 3;
	                        esteInMeniuPrincipal = false;
	                    } else if (optiune == 1) {
	                        boolean esteModulAngajati = true;
	                        String tabel = "header";
	                        tabel += "angajat citit de la tastatura";
	                        int totalMartie = 0;

	                        while (esteModulAngajati) {
	                            //citire detalii angajat

	                            //while (esteModulAngajatiOptiune) {
	                            // //optiuni
	                            //  1. adaugare angajat
	                            //  2. generare raport
	                            //  3. intoarcere la meniul anterior
	                            //     esteModulAngajatiOptiune = false;
	                            //     esteModulAngajati = false;
	                            // }
	                        }

	                    } else if (optiune == 2) {
	                        System.out.println("Performanta");
	                    } else if (optiune == 3) {

	                    }
	                }

	            } else if (incercari == 0) {
	                System.out.println("Papa");
	            } else if (incercari == 1) {
	                System.out.println("Mai ai o incercare.");
	            } else {
	                System.out.println("Mai ai " + incercari + " incercari.");// test
	            }
	        }
	    }
	
	}


