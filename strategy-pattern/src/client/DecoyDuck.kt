package client

import behavior.fly.FlyNoWay
import behavior.quack.MuteQuack

class DecoyDuck : Duck() {

    init {
        setFlyBehavior(FlyNoWay())
        setQuackBehavior(MuteQuack())
    }

    override fun display() {
        println("DecoyDuck display")
    }
}
