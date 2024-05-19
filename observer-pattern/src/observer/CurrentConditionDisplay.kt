package observer

import subject.Subject
import subject.WeatherData

class CurrentConditionDisplay(
    weatherData: WeatherData
) : Observer, DisplayElement {

    private var temperature: Float? = null
    private var humidity: Float? = null

    init {
        weatherData.registerObserver(this)
    }

    override fun update(subject: Subject) {
        temperature = (subject as? WeatherData)?.getTemperature()
        humidity = (subject as? WeatherData)?.getHumidity()

        display()
    }

    override fun display() {
        println("현재 상태: 온도 ${temperature}F, 습도 ${humidity}%")
    }
}
