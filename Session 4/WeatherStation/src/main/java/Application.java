import data.WeatherData;
import logic.WeatherService;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class Application {
    public static void main(String[] args) {
        ArrayList<WeatherData> wd1 = new ArrayList<>();
        LinkedList<WeatherData> wd2 = new LinkedList<>();
        Vector<WeatherData> wd3 = new Vector<>();
        Stack<WeatherData> wd4 = new Stack<>();
        WeatherService weatherService = new WeatherService();
        weatherService.getAverageTemperature(wd1);
        weatherService.getAverageTemperature(wd2);
        weatherService.getAverageTemperature(wd3);
        weatherService.getAverageTemperature(wd4);
    }
}
