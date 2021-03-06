package drycode.tree

import drycode.queue.QueueImpl


typealias Visitor<T> = (TreeNode<T>) -> Unit

class TreeNode<T>(value: T) {

    private val children: MutableList<TreeNode<T>> = mutableListOf()

    fun add(child: TreeNode<T>) = children.add(child)

    fun forEachDepthFirst(visit: Visitor<T>) {
        visit(this)
        children.forEach {
            it.forEachDepthFirst(visit)
        }
    }

    fun forEachLevelOrder(visit: Visitor<T>) {
        visit(this)
        val queue = QueueImpl<TreeNode<T>>()

        children.forEach {
            queue.enqueue(it)
        }

        var node = queue.dequeue()

        while (node != null) {
            visit(node)
            node.children.forEach { queue.enqueue(it) }
            node = queue.dequeue()
        }
    }

    fun search(value: T): TreeNode<T>? {
        var result: TreeNode<T>? = null

        forEachDepthFirst {
            if (it == value) {
                result = it
                println("Found value $value")
            }
        }

        return result
    }

}