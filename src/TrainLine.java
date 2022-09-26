public class TrainLine {

    TrainStation head;

    void addStation(String stationName) {
        TrainStation station = new TrainStation(stationName);
        if (head == null) {
            // First station in the line
            head = station;
        } else {
            // If there is a train station at the head
            TrainStation current = head;
            while (current.hasNext()) {
                current = current.getNext();
            }

            // current is last station because it's next is null
            current.setNext(station);
            // current now has a != null value. It points to a new station
            // The new station has a next == null.
        }
    }
}
