package com.inexture.address_service.model;

public class AddressBean {

    String home;
    String city;
    String state;
    String country;

    int uid;

    public AddressBean(String home, String city, String state, String country, int uid) {
        this.home = home;
        this.city = city;
        this.state = state;
        this.country = country;
        this.uid = uid;
    }

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    @Override
    public String toString() {
        return "AddressBean{" +
                "home='" + home + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                '}';
    }

}
