package trie.kt

class Trie {

    private val root: Node = Node()

    fun insert(word: String) {
        var curr: Node? = root
        for (element in word) {
            if (curr?.children?.get(element - 'a') == null) curr?.children?.set(element - 'a', Node())
            if (curr != null) {
                curr = curr.children[element - 'a']
            }
        }
        curr?.isWord = true
    }

    private fun getNode(word: String): Node? {
        var curr: Node? = root
        for (element in word) {
            if (curr?.children?.get(element - 'a') == null) return null
            curr = curr.children[element - 'a']
        }
        return curr
    }

    fun search(word: String): Boolean {
        val node: Node? = getNode(word)
        return node != null && node.isWord
    }

    fun startsWith(word: String): Boolean {
        val node: Node? = getNode(word)
        return node != null
    }

    internal class Node(
        var isWord: Boolean = false,
    ) {
        var children: Array<Node?> = arrayOfNulls(26)
    }
}

fun main() {
    val trie = Trie()
    trie.insert("cat")
    trie.insert("cars")
    trie.insert("cushion")
    trie.insert("cooker")

    println(trie.search("cooker"))


    println(trie.startsWith("cars"))
}