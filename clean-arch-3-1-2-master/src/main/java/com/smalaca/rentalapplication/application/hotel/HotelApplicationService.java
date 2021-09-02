package com.smalaca.rentalapplication.application.hotel;

import com.smalaca.rentalapplication.domain.hotel.Hotel;
import com.smalaca.rentalapplication.domain.hotel.HotelRepository;
import org.springframework.stereotype.Service;

@Service
public class HotelApplicationService {
    private final HotelRepository hotelRepository;

    public HotelApplicationService(HotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }

    public void add(HotelDto hotelDto) {

        Hotel hotel = Hotel.Builder.hotel()
                        .widthName(hotelDto.getName())
                        .widthStreet(hotelDto.getStreet())
                        .widthPostalCode(hotelDto.getPostalCode())
                        .widthBuildingNumber(hotelDto.getBuildingNumber())
                        .widthCity(hotelDto.getCity())
                        .widthCountry(hotelDto.getCountry())
                        .build();


        hotelRepository.save(hotel);
    }
}
