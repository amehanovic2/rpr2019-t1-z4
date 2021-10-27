package ba.unsa.etf.rpr;

import java.util.ArrayList;

public class Korpa {
    private final int maksimalnoUKorpi = 50;
    private ArrayList<Artikl> korpa = new ArrayList<>();
    public Artikl[] getArtikli() {
        return korpa.toArray(new Artikl [0]);
    }
    public int dajUkupnuCijenuArtikala() {
        int ukupnaCijena = 0;
        for(Artikl artikl : korpa)
            ukupnaCijena += artikl.getCijena();
        return ukupnaCijena;
    }
    public boolean dodajArtikl(Artikl artikl) {
        if(korpa.size() < maksimalnoUKorpi)
            return korpa.add(artikl);
        return false;
    }
    public Artikl izbaciArtiklSaKodom(String kod) {
        Artikl izbacenArtikl = null;
        for(Artikl artikl : korpa) {
            if (kod.equals(artikl.getKod())) {
                izbacenArtikl = artikl;
                korpa.remove(artikl);
                break;
            }
        }
        return izbacenArtikl;
    }

}
