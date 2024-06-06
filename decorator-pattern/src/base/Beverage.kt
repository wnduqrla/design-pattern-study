package base

abstract class Beverage {
    abstract fun getDescription(): String
    abstract fun cost(): Int

    override fun toString(): String = "${getDescription()} ₩${cost()}"
}
