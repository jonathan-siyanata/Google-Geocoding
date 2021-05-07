package za.co.jaliatechologies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import za.co.jaliatechologies.dto.GeocodeDto;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

@RestController
public class GeocodeController{

    @Autowired
    GeocodingClient geocodingClient;

    @RequestMapping(path = "/geocode", method = RequestMethod.GET)
    public GeocodeDto getGeocodeApi(@RequestParam("address") String address, HttpServletRequest request) {
        GeocodeDto dto = geocodingClient.getGeocode( address,"en","e30b61be71msh217f23392675a25p16dd37jsn3b587363808a",
                "google-maps-geocoding.p.rapidapi.com").getBody();
        return dto;
    }
}
