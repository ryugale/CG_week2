class HotelBooking{
    String guestname, roomtype;
    int nights;

    HotelBooking(){
        this("bob","single room", 1);
    }
    HotelBooking(String guestname, String roomtype, int nights){
        this.guestname = guestname;
        this.roomtype = roomtype;
        this.nights = nights;
    }
    HotelBooking(HotelBooking previous){
        this.guestname = previous.guestname;
        this.roomtype = previous.roomtype;
        this.nights = previous.nights;
    }
    void displaydetails(){
        System.out.println("Name: "+guestname);
        System.out.println("Room Type: "+roomtype);
        System.out.println("Stay: "+nights+" nights");
    }
}

public class HotelBookingSystem {
    public static void main(String[] args) {
        HotelBooking hotel = new HotelBooking("Jawa", "single", 2);
        hotel.displaydetails();
        HotelBooking hotel2 = new HotelBooking(hotel);
        hotel2.displaydetails();
    }
}