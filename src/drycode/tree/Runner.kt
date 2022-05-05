package drycode.tree

fun makeBeverageTree(): TreeNode<String> {
    val tree = TreeNode("Beverages")

    val hot = TreeNode("hot")
    val cold = TreeNode("cold")

    val tea = TreeNode("tea")
    val coffee = TreeNode("coffee")
    val chocolate = TreeNode("chocolate")

    val blackTea = TreeNode("blackTea")
    val greenTea = TreeNode("greenTea")
    val chaiTee = TreeNode("chaiTee")

    val soda = TreeNode("soda")
    val milk = TreeNode("milk")

    val gingerAle = TreeNode("gingerAle")
    val bitterLemon = TreeNode("bitterLemon")

    tree.add(hot)
    tree.add(cold)

    hot.add(tea)
    hot.add(coffee)
    hot.add(chocolate)

    cold.add(soda)
    cold.add(milk)

    tea.add(blackTea)
    tea.add(greenTea)
    tea.add(chaiTee)

    soda.add(gingerAle)
    soda.add(bitterLemon)

    return tree
}

fun main() {
    val tree = makeBeverageTree()

    tree.search("chaiTee")

}