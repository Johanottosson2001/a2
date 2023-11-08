import java.util.Scanner;


public class App {
   public static void main(String[] args) {
       Scanner myScanner = new Scanner(System.in);
       Passenger[] passengerManifest = new Passenger[12];


       int input = 0;


       // !=7, as long as 7 is not entered, it will run.
       while (input != 7) {


           System.out.println("What would you like to do?");
           System.out.println("1. Insert Passenger");
           System.out.println("2. Remove Passenger");
           System.out.println("3. Switch Seats");
           System.out.println("4. Rename Passenger");
           System.out.println("5. Count Passengers");
           System.out.println("6. Print Passenger Manifest");
           System.out.println("7. Quit");
           input = myScanner.nextInt();


           // 1. Insert passenger
           if (input == 1) {
               System.out.println("What is the passenger's name?");
               String name = myScanner.next();
               System.out.println("What is the passengers's age?");
               int age = myScanner.nextInt();
               for (int i = 0; i < passengerManifest.length; i++) {
                   if (passengerManifest[i] == null) {
                       passengerManifest[i] = new Passenger(name, age);


                       System.out.println("Passenger inserted\n");
                       break;
                   }
               }


           }


           // 2. Remove Passenger


           if (input == 2) {
               System.out.println("Please enter the seat number of the passenger you wish to remove");
               int seatNumber = myScanner.nextInt();
               passengerManifest[seatNumber - 1] = null;


           }


        // 3. Switch Seats
        else if (input == 3) {
           System.out.println("Please enter the seat number of the first passenger you wish to switch:");
           int seatNumber1 = myScanner.nextInt();
           System.out.println("Please enter the seat number of the second passenger you wish to switch:");
           int seatNumber2 = myScanner.nextInt();


           Passenger temp = passengerManifest[seatNumber1 - 1];
           passengerManifest[seatNumber1 - 1] = passengerManifest[seatNumber2 - 1];
           passengerManifest[seatNumber2 - 1] = temp;


           System.out.println("Passengers in seats " + seatNumber1 + " and " + seatNumber2 + " have been switched.\n");
       }
          


          


           // 4. Rename Passenger
           else if (input == 4) {
               System.out.println("Please enter the seat number of the passenger you wish to rename:");
               int seatNumber = myScanner.nextInt();
               System.out.println("Please enter the new name of the passenger:");
               String newName = myScanner.next();
               passengerManifest[seatNumber - 1].setName(newName);




           }
           // 5. Count passengers
           else if (input == 5) {


               int passengerCount = 0;
               for (Passenger passenger : passengerManifest) {
                   if (passenger != null) {
                       passengerCount++;
                   }
               }
               System.out.println("Total passengers: " + passengerCount + "\n");


           }


                    // 6. Print Passenger Manifest
                    else if (input == 6) {
                       System.out.println("##### PASSENGER MANIFEST ##### \nSkyBox Ltd. ");
                       System.out.println("Seat: \t     " + "Name: \t " + "Age: \t   ");
                       for (int i = 0; i < passengerManifest.length; i++) {
                           if (passengerManifest[i] != null) {
                               System.out.println((i + 1) + "\t     " + passengerManifest[i].getName() + "\t " + passengerManifest[i].getAge());
                           }
                       else {
                           System.out.println(i+1);
                       }


                       }
                       System.out.println("##### ##### ##### ##### #####\n");
                   }
      


           // 7. Quit
           else if (input == 7) {


               System.out.println("<Program terminated>");


          
          
      
      


       myScanner.close();
           }
          
      
       }




}
  
   }




