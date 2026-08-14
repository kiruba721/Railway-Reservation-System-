
class Train {

    int trainNo;
    String trainName;
    int totalSeats;
    int availableSeats;

    Train(int trainNo, String trainName, int totalSeats) {
        this.trainNo = trainNo;
        this.trainName = trainName;
        this.totalSeats = totalSeats;
        this.availableSeats = totalSeats;
    }

    void displayTrain() {
        System.out.println("Train No : " + trainNo);
        System.out.println("Train Name : " + trainName);
        System.out.println("Available Seats : " + availableSeats);
    }
}