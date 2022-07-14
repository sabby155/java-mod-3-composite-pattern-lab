public class HotelManager {
    public static void main(String[] args) {
        Logger.getInstance().log("Managing hotel...");

        // create hotel rooms
        HotelRoom hotelRoomOne = new HotelRoom();
        HotelRoom hotelRoomTwo = new HotelRoom();

        hotelRoomOne.book("Stacy");
        hotelRoomTwo.book("Max");
        hotelRoomOne.clean();
        hotelRoomTwo.clean();

        // create hotel floors

        HotelFloor hotelFloorOne = new HotelFloor();

        // add hotel rooms to hotel floors

        hotelFloorOne.addHotelRoom(hotelRoomOne);
        hotelFloorOne.addHotelRoom(hotelRoomTwo);

        // take actions on rooms and floors and examine your output to ensure you implemented the desired
        // behaviors

        hotelFloorOne.removeHotelRoom(hotelRoomTwo);
    }
}
