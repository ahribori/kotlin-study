package algorithm

class Solution5 {
    fun solution(numbers: IntArray): String {
        val answer = numbers
            .map { it.toString() }
            .sortedWith(Comparator { a, b -> (b + a).toInt() - (a + b).toInt() })
            .joinToString ("") { it }
        return if (answer.startsWith('0')) '0'.toString() else answer
    }
}

fun main() {
    val s = Solution5()
    print(s.solution(intArrayOf(6, 10, 2)))
}

