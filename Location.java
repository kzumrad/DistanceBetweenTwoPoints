public class Location {
    // creating the member variables of the object Location
    private double latitude;
    private double longitude;
    // constructor to create a Location object
    public Location(double lat, double lon){
        this.latitude = lat;
        this.longitude = lon;
    }
    //obtaining the latitude
    public double getLatitude(){
        return latitude;
    }
    // obtaining the longitude
    public double getLongitude(){
        return longitude;
    }


}
