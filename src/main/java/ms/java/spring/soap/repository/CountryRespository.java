package ms.java.spring.soap.repository;

import ms.java.spring.soap.models.Country;
import ms.java.spring.soap.models.Currency;
import org.springframework.stereotype.Repository;

@Repository
public class CountryRespository {

    public Country getCountry(String name) {
        Country india = new Country();
        india.setCapital("Delhi");
        india.setCurrency(Currency.EUR);
        india.setPopulation(1000);
        return india;
    }

    public Country getCountry1(String name) {
        Country pakistan = new Country();
        pakistan.setCapital("Karachi");
        pakistan.setCurrency(Currency.EUR);
        pakistan.setPopulation(1000);
        return pakistan;
    }

}
