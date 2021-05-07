package za.co.jaliatechologies;

import feign.Headers;
import feign.Param;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import za.co.jaliatechologies.dto.GeocodeDto;

import java.util.List;

@FeignClient(url = "https://google-maps-geocoding.p.rapidapi.com/",
        name = "geocode-client")
public interface GeocodingClient {

    @RequestMapping(method = RequestMethod.GET, value = "/geocode/json")
    public ResponseEntity <GeocodeDto> getGeocode(

            @RequestParam("address") String address, @RequestParam("language") String language, @RequestHeader("x-rapidapi-key") String key,
            @RequestHeader("x-rapidapi-host") String host);
}
