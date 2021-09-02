package com.smalaca.rentalapplication.domain.hotel;

import com.smalaca.rentalapplication.domain.apartment.Apartment;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Entity
@Table(name = "HOTEL")
@SuppressWarnings("PMD.UnusedPrivateField")
public class Hotel {
    @Id
    @GeneratedValue
    private UUID id;

    private String name;

    @Embedded
    private Address address;

    private Hotel() {}

    Hotel(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public String id() {
        return id.toString();
    }

    public static class Builder {
        private String name;
        private String street;
        private String postalCode;
        private String buildingNumber;
        private String city;
        private String country;

        private Builder(){}

        public static Builder hotel() {
            return new Builder();
        }

        public Builder widthName(final String name) {
            this.name = name;
            return this;
        }

        public Builder widthStreet(final String street) {
            this.street = street;
            return this;
        }

        public Builder widthPostalCode(final String postalCode) {
            this.postalCode = postalCode;
            return this;
        }

        public Builder widthBuildingNumber(final String buildingNumber) {
            this.buildingNumber = buildingNumber;
            return this;
        }

        public Builder widthCity(final String city) {
            this.city = city;
            return this;
        }

        public Builder widthCountry(final String country) {
            this.country = country;
            return this;
        }

        public Hotel build() {
            Address address = new Address(street, postalCode, buildingNumber, city, country);
            return new Hotel(name, address);
        }
    }
}
