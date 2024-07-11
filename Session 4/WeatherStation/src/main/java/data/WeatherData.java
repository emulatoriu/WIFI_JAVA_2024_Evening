package data;

import java.time.LocalDate;

public record WeatherData(LocalDate localData, double temperature, int humidity, double windspeed) {
}
