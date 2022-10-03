package S03T02N01AlbertMartin;

import S03T02N01AlbertMartin.intefaces.Observer;

public class App {

    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RESET = "\u001B[0m";

    public static void main(String[] args) {

        //Creem els Serveis de Notificacions:
        System.out.println();
        BrokerNotice ibex35 = new BrokerNotice("Ibex 35");
        BrokerNotice dowJones = new BrokerNotice("Dow Jones");

        //Creem les Agencies:
        Observer agency1 = new Agency("Agència de Borsa 1");
        Observer agency2 = new Agency("Agència de Borsa 2");
        Observer agency3 = new Agency("Agència de Borsa 3");

        //Donem d'alta a les Agències en els Serveis:
        ibex35.registerObserver(agency1);
        ibex35.registerObserver(agency2);

        dowJones.registerObserver(agency2);
        dowJones.registerObserver(agency3);

        //Enviem una notificaciò:
        System.out.println();
        ibex35.notice("l'index Ibex 35 " + ANSI_GREEN + "puja" + ANSI_RESET + ".");
        dowJones.notice("l'index Dow Jones " + ANSI_RED + "baixa" + ANSI_RESET + ".");

        //Donem de baixa dels serveis a dues Agències i enviem una nova notificació.
        System.out.println();
        ibex35.unregisterObserver(agency2);
        dowJones.unregisterObserver(agency3);

        System.out.println();
        ibex35.notice("l'index Ibex35 " + ANSI_RED + "baixa" + ANSI_RESET + ".");
        dowJones.notice("l'index Dow Jones " + ANSI_GREEN + "puja" + ANSI_RESET + ".");

    }
}
