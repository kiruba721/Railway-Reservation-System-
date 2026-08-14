import java.util.ArrayList;
import java.util.Scanner;

class ReservationSystem {

    ArrayList<Ticket> tickets = new ArrayList<>();

    Train train = new Train(12637, "Pandian Express", 5);

    Scanner sc = new Scanner(System.in);

    int pnr = 1001;

    void bookTicket() {

        if(train.availableSeats == 0) {
            System.out.println("No Seats Available");
            return;
        }

        System.out.print("Passenger ID : ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Name : ");
        String name = sc.nextLine();

        System.out.print("Age : ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Gender : ");
        String gender = sc.nextLine();

        System.out.print("Source : ");
        String source = sc.nextLine();

        System.out.print("Destination : ");
        String destination = sc.nextLine();

        Passenger p = new Passenger(id,name,age,gender);

        Ticket t = new Ticket(pnr,p,source,destination);

        tickets.add(t);

        train.availableSeats--;

        System.out.println("Ticket Booked Successfully");
        System.out.println("PNR : " + pnr);

        pnr++;
    }

    void cancelTicket() {

        System.out.print("Enter PNR : ");
        int no = sc.nextInt();

        for(int i=0;i<tickets.size();i++) {

            if(tickets.get(i).pnr==no) {

                tickets.remove(i);

                train.availableSeats++;

                System.out.println("Ticket Cancelled");

                return;
            }
        }

        System.out.println("Invalid PNR");
    }

    void viewTicket() {

        System.out.print("Enter PNR : ");
        int no = sc.nextInt();

        for(Ticket t : tickets) {

            if(t.pnr==no) {

                System.out.println("PNR : "+t.pnr);
                System.out.println("Passenger : "+t.passenger.name);
                System.out.println("Age : "+t.passenger.age);
                System.out.println("Gender : "+t.passenger.gender);
                System.out.println("From : "+t.source);
                System.out.println("To : "+t.destination);

                return;
            }
        }

        System.out.println("Ticket Not Found");
    }

    void availableSeats() {
        train.displayTrain();
    }

}