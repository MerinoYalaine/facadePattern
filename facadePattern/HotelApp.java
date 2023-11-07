package facadePattern;

import facadePattern.FrontDesk;

import java.util.Scanner;
public class HotelApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String plateNumber = null;
        String roomNumber = null;
        int numberofCarts = 0;

        while (true) {

            System.out.println("Hello! Welcome to Sylvatica Hotel! How may I help you?");
            System.out.println("1. Pick Up Vehicle");
            System.out.println("2. Room Cleaning Service");
            System.out.println("3. facadePattern.Cart Request");
            System.out.println("4. Turn Off");
            System.out.print("Pick Option Number: ");
            String menu = scanner.nextLine();

            switch (menu) {

                case "1":

                    System.out.print("\nPlease enter your vehicle's plate number: ");
                    plateNumber = scanner.nextLine();

                    HotelService valetService = new Valet(plateNumber);
                    FrontDesk.execute(valetService);

                    break;

                case "2":

                    System.out.print("\nPlease enter your room number: ");
                    roomNumber = scanner.nextLine();

                    HotelService housekeepingService = new HouseKeeping(roomNumber);
                    FrontDesk.execute(housekeepingService);

                    break;

                case "3":

                    System.out.print("\nPlease enter how many carts needed: ");
                    numberofCarts = scanner.nextInt();

                    HotelService cartService = new Cart(numberofCarts);
                    FrontDesk.execute(cartService);

                    break;

                case "4":

                    System.exit(0);

                    break;

                default:

                    System.out.println("Invalid option, please try again!");

                    break;

            }

        }

    }

}
