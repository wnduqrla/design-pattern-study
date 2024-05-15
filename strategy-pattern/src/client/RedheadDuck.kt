package client

import behavior.fly.FlyWithWings
import behavior.quack.Quack

class RedheadDuck : Duck() {

    init {
        setFlyBehavior(FlyWithWings())
        setQuackBehavior(Quack())
    }

    override fun display() {
        println("RedheadDuck display")
    }
}
