package facadePattern;

public class FrontDesk {

    private HotelService hotelService;

    public FrontDesk(HotelService hotelService) {

        this.hotelService = hotelService;

    }

    public static void execute(HotelService hotelService) {

        hotelService.execute();

    }

}
