/**
 * Represents a location with latitude and longitude as instance variables.
 */
public class Location {
    //instance variables
    /**
     * Latitude of the location.
     * Only accessible within this class.
     */
    private double latitude;
    /**
     * Longitude of the location.
     * Only accessible within this class
     */
    private double longitude;

    // constructor to create a Location object
    /**
     * Creates a location with the given latitude and longitude.
     * @param latitude given latitude of the location
     * @param longitude given longitude of the location
     */
    public Location(double latitude, double longitude){
        this.latitude = latitude;
        this.longitude = longitude;
    }

    //getters and setters for private instance variable latitude
    /**
     * Gets the latitude of the location.
     * @return latitude
     */
    public double getLatitude(){
        return latitude;
    }

    /**
     * Sets the latitude of the location.
     * @param latitude the latitude to set
     */
    public void setLatitude(double latitude){
        this.latitude = latitude;
    }

    // getters and setters for private instance variable longitude
    /**
     * Gets the longitude of the location.
     * @return longitude
     */
    public double getLongitude(){
        return longitude;
    }

    /**
     * Sets the longitude of the location.
     * @param longitude the longitude to set
     */
    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
}
