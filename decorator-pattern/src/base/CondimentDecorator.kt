package base

abstract class CondimentDecorator(
    open val beverage: Beverage
) : Beverage()
