package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SupermarketTest {

    @Test
    void dodajArtikl() {
        Supermarket supermarket = new Supermarket();
        Artikl artikl = new Artikl("Biciklo", 1000, "1");
        assertTrue(supermarket.dodajArtikl(artikl));
    }

    @Test
    void getArtikli() {
        Supermarket supermarket = new Supermarket();
        Artikl prviArtikl = new Artikl("Biciklo", 1000, "1");
        Artikl drugiArtikl = new Artikl("Biciklo", 1000, "2");
        Artikl treciArtikl = new Artikl("Biciklo", 1000, "3");
        supermarket.dodajArtikl(prviArtikl);
        supermarket.dodajArtikl(drugiArtikl);
        supermarket.dodajArtikl(treciArtikl);
        Artikl[] artikli = supermarket.getArtikli();
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
    void izbaciArtiklSaKodom() {
        Supermarket supermarket = new Supermarket();
        Artikl artikl = new Artikl("Biciklo", 1000, "1");
        supermarket.dodajArtikl(artikl);
        assertEquals(artikl, supermarket.izbaciArtiklSaKodom("1"));
    }
}