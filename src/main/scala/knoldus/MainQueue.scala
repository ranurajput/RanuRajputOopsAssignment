package knoldus

object MainQueue {

    def main(args: Array[String]): Unit = {
      //DoubleQueue class's methods
      val doubleQueue = new DoubleQueue
      println("OOPS Assignment 1 done by Ranu Rajput")
      println("The double queue -->")
      doubleQueue.enqueue(17)
      doubleQueue.enqueue(34)
      doubleQueue.enqueue(51)
      doubleQueue.enqueue(68)
      doubleQueue.enqueue(85)
      doubleQueue.enqueue(102)

      for (value <- doubleQueue.queue) print(value + "=>")
      println()

      doubleQueue.dequeue()
      for (value <- doubleQueue.queue) print(value + "=>")
      println()

      doubleQueue.dequeue()
      for (value <- doubleQueue.queue) print(value + "=>")
      println()

      doubleQueue.dequeue()
      for (value <- doubleQueue.queue) print(value + "=>")
      println()

      // SquareQueue class's methods
      val squareQueue = new SquareQueue
      println("The squared queue -->")
      squareQueue.enqueue(11)
      squareQueue.enqueue(12)
      squareQueue.enqueue(13)
      squareQueue.enqueue(14)
      squareQueue.enqueue(15)
      squareQueue.enqueue(16)
      squareQueue.enqueue(17)
      squareQueue.enqueue(18)
      squareQueue.enqueue(19)
      squareQueue.enqueue(20)

      for (value <- squareQueue.queue) print(value + "=>")
      println()

      squareQueue.dequeue()
      for (value <- squareQueue.queue) print(value + "=>")
      println()

      squareQueue.dequeue()
      for (value <- squareQueue.queue) print(value + "=>")
      println()

      squareQueue.dequeue()
      for (value <- squareQueue.queue) print(value + "=>")
      println()

      squareQueue.dequeue()
      for (value <- squareQueue.queue) print(value + "=>")
      println()
      println(squareQueue.front)
      println(squareQueue.rear)
    }


  }
