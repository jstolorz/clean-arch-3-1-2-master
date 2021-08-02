package com.smalaca.rentalapplication.application.commandregistry;

import com.smalaca.rentalapplication.application.booking.BookingAccept;
import com.smalaca.rentalapplication.application.booking.BookingReject;

public interface CommandRegistry {
    void register(BookingReject bookingReject);

    void register(BookingAccept bookingAccept);
}
