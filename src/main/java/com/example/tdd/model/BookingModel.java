package com.example.tdd.model;
import lombok.Getter;

import java.time.LocalDate;

@Getter
public class BookingModel {
    private String id;
    private String reserveName;
    private LocalDate checkIn;
    private LocalDate checkout;
    private int numberGuests;

    public BookingModel(final String id, final String reserveName, final LocalDate checkIn, final LocalDate checkout, final int numberGuests) {
        this.id = id;
        this.reserveName = reserveName;
        this.checkIn = checkIn;
        this.checkout = checkout;
        this.numberGuests = numberGuests;
    }

}
