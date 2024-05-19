package subject

import observer.Observer

class WeatherData : Subject {

    private val observers: MutableList<Observer> = mutableListOf()

    private var temperature: Float? = null
    private var humidity: Float? = null
    private var pressure: Float? = null

    override fun registerObserver(observer: Observer) {
        observers.add(observer)
    }

    override fun removeObserver(observer: Observer) {
        observers.remove(observer)
    }

    override fun notifyObservers() {
        observers.forEach {
            it.update(this)
        }
    }

    fun getTemperature(): Float? = temperature

    fun getHumidity(): Float? = humidity

    fun getPressure(): Float? = pressure

    fun setMeasurements(temperature: Float, humidity: Float, pressure: Float) {
        this.temperature = temperature
        this.humidity = humidity
        this.pressure = pressure

        measurementsChanged()
    }

    private fun measurementsChanged() {
        notifyObservers()
    }
}
