package behavior.quack

class MuteQuack : QuackBehavior {
    override fun quack() {
        println("can't quack")
    }
}
