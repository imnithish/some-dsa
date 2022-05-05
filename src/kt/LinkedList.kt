package kt

class LinkedList<T : Any> {

    private var head: Node? = null
    private var tail: Node? = null
    private var size = 0

    fun insertFirst(value: T) {
        val node = Node(value)
        node.next = head
        head = node
        if (tail == null) {
            tail = head
        }
        size += 1
    }

    fun display() {
        var temp = head
        while (temp != null) {
            print(temp.value.toString() + " -> ")
            temp = temp.next
        }
        println("END")
    }

    private inner class Node {
        var value: T
        var next: Node? = null

        constructor(value: T) {
            this.value = value
        }

        constructor(value: T, next: Node?) {
            this.value = value
            this.next = next
        }
    }
}


fun main() {

    val ll = LinkedList<Int>()
    ll.insertFirst(3)
    ll.insertFirst(4)
    ll.insertFirst(5)

    ll.display()
}