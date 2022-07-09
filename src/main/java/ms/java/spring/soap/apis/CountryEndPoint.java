package ms.java.spring.soap.apis;

import ms.java.spring.soap.models.GetCountryRequest;
import ms.java.spring.soap.models.GetCountryResponse;
import ms.java.spring.soap.repository.CountryRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class CountryEndPoint {

    private static final String NAMESPACE_URI = "http://www.baeldung.com/springsoap/ha";

    private CountryRespository countryRepository;

    @Autowired
    public CountryEndPoint(CountryRespository countryRepository) {
        this.countryRepository = countryRepository;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getCountryRequest")
    @ResponsePayload
    public GetCountryResponse getCountry(@RequestPayload GetCountryRequest request) {
        GetCountryResponse response = new GetCountryResponse();
        response.setCountry(countryRepository.getCountry(request.getName()));

        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getCountryRequest1")
    @ResponsePayload
    public GetCountryResponse getCountry1(@RequestPayload GetCountryRequest request) {
        GetCountryResponse response = new GetCountryResponse();
        response.setCountry(countryRepository.getCountry1(request.getName()));

        return response;
    }
}
