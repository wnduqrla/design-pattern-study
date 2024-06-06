package decorator

import base.Beverage
import base.CondimentDecorator

class Mocha(
    override val beverage: Beverage,
) : CondimentDecorator(beverage) {
    override fun getDescription(): String = "${beverage.getDescription()}, 모카"
    override fun cost(): Int = beverage.cost() + 500
}
