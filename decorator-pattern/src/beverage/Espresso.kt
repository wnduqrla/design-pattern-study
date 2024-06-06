package beverage

import base.Beverage

class Espresso : Beverage() {
    override fun getDescription(): String = "에스프레소"
    override fun cost(): Int = 4000
}
