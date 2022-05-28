internal class TwoSum {
    fun twoSum(numbers: IntArray, target: Int): IntArray? {
        val indexMap = HashMap<Int, Int>()
        for (i in numbers.indices) {
            val requiredNum = target - numbers[i]
            if (indexMap.containsKey(requiredNum)) {
                return intArrayOf(indexMap[requiredNum]!!, i)
            }
            indexMap[numbers[i]] = i
        }
        return null
    }
}

internal fun main(){
    val ts = TwoSum()

 for (i in ts.twoSum(intArrayOf(2,7,11,15), 9)!!)
     println(i)
}