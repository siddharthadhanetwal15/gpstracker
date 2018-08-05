package and.com.gpstracker;

import com.google.firebase.database.IgnoreExtraProperties;

@IgnoreExtraProperties
public class Location
{
    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    private String latitude;

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    private String longitude;
    private String time;
}
