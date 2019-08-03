package algorithm

class Solution7 {
    fun solution(n: Int): String {
        var answer = ""
        val pattern = arrayOf("수", "박")
        for (i in 0 until n) {
            answer += pattern[i % pattern.size]
        }
        return answer
    }
}

fun main() {
    val s = Solution7()
    println(s.solution(3))
    println(s.solution(4))
}

