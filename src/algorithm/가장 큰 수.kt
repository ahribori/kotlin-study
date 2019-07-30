package algorithm

class Solution5 {
    fun solution(numbers: IntArray): String {
        return numbers
            .map { it.toString() }
            .sortedWith(Comparator { a, b -> (b + a).toInt() - (a + b).toInt() })
            .joinToString ("") { it }
    }
}

fun main() {
    val s = Solution5()
    print(s.solution(intArrayOf(6, 10, 2)))
}

