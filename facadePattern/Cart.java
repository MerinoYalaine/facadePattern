package facadePattern;

import facadePattern.HotelService;

public class Cart implements HotelService {

    private int numberofCarts;

    public Cart(int numberofCarts) {

        this.numberofCarts = numberofCarts;

    }

    public void requestCart(int numberofCarts) {

        System.out.println("\n" + numberofCarts + " amount of carts will be sent to you shortly. Thank you for your patience.\n");

    }

    @Override
    public void execute() {

        requestCart(numberofCarts);

    }

}
