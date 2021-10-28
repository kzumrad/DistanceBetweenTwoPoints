/**
 * Represents a distance between two locations.
 */
public class Distance {

    //instance variables
    /**
     * First location.
     */
    private Location loc1;
    /**
     * Second location.
     */
    private Location loc2;

    // distance constructor
    /**
     * Creates a Distance object with two given locations.
     * @param location1 first location
     * @param location2 second location
     */
    public Distance(Location location1, Location location2){
        this.loc1 = location1;
        this.loc2 = location2;
    }
    // calculating the distance between loc1 and loc2

    /**
     * Calculates the distance between the two locations.
     * @return distance between the two locations
     */
    public double CalcDist(){
        // radius of the Earth in meters
        double rad = 6378*1000;
        // extracting the latitude and the longitude of the first location
        double lat1 = loc1.getLatitude();
        double lon1 = loc1.getLongitude();
        //extracting the latitude and the longitude of the second location
        double lat2 = loc2.getLatitude();
        double lon2 = loc2.getLongitude();
        // calculating the distance
        double dlon = Math.toRadians(lon2 - lon1);
        double dlat = Math.toRadians(lat2 - lat1);
        double a = Math.pow(Math.sin(dlat/2.0), 2) + Math.cos(Math.toRadians(lat1))*Math.cos(Math.toRadians(lat2))*Math.pow(Math.sin(dlon/2.0), 2);
        double c = 2.0*Math.atan2(Math.sqrt(a),Math.sqrt(1.0-a));
        double distance  = rad*c;
        return distance;
    }
}
