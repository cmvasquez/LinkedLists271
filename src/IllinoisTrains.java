public class IllinoisTrains {

    public static void main(String[] args) {

        TrainLine redLine = new TrainLine();
        redLine.addStation("Howard");
        redLine.addStation("Jarvis");
        redLine.addStation("Morse");
        redLine.addStation("Loyola");
        redLine.addStation("Granville");

        System.out.println(redLine.lineHasStation("Granville"));
    } // method main
} // class IllinoisTrains
