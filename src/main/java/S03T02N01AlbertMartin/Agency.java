package S03T02N01AlbertMartin;

import S03T02N01AlbertMartin.Intefaces.Subject;

public class Observer implements S03T02N01AlbertMartin.Intefaces.Observer {

    private String name;
    //ref to the Subject class
    private Subject brokerNotice;

    public Observer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        String msg =(String)brokerNotice.getUpdate(this);
        if (msg == null) System.out.println(name + " No new message on this topic" );
        else System.out.println(name + " Retrieving message: "+msg);
    }

    @Override
    public void setSubject(Subject subject) {
        this.brokerNotice = subject;
    }

}
