import observer.CurrentConditionDisplay
import subject.WeatherData

fun main() {
    val weatherData = WeatherData()
    val currentConditionDisplay = CurrentConditionDisplay(weatherData)

    weatherData.setMeasurements(
        temperature = 80f,
        humidity = 65f,
        pressure = 30.4f,
    )
}
