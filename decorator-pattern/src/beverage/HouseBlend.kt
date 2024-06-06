package beverage

import base.Beverage

class HouseBlend : Beverage() {
    override fun getDescription(): String = "하우스 블렌드 커피"
    override fun cost(): Int = 5000
}
