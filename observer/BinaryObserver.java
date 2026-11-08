package observer;

public class BinaryObserver extends Observer {
    public BinaryObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);      // register with the subject
    }

    @Override
    public void update() {
        // "pull": ask the subject for its new state
        System.out.println("Binary: " + Integer.toBinaryString(subject.getState()));
    }
}
