package com.brigelabz.program;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class HotelReservationTest {
   static HotelReservationService hotelReservationService;
   @BeforeAll
   static  void  initialize() {
      hotelReservationService = new HotelReservationService();
   }
      @Test
      void givenHotelName_ShouldBe_AddedToHotelList(){
      boolean result = HotelReservationService.addHotel(new Hotel("Lakewood",150));
         Assertions.assertTrue(result);
      }
   }

