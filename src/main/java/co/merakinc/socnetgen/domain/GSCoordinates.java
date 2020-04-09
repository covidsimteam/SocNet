package co.merakinc.socnetgen.domain;

/*
* Value object for geo-spatial coordinates, used mainly for aggregate latitude and longitude
* */
public class GSCoordinates {

    private Long longitude;
    private Long latitude;

    public Long getLongitude() {
        return longitude;
    }

    public Long getLatitude() {
        return latitude;
    }

    public GSCoordinates(Long longitude, Long latitude) {
        this.longitude = longitude;
        this.latitude = latitude;
    }

    @Override
    public String toString() {
        return "GSCoordinates{" +
                "longitude=" + longitude +
                ", latitude=" + latitude +
                '}';
    }
}
