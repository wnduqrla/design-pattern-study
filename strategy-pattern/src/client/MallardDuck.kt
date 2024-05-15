package client

import behavior.fly.FlyWithWings
import behavior.quack.Quack

class MallardDuck : Duck() {

    init {
        setFlyBehavior(FlyWithWings())
        setQuackBehavior(Quack())
    }

    override fun display() {
        println("MallardDuck display")
    }
}
