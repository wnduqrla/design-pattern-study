package decorator

import base.Beverage
import base.CondimentDecorator

class Whip(
    override val beverage: Beverage,
) : CondimentDecorator(beverage) {
    override fun getDescription(): String = "${beverage.getDescription()}, 휘핑크림"
    override fun cost(): Int = beverage.cost() + 300
}
