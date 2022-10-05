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
    } // method lineHasStation

    public void insertBefore(string beforeName, String newName){

    }

    public void insertAfter(String afterName, String newName){

    }


    public void delete(String name) {
        if (this.head.getName().equals(name)) {
            // Deleting the head
            TrainStation oldHeadPointsTo = this.head.getNext();
            this.head.setNext(null);
            this.head = oldHeadPointsTo;
        } else {
            // Traverse line and find station prior to one to be deleted
            TrainStation previous = this.head;
            while ( (!previous.getNext().getName().equals(name)) && previous.hasNext() ) {
                previous = previous.getNext();
            }
            // The while loop ends if previous does not have next or if it does not have a name
            previous.setNext(previous.getNext().getNext());
            //               -----------------
            //               station to delete
            //               ----------------------------
            //                      station after station
            //                       to delete
        }
    } // method delete

} // class TrainLine
