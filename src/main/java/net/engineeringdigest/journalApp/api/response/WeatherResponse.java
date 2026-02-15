package net.engineeringdigest.journalApp.api.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
public class WeatherResponse {
    @Getter
    @Setter
    private Current current;
    public class Current{
        private int temperature;
        @JsonProperty("weather_description")
        private List<String> weatherDescription;
        @Getter
        @Setter
        private int feelsLike;
    }
}
