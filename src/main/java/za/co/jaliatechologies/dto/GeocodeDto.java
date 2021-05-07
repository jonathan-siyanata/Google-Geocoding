package za.co.jaliatechologies.dto; 
import com.fasterxml.jackson.annotation.JsonProperty; 
import java.util.List; 
public class GeocodeDto {
    @JsonProperty("results") 
    public List<Result> getResults() { 
		 return this.results; } 
    public void setResults(List<Result> results) { 
		 this.results = results; } 
    List<Result> results;
    @JsonProperty("status") 
    public String getStatus() { 
		 return this.status; } 
    public void setStatus(String status) { 
		 this.status = status; } 
    String status;
}
