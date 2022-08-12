package com.brigelabz.program;

public class HotelReservationSystemMain {
    public static void main(String[] args) {
        System.out.println("-------Welcome to Hotel Reservation System-----");
        HotelReservationService hotelReservationService = new HotelReservationService();
        hotelReservationService.addHotel(new Hotel("Lakewood", 150));
    }
}
