package client

import behavior.fly.FlyNoWay
import behavior.quack.Squeak

class RubberDuck : Duck() {

    init {
        setFlyBehavior(FlyNoWay())
        setQuackBehavior(Squeak())
    }

    override fun display() {
        println("RedheadDuck display")
    }
}
