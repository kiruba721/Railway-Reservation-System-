 import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ReservationSystem rs = new ReservationSystem();
        Scanner sc = new Scanner(System.in);

        while(true) {

            System.out.println("\n===== Railway Reservation =====");
            System.out.println("1.Book Ticket");
            System.out.println("2.Cancel Ticket");
            System.out.println("3.View Ticket");
            System.out.println("4.Available Seats");
            System.out.println("5.Exit");

            System.out.print("Enter Choice : ");

            int choice = sc.nextInt();

            switch(choice) {

                case 1:
                    rs.bookTicket();
                    break;

                case 2:
                    rs.cancelTicket();
                    break;

                case 3:
                    rs.viewTicket();
                    break;

                case 4:
                    rs.availableSeats();
                    break;

                case 5:
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}

