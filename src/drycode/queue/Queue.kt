package drycode.queue

interface Queue<T : Any> {

    val count: Int

    fun peek(): T?

    fun enqueue(element: T)

    fun dequeue(): T?

    val isEmpty: Boolean
        get() = count == 0
}