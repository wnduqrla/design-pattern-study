import client.Duck
import client.MallardDuck

fun main() {
    duckTest(MallardDuck())
}

private fun duckTest(duck: Duck) {
    duck.display()
    duck.swim()
    duck.performFly()
    duck.performQuack()
}
