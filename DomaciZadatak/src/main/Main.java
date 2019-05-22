package main;

import java.util.Date;
import java.util.Scanner;

import klasnitipovi.Predmet;
import klasnitipovi.Prijava;
import klasnitipovi.Student;

public class Main {

	public static Scanner in;
	public static final Predmet[] predmeti = new Predmet[6];
	public static final Student[] studenti = new Student[10];

	public static void main(String[] args) {
		Predmet osnoveProgramiranjaJava = new Predmet(111, "Osnove programiranja - Java");
		Predmet osnoveOOPJava = new Predmet(222, "Osnove objektno-orijentisanog programiranja - Java");
		Predmet osnoveBP = new Predmet(333, "Osnove razvoja baza podataka - MySQL");
		Predmet perzistenostPodataka = new Predmet(444, "Java tehnologije za perzistentnost podataka");
		Predmet vebAplikacije = new Predmet(555, "Osnove razvoja veb aplikacija");
		Predmet javaEEAplikacije = new Predmet(666, "Osnove razvoja Java EE aplikacija");
		predmeti[0] = osnoveProgramiranjaJava;
		predmeti[1] = osnoveOOPJava;
		predmeti[2] = osnoveBP;
		predmeti[3] = perzistenostPodataka;
		predmeti[4] = vebAplikacije;
		predmeti[5] = javaEEAplikacije;

		Student ivanIvanovic = new Student("001", 2019, "Ivan", "Ivanovic", new Date(1993, 7, 5));
		Student jovanJovanovic = new Student("002", 2018, "Jovan", "Jovanovic", new Date(1993, 7, 5));
		Student milosMarkovic = new Student("003", 2019, "Milos", "Markovic", new Date(1993, 7, 5));
		Student petarPetrovic = new Student("004", 2019, "Petar", "Petrovic", new Date(1993, 7, 5));
		Student zaranRadulovic = new Student("005", 2018, "Zoran", "Radulovic", new Date(1993, 7, 5));
		Student savaSavanovic = new Student("006", 2019, "Sava", "Savanovic", new Date(1993, 7, 5));
		Student ivicaMaric = new Student("007", 2017, "Ivica", "Maric", new Date(1993, 7, 5));
		Student nemanjaDjordjevic = new Student("008", 2019, "Nemanja", "Djordjevic", new Date(1993, 7, 5));
		Student igorBoskovic = new Student("009", 2019, "Igor", "Boskovic", new Date(1993, 7, 5));
		Student jankoVeselinovic = new Student("010", 2019, "Janko", "Veselinovic", new Date(1993, 7, 5));
		studenti[0] = ivanIvanovic;
		studenti[1] = jovanJovanovic;
		studenti[2] = milosMarkovic;
		studenti[3] = petarPetrovic;
		studenti[4] = zaranRadulovic;
		studenti[5] = savaSavanovic;
		studenti[6] = ivicaMaric;
		studenti[7] = nemanjaDjordjevic;
		studenti[8] = igorBoskovic;
		studenti[9] = jankoVeselinovic;

		in = new Scanner(System.in);

		boolean nastaviProgram = true;

		while (nastaviProgram) {
			System.out.println("1. Pregled\n2. Unos nove prijave\n3. Izmena\n4. Kraj programa.\nIzaberite opciju:");
			int opcija = in.nextInt();

			switch (opcija) {
			case 1:
				System.out.println("a. Pregled svih prijava\nb. Pregled svih studenata\nc. "
						+ "Pregled svih prijava za trazenog studenta\nd. Pregled svih studenata koji su polozili odredjeni predmet\ne. Povratak u glavni meni\nIzaberite opciju:");
				String podopcija = in.next();

				switch (podopcija) {
				case "a":
					pregledPredmeta();
					break;
				case "b":
					pregledStudenata();
					break;
				case "c":
					System.out.println("Unesite broj indeksa:");
					String brojIndeksa = in.next();
					pregledSvihPrijava(brojIndeksa);
					break;
				case "d":
					System.out.println("Unesite sifru predmeta:");
					int sifraPredmeta = in.nextInt();
					pregledStudenataKojiSuPolozili(sifraPredmeta);
					break;
				case "e":
					break;
				}
				break;
			case 2:
				System.out.println("Unesite sifru predmeta: ");
				int sifraPredmeta = in.nextInt();
				System.out.println("Unesite naziv predmeta: ");
				String brojIndeksa = in.next();
				System.out.println("Unesite datum polaganja(dd.mm.yyyy): ");
				String datumPolaganja = in.next();
				System.out.println("Unesite ocenu: ");
				int ocena = in.nextInt();
				Prijava novaPrijava = new Prijava(sifraPredmeta, brojIndeksa, new Date(1), ocena);
				Predmet prijavljenPredmet = null;
				Student studentPolozio = null;
				for (int i = 0; i < predmeti.length; i++) {
					if (sifraPredmeta == predmeti[i].getSifraPredmeta()) {
						prijavljenPredmet = predmeti[i];
					}
				}
				for (int i = 0; i < studenti.length; i++) {
					if (brojIndeksa.equals(studenti[i].getBrojIndeksa())) {
						studentPolozio = studenti[i];
					}
				}
				if (ocena > 5) {
					for (int i = 0; i < predmeti.length; i++) {
						if (prijavljenPredmet.equals(predmeti[i])) {
							predmeti[i].getStudentiKojiSuPolozili().add(studentPolozio);
						}
					}
				}
				for (int i = 0; i < studenti.length; i++) {
					if (studentPolozio.equals(studenti[i])) {
						studenti[i].getPrijavljeniIspiti().add(prijavljenPredmet);
					}
				}
				break;
			case 3:
				System.out.println("a. Izmena podataka o studentu\nb. Povratak u glavni meni\nIzaberite opciju:");
				String podopcija2 = in.next();
				
				switch(podopcija2) {
				case "a":
					System.out.println("Izaberite zeljenog studenta. Unesite broj indeksa:");
					String brojIndeksa2 = in.next();
					Student studentIzmena = null;
					for (int i = 0; i < studenti.length; i++) {
						if (brojIndeksa2.equals(studenti[i].getBrojIndeksa())) {
							studentIzmena = studenti[i];
						}
					}
					if(studentIzmena != null) {
						System.out.println("Unesite godinu upisa:");
						studentIzmena.setGodinaUpisa(in.nextInt());
					System.out.println("Unesite ime:");
					studentIzmena.setIme(in.next());
					System.out.println("Unesite prezime:");
					studentIzmena.setPrezime(in.next());
					System.out.println("Unesite datum rodjenja:");
					
					}
				}
				break;
			case 4:
				nastaviProgram = false;
				System.out.println("Kraj programa!");
				break;
			}
		}
	}

	public static void pregledPredmeta() {
		for (int i = 0; i < predmeti.length; i++) {
			System.out.println(i + ". " + predmeti[i]);
		}
	}

	public static void pregledStudenata() {
		for (int i = 0; i < studenti.length; i++) {
			System.out.println(i + ". " + studenti[i]);
		}
	}

	public static void pregledSvihPrijava(String brojIndeksa) {
		for (int i = 0; i < studenti.length; i++) {
			if (brojIndeksa.equals(studenti[i].getBrojIndeksa())) {
				System.out.println(studenti[i].getPrijavljeniIspiti());
			}
		}
	}

	public static void pregledStudenataKojiSuPolozili(int sifraPredmeta) {
		for (int i = 0; i < predmeti.length; i++) {
			if(sifraPredmeta == predmeti[i].getSifraPredmeta()) {
				System.out.println(predmeti[i].getStudentiKojiSuPolozili());
			}			
		}
	}

	public static void unosNovePrijave(int sifraPredmeta, String brojIndeksa, Date datumPolaganja, int ocena) {
		
	}

	public static void izmenaPodatakaOStudentu(Student student) {

	}
}
