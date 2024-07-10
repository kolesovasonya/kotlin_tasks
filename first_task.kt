class Solution {
    fun Boolean.toInt() = if (this) 1 else 0

    fun twoOutOfThree(nums1: IntArray, nums2: IntArray, nums3: IntArray): List<Int> {
        val numSet: MutableSet<Int> = mutableSetOf()
        val answer: MutableList<Int> = mutableListOf()
        numSet.addAll(nums1.toList())
        numSet.addAll(nums2.toList())
        numSet.addAll(nums3.toList())
        for (num in numSet) {
            if (nums1.contains(num).toInt() + nums2.contains(num).toInt() + nums3.contains(num).toInt() >= 2) {
                answer.add(num)
            }
        }
        return answer
    }
}