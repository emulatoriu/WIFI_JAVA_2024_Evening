package logic;

import data.WeatherData;

import java.util.List;

public class WeatherService {
    public double getAverageTemperature(List<WeatherData> weatherData) {
        double sum =0;
        for(WeatherData wd : weatherData) {
            sum += wd.temperature();
        }
        return sum / weatherData.size();
//        return weatherData.stream()
//                .mapToDouble(weatherData1 -> weatherData1.temperature())
//                .average()
//                .getAsDouble();
    }
}
