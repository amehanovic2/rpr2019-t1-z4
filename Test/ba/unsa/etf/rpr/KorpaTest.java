package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KorpaTest {

    @Test
    void getArtikli() {
        Korpa korpa = new Korpa();
        Artikl prviArtikl = new Artikl("Biciklo", 1000, "1");
        Artikl drugiArtikl = new Artikl("Biciklo", 1000, "2");
        Artikl treciArtikl = new Artikl("Biciklo", 1000, "3");
        korpa.dodajArtikl(prviArtikl);
        korpa.dodajArtikl(drugiArtikl);
        korpa.dodajArtikl(treciArtikl);
        Artikl[] artikli = korpa.getArtikli();
        Artikl[] provjeraArtikala = {prviArtikl, drugiArtikl, treciArtikl};
        int brojacIstihArtikala = 0;
        for (Artikl a1 : provjeraArtikala) {
            for (Artikl a2 : artikli) {
                if (a1.equals(a2))
                    brojacIstihArtikala = brojacIstihArtikala + 1;
            }
        }
        assertEquals(provjeraArtikala.length, brojacIstihArtikala);
    }

    @Test
    void dajUkupnuCijenuArtikala() {
        Korpa korpa = new Korpa();
        korpa.dodajArtikl(new Artikl("Biciklo", 1000, "1"));
        korpa.dodajArtikl(new Artikl("Biciklo", 1000, "2"));
        assertEquals(2000, korpa.dajUkupnuCijenuArtikala());
    }

    @Test
    void dodajArtikl() {
        Korpa korpa = new Korpa();
        Artikl artikl = new Artikl("Biciklo", 1000, "1");
        assertTrue(korpa.dodajArtikl(artikl));
    }

    @Test
    void izbaciArtiklSaKodom() {
        Korpa korpa = new Korpa();
        Artikl artikl = new Artikl("Biciklo", 1000, "1");
        korpa.dodajArtikl(artikl);
        assertEquals(artikl, korpa.izbaciArtiklSaKodom("1"));
    }
}