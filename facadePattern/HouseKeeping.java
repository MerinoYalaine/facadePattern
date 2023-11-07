package facadePattern;

import facadePattern.HotelService;

public class HouseKeeping implements HotelService {

    private String roomNumber;

    public HouseKeeping(String roomNumber) {

        this.roomNumber = roomNumber;

    }

    public void cleanRoom(String roomNumber) {

        System.out.println("\nThe Cleaning Staff is on their way to clean " + roomNumber + ". Thank you for your patience.\n");

    }

    @Override
    public void execute() {

        cleanRoom(roomNumber);

    }

}
