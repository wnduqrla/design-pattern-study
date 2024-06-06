import base.Beverage
import beverage.Espresso
import beverage.HouseBlend
import decorator.Mocha
import decorator.Whip

fun main() {
    val beverage: Beverage = Espresso()
    println(beverage)

    var beverage2: Beverage = HouseBlend()
    beverage2 = Mocha(beverage2)
    beverage2 = Mocha(beverage2)
    beverage2 = Whip(beverage2)
    println(beverage2)
}
