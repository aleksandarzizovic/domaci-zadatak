# domaci-zadatak1
Evidencija prijavljenih i polozenih ispita studenata

Zadatak 1.

Data je niz u kome se čuvaju podaci o predmetima. Za svaki predmet čuvaju se sledeći podaci: 
  -Šifra predmeta (ceo broj)
  -Naziv predmeta (string)
Dat je niz u kome se nalaze studenti. Za svakog studenta čuvaju se sledeći podaci:
  -Broj indeksa studenta (string)
  -Godina upisa (ceo broj)
  -Ime studenta (string)
  -Prezime studenta (string)
  -Datum rođenja (datumski tip podataka)
Napraviti konzolnu aplikaciju sa sledećim korisničkim menijem:

  1.Pregled
    a.Pregled svih predmeta. Ukoliko korisnik odabere ovu opciju na ekranu se prikazuje spisak svih registrovanih predmeta u sistemu (unapred definisanom nizu).
    b.Pregled svih studenata. Ukoliko korisnik odabere ovu opciju na ekranu se prikazuje spisak svih studenata koji se nalaze u sistemu sistemu (unapred definisanom nizu).
    c.Pregled svih prijava za traženog studenta. Ukoliko korisnik odabere ovu opciju, sistem zahteva od korisnika da unese broj indeksa. Nakon unosa broja indeksa,  sistem prikazuje korisniku spisak svih prijava od traženog studenta. Ukoliko student ne postoji sistem prikazuje korisniku poruku da traženi student ne postoji.
    d.Prikaz svih studenata koji su položili određeni predmet. Ukoliko korisnik odabere ovu opciju, sistem zahteva od korisnika da unese šifru predmeta. Nakon unosa šifre predmeta,  sistem prikazuje korisniku spisak studenata koji su položili ovaj predmet. Ukoliko predmet ne postoji sistem prikazuje korisniku poruku da traženi predmet ne postoji. 
    e.Povratak u glavni meni
    
  2.Unos nove prijave.  Ukoliko korisnik izabere ovu opciju, sistem zahteva od korisnika da unese šifru predmeta, broj indeksa studenta, datum polaganja i ocenu  koji je student dobio na ispitu. Jedan student jedan predmet može da polaže više puta, ali samo jedna pozitivna ocena za jednog studenta i jedan predmet može biti evidentirana u sistemu. Pozitivna ocena je ocena koja je veća od 5. Ukoliko predmet i  student postoje u sistemu,  i ako student nije položio taj predmet prijava se evidentira u sistemu.
  
  3.Izmena
    a.Izmena podataka o studentu. Ukoliko korisnik izabere ovu opciju omogućiti korisniku da promeni podatke o željenom studentu.
    b.Povratak u glavni meni
    
  4.Kraj programa
