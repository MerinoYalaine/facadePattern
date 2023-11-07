package facadePattern;

import facadePattern.HotelService;

public class Valet implements HotelService {

    private String plateNumber;

    public Valet(String plateNumber) {

        this.plateNumber = plateNumber;

    }

    public void pickUpVehicle(String plateNumber) {

        System.out.println("\nThe facadePattern.Valet is on their way to pick up " + plateNumber + ", please wait in the Lobby. Thank you for your patience.\n");

    }

    @Override
    public void execute() {

        pickUpVehicle(plateNumber);

    }

}
