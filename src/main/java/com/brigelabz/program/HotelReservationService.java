package com.brigelabz.program;

import java.util.ArrayList;
import java.util.List;

public class HotelReservationService {
    static List<Hotel> list=new ArrayList<>();


    public static boolean addHotel(Hotel hotel) {
        list.add(hotel);
        return true;
    }
}


