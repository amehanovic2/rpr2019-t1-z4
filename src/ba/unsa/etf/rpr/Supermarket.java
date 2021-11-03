package ba.unsa.etf.rpr;

import java.util.ArrayList;

public class Supermarket {
    private final int maksimalnoUSupermarketu = 1000;
    private ArrayList<Artikl> supermarket = new ArrayList<>();
    public boolean dodajArtikl(Artikl artikl) {
        if(supermarket.size() < maksimalnoUSupermarketu)
            return supermarket.add(artikl);
        return false;
    }
    public Artikl[] getArtikli() {
        return supermarket.toArray(new Artikl[0]);
    }
    public Artikl izbaciArtiklSaKodom(String kod) {
        Artikl izbacenArtikl = null;
        for(Artikl artikl : supermarket) {
            if (kod.equals(artikl.getKod())) {
                izbacenArtikl = artikl;
                supermarket.remove(artikl);
                break;
            }
        }
        return izbacenArtikl;
    }
}
