package client

import behavior.fly.FlyBehavior
import behavior.quack.QuackBehavior

abstract class Duck {

    private var flyBehavior: FlyBehavior? = null
    private var quackBehavior: QuackBehavior? = null

    abstract fun display()

    fun setFlyBehavior(flyBehavior: FlyBehavior) {
        this.flyBehavior = flyBehavior
    }

    fun setQuackBehavior(quackBehavior: QuackBehavior) {
        this.quackBehavior = quackBehavior
    }

    fun swim() {
        println("swim")
    }

    fun performFly() {
        flyBehavior?.fly()
    }

    fun performQuack() {
        quackBehavior?.quack()
    }
}
