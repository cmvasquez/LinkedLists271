public class TrainLine {
    /** The only field of this class !!!!*/
    private TrainStation head;

    void addStation(String stationName) {
        TrainStation station = new TrainStation(stationName);
        if (head == null) {
            // First station in the line
            head = station;
        } else {
            // If there is no station in the line yet, new station becomes head
            TrainStation current = head;
            while (current.hasNext()) {
                current = current.getNext();
            }

            // Loop ends when current @ end of line; add the new station here
            current.setNext(station);
            // current now has a != null value. It points to a new station
            // The new station has a next == null.
        }
    } // method addStation


    public boolean lineHasStation(String name) {
        boolean found = false;
        TrainStation current = this.head;
        while (!found && current != null) {
            found = current.getName().equalsIgnoreCase(name);
            current = current.getNext();
        }
        return found;
    }
}
