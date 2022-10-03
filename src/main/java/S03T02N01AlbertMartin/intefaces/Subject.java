package S03T02N01AlbertMartin.intefaces;

public interface Subject {

    void registerObserver (Observer observer);
    void unregisterObserver(Observer observer);
    void notifyAllObservers(String string);


}
