package S03T02N01AlbertMartin.Intefaces;

public interface Subject {

    void registerObserver (Observer observer);
    void unregisterObserver(Observer observer);
    void notifyAllObservers();

    Object getUpdate(Observer observer);
}
