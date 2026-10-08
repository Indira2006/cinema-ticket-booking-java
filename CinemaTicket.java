package College;

import java.util.*;

public class CinemaTicket {
	
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] shows = {"Morning","Afternoon","Evening"};
        String[] seats = {
                "A1","A2","A3","A4","A5",
                "B1","B2","B3","B4","B5",
                "C1","C2","C3","C4","C5" };

        boolean[] booked = new boolean[seats.length];

        int ticketPrice = 200;
        int choice = 0;
        while(choice != 4){

            System.out.println("\n******** CINEMA BOOKING SYSTEM ********");
            System.out.println("1. View Seats");
            System.out.println("2. Book Ticket");
            System.out.println("3. Seat Status");
            System.out.println("4. Exit");

            System.out.print("Enter Choice: ");
            choice = in.nextInt();

            if(choice == 1){

                System.out.println("\nSeat Layout");

                for(int i=0;i<seats.length;i++){

                    if(booked[i])
                        System.out.println(seats[i] + " - Booked");
                    else
                        System.out.println(seats[i] + " - Available");
                }
            }

            else if(choice == 2){

                System.out.println("\nSelect Movie Category");
                System.out.println("1. Adventure");
                System.out.println("2. Action");
                System.out.println("3. Comedy");
                System.out.println("4. Horror");

                int category = in.nextInt();

                String movie = "";

                if(category == 1){

                    System.out.println("\nAdventure Movies");
                    System.out.println("1. Avengers");
                    System.out.println("2. Jurassic World");
                    System.out.println("3. Indiana Jones");

                    int m = in.nextInt();

                    if(m==1) movie="Avengers";
                    else if(m==2) movie="Jurassic World";
                    else movie="Indiana Jones";
                }

                else if(category == 2){

                    System.out.println("\nTamil Movies");
                    System.out.println("1. Good Bad Ugly");
                    System.out.println("2. With Love");
                    System.out.println("3. Youth");

                    int m = in.nextInt();

                    if(m==1) movie="Good Bad Ugly";
                    else if(m==2) movie="With Love";
                    else movie="Youth";
                }

                else if(category == 3){

                    System.out.println("\nEnglish Movies");
                    System.out.println("1. Titanic");
                    System.out.println("2. Aventures");
                    System.out.println("3. Men In Black");

                    int m = in.nextInt();

                    if(m==1) movie="Titanic";
                    else if(m==2) movie="Aventures";
                    else movie="Men In Black";
                }

                else{

                    System.out.println("\nMalayalam Movies");
                    System.out.println("1. Premam");
                    System.out.println("2. Hridayam");
                    System.out.println("3. Premalu");

                    int m = in.nextInt();

                    if(m==1) movie="Premam";
                    else if(m==2) movie="Hridayam";
                    else movie="Premalu";
                }


                System.out.println("\nSelect Show Time");

                for(int i=0;i<shows.length;i++){
                    System.out.println((i+1)+". "+shows[i]);
                }

                int showChoice = in.nextInt();
                String show = shows[showChoice-1];


                System.out.print("\nEnter Number of Tickets: ");
                int tickets = in.nextInt();

                int total = tickets * ticketPrice;


                System.out.println("\nAvailable Seats");

                for(int i=0;i<seats.length;i++){

                    if(!booked[i])
                        System.out.print(i+"-"+seats[i]+" ");
                }

                System.out.println("\nSelect Seat Index");

                String selectedSeats = "";

                for(int i=0;i<tickets;i++){
                	
                    int seatChoice = in.nextInt();
                    
                    if(seatChoice>=0 && seatChoice<seats.length){
                        if(!booked[seatChoice]){
                            booked[seatChoice] = true;
                            selectedSeats += seats[seatChoice]+" ";
                            System.out.println("Seat "+seats[seatChoice]+" booked");
                       
                        }
                        else{

                            System.out.println("Seat already booked, choose another");
                            i--;
                        }
                    }

                    else{

                        System.out.println("Invalid seat number");
                        i--;
                    }
                }
                
                System.out.println("\n******** BOOKING RECEIPT ********");
                System.out.println("Movie : "+movie);
                System.out.println("Show Time : "+show);
                System.out.println("Seats : "+selectedSeats);
                System.out.println("Ticket Price : "+ticketPrice);
                System.out.println("Tickets : "+tickets);
                System.out.println("Total Amount : "+total);

                System.out.println("\nBooking Successful!");
            }

            else if(choice == 3){

                System.out.println("\nSeat Status");

                for(int i=0;i<seats.length;i++){

                    if(booked[i])
                        System.out.println(seats[i]+" - Booked");
                    else
                        System.out.println(seats[i]+" - Available");
                }
            }

            else if(choice == 4){

                System.out.println("\nThank you.");
            }

            else{

                System.out.println("Invalid Choice");
            }
        }
    }
}
