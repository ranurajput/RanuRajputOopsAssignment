package knoldus

class SquareQueue extends Queue {
  override def enqueue(key: Int): Unit = {
    if (this.rear == -1) {
      this.front = front + 1
      this.rear = rear + 1
      queue = queue ::: List(key*key)
      return
    }
    queue = queue ::: List(key*key)
    this.rear = queue.length - 1
  }


}
