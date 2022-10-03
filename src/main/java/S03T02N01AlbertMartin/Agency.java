package S03T02N01AlbertMartin;

import S03T02N01AlbertMartin.intefaces.Observer;

public class Agency implements Observer {

    private String agencyName;

    public Agency(String agencyName) {
        this.agencyName = agencyName;
    }

    @Override
    public void update(String stockIndex, String notice) {
    }

    @Override
    public String toString() {
        return agencyName;
    }
}
