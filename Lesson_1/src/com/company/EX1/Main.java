package com.company.EX1;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Main.Address address = new Main.Address(100700, Main.Country.RUSSIA, "Nizhniy", "Pushkina", 1, 2);
        System.out.println(address.toString());
    }

    public static class Address {
        private int index;
        private Main.Country country;
        private String city;
        private String street;
        private int house;
        private int apartment;

        public String toString() {
            return String.format("index: %d, country: %s, etc", this.index, this.country.title);
        }

        public Address(int index, Main.Country country, String city, String street, int house, int apartment) {
            this.index = index;
            this.country = country;
            this.city = city;
            this.street = street;
            this.house = house;
            this.apartment = apartment;
        }

        public int getIndex() {
            return this.index;
        }

        public void setIndex(int index) {
            this.index = index;
        }

        public Main.Country getCountry() {
            return this.country;
        }

        public void setCountry(Main.Country country) {
            this.country = country;
        }

        public String getCity() {
            return this.city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getStreet() {
            return this.street;
        }

        public void setStreet(String street) {
            this.street = street;
        }

        public int getHouse() {
            return this.house;
        }

        public void setHouse(int house) {
            this.house = house;
        }

        public int getApartment() {
            return this.apartment;
        }

        public void setApartment(int apartment) {
            this.apartment = apartment;
        }
    }

    public static enum Country {
        RUSSIA("Russia"),
        UKRAINE("Ukraine"),
        USA("USA"),
        OTHER("OTHER");

        private String title;

        private Country(String title) {
            this.title = title;
        }

        public String getTitle() {
            return this.title;
        }
    }
}

