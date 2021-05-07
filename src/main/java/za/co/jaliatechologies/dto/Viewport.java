package za.co.jaliatechologies.dto; 
import com.fasterxml.jackson.annotation.JsonProperty; 
public class Viewport{
    @JsonProperty("northeast") 
    public Northeast getNortheast() { 
		 return this.northeast; } 
    public void setNortheast(Northeast northeast) { 
		 this.northeast = northeast; } 
    Northeast northeast;
    @JsonProperty("southwest") 
    public Southwest getSouthwest() { 
		 return this.southwest; } 
    public void setSouthwest(Southwest southwest) { 
		 this.southwest = southwest; } 
    Southwest southwest;
}
