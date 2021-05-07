package za.co.jaliatechologies.dto; 
import com.fasterxml.jackson.annotation.JsonProperty; 
public class Geometry{
    @JsonProperty("bounds") 
    public Bounds getBounds() { 
		 return this.bounds; } 
    public void setBounds(Bounds bounds) { 
		 this.bounds = bounds; } 
    Bounds bounds;
    @JsonProperty("location") 
    public Location getLocation() { 
		 return this.location; } 
    public void setLocation(Location location) { 
		 this.location = location; } 
    Location location;
    @JsonProperty("location_type") 
    public String getLocation_type() { 
		 return this.location_type; } 
    public void setLocation_type(String location_type) { 
		 this.location_type = location_type; } 
    String location_type;
    @JsonProperty("viewport") 
    public Viewport getViewport() { 
		 return this.viewport; } 
    public void setViewport(Viewport viewport) { 
		 this.viewport = viewport; } 
    Viewport viewport;
}
