public class HotelRoom implements HotelRoomInterface {
    @Override
    public void book(String guestName) {
        Logger.getInstance().log("Booked a room for " + guestName);
    }

    @Override
    public void clean() {
        Logger.getInstance().log("Cleaned room");
    }
}
