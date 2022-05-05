package kt


// LIFO
class Stack<T : Any> {

    private val list = mutableListOf<T>()

    fun push(value: T) {
        list.add(value)
    }

    fun pop(): T {
        require(list.isNotEmpty())
        return list.removeAt(list.size - 1)
    }
}


fun main() {
    val s = Stack<Int>()
    s.push(12)
    println(s.pop())
}