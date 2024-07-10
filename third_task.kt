class Solution {
    fun minimumOperations(nums: IntArray): Int {
        var counter = 0
        var list = nums.toList()
        while (true) {
            val minimum = list.filter { x -> x > 0 }.minOrNull()
            if (minimum == null) {
                break
            }
            list = list.map { x -> if (x > 0) x - minimum else x }
            counter++
        }
        return counter
    }
}