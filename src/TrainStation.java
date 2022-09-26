public class TrainStation {

    String name;
    TrainStation next;

    public TrainStation(String name) {
        this.name = name;
        this.next = null;
    } // constructor TrainStation

    public void setNext(TrainStation next) {
        this.next = next;
    }

    public String getName() {
        return this.name;
    }

    public boolean hasNext() {
        return this.next != null;
    }

    public TrainStation getNext() {
        return this.next;
    }
} // class TrainStation
