package za.co.jaliatechologies.dto; 
import com.fasterxml.jackson.annotation.JsonProperty; 
public class Northeast{
    @JsonProperty("lat") 
    public double getLat() { 
		 return this.lat; } 
    public void setLat(double lat) { 
		 this.lat = lat; } 
    double lat;
    @JsonProperty("lng") 
    public double getLng() { 
		 return this.lng; } 
    public void setLng(double lng) { 
		 this.lng = lng; } 
    double lng;
}
