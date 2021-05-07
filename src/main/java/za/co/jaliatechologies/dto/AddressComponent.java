package za.co.jaliatechologies.dto; 
import com.fasterxml.jackson.annotation.JsonProperty; 
import java.util.List; 
public class AddressComponent{
    @JsonProperty("long_name") 
    public String getLong_name() { 
		 return this.long_name; } 
    public void setLong_name(String long_name) { 
		 this.long_name = long_name; } 
    String long_name;
    @JsonProperty("short_name") 
    public String getShort_name() { 
		 return this.short_name; } 
    public void setShort_name(String short_name) { 
		 this.short_name = short_name; } 
    String short_name;
    @JsonProperty("types") 
    public List<String> getTypes() { 
		 return this.types; } 
    public void setTypes(List<String> types) { 
		 this.types = types; } 
    List<String> types;
}
