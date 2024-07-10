class Solution {
    fun minTimeToVisitAllPoints(points: Array<IntArray>): Int {
        var answer = 0
        for (i in 1..<points.count()) {
            val firstPointX = points[i-1][0]
            val firstPointY = points[i-1][1]
            val secondPointX = points[i][0]
            val secondPointY = points[i][1]

            answer += max(abs(firstPointX - secondPointX), abs(firstPointY - secondPointY))
        }
        return answer
    }
}