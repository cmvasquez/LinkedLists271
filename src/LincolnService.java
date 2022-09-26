public class LincolnService {

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
            current.setNext(station);
        }
    }
}
