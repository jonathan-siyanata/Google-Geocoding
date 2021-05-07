package za.co.jaliatechologies.dto; 
import com.fasterxml.jackson.annotation.JsonProperty; 
import java.util.List; 
public class Result{
    @JsonProperty("address_components") 
    public List<AddressComponent> getAddress_components() { 
		 return this.address_components; } 
    public void setAddress_components(List<AddressComponent> address_components) { 
		 this.address_components = address_components; } 
    List<AddressComponent> address_components;
    @JsonProperty("formatted_address") 
    public String getFormatted_address() { 
		 return this.formatted_address; } 
    public void setFormatted_address(String formatted_address) { 
		 this.formatted_address = formatted_address; } 
    String formatted_address;
    @JsonProperty("geometry") 
    public Geometry getGeometry() { 
		 return this.geometry; } 
    public void setGeometry(Geometry geometry) { 
		 this.geometry = geometry; } 
    Geometry geometry;
    @JsonProperty("place_id") 
    public String getPlace_id() { 
		 return this.place_id; } 
    public void setPlace_id(String place_id) { 
		 this.place_id = place_id; } 
    String place_id;
    @JsonProperty("types") 
    public List<String> getTypes() { 
		 return this.types; } 
    public void setTypes(List<String> types) { 
		 this.types = types; } 
    List<String> types;
}
