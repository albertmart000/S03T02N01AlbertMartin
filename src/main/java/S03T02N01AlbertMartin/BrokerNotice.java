package S03T02N01AlbertMartin;

import S03T02N01AlbertMartin.intefaces.Observer;
import S03T02N01AlbertMartin.intefaces.Subject;

import java.util.ArrayList;
import java.util.List;

public class BrokerNotice implements Subject {

    private List<Observer> agencies;
    private String stockIndex;

    public BrokerNotice(String stockIndex) {
        this.stockIndex = stockIndex;
        agencies = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        agencies.add(observer);
        System.out.println("L'" + observer+ " està seguint l'index " + stockIndex + ".");
    }

    @Override
    public void unregisterObserver(Observer observer) {
        agencies.remove(observer);
        System.out.println("L'" + observer + " ha deixat de seguir l'index " + stockIndex + ".");
    }

    @Override
    public void notifyAllObservers(String notice) {
        for (Observer agency : agencies) {
            agency.update(stockIndex, notice);
        }
    }

    public void notice (String notice){
        System.out.println("El Servei de Notificacions " + stockIndex + " ha notificat a les agències " +
                agencies + " que " + notice);
            notifyAllObservers(notice);
        }
}


