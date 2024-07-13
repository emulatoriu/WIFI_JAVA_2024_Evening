package citiesAndResidents.data.logic;

import citiesAndResidents.data.City;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CityService {
    public List<City> getCitiesOrderdByResidentsCountAscendive(List<City> cities) {
        return cities.stream()
                .collect(Collectors.toMap(city -> city, city->city.residentsCount()))
                .entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .map(cityIntegerEntry -> cityIntegerEntry.getKey())
                .collect(Collectors.toList());
    }

    public List<City> getCitiesOrderdByResidentsCountDescendive(List<City> cities) {
        List<City> orderedCitiesDescendive = getCitiesOrderdByResidentsCountAscendive(cities);
        Collections.reverse(orderedCitiesDescendive);
        return orderedCitiesDescendive;

    }
}
