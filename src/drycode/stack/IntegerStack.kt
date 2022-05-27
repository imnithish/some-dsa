package drycode.stack

class IntegerStack {
    private val list = mutableListOf<Int>()
    var min: Int? = null
    fun push(value: Int) {

        if (list.isEmpty())
            min = value
        else
            if (value < min!!) {
                push(2 * value - min!!)
                min = value
            }


        list.add(value)
    }

    fun pop(): Int {
        require(list.isNotEmpty())

        return list.removeAt(list.size - 1).also {

            if (it < min!!)
                min = 2 * min!! - it
        }
    }
}

fun main() {

    val s = IntegerStack()
    s.push(7)
    s.push(45)
    s.push(8)
    s.push(4)
    s.pop()
    print(s.min)
}